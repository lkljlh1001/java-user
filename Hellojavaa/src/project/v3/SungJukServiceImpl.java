package project.v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SungJukServiceImpl implements SungJukService {

	// 각종 오류 메세지를 상수로 정의해 둠

	private String fpath1 = "c:\\java\\sungjuk.txt";
	// 파일 입출력으로 저장시
	private String fpath2 = "c:\\java\\sungjuk.dat";
	// 직력화 사용해서 저장시

	private final String FILENOTFOUND = "\n파일이 존재하지 않습니다!\n";
	private final String FILEIOERROR = "\n기타 파일입출력 오류입니다!\n";
	private final String ANYWAYERROR = "\n암튼 오류입니다!!\n";
	private final String WRONGINPUT = "\n잘못입력하셨습니다!!\n\n\n";

	// 성적데이터를 저장하기 위해 ArrayList 객체 사용
	private List<SungJukVO> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = initSungJukFromFile();
		sjdb = initSungJukFromSerialized();

	}

	@Override
	public void addSungJuk(SungJukVO sj) {
		processSungJuk(sj);
		sjdb.add(sj);
	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";

		for (SungJukVO sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}

		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n잘못된 값 입력!!";

		String fmt = "\n\n%d : %s %d %d %d %d %.1f %s";
		SungJukVO sj = sjdb.get(no - 1);

		StringBuffer sb = new StringBuffer();
		sb.append(String.format(fmt, no, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getTot(), sj.getAvrg(),
				sj.getGrade()));

		return sb.toString();
	}

	@Override
	public void modifySungJuk(SungJukVO sj, int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		processSungJuk(sj); // 성적 재계산
		sjdb.set(no - 1, sj);

		System.out.println("\n성적데이터가 수정되었습니다\n\n");
	}

	@Override
	public void removeSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size())) {
			System.out.println(WRONGINPUT);
			return;
		}

		sjdb.remove(no - 1);

		System.out.println("\n성적데이터가 삭제되었습니다\n\n");
	}

	private void processSungJuk(SungJukVO sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {
		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrade(grd);
	}

	private boolean checkSungJukNo(int no, int size) {
		boolean isFail = false;
		if (no <= 0 || (no > size)) {
			isFail = true;
		}
		return isFail;
	}

	private List<SungJukVO> initSungJukFromSerialized() {
		List<SungJukVO> sjdb = new ArrayList<SungJukVO>();

		try (FileInputStream fjs = new FileInputStream(fpath2); ObjectInputStream ois = new ObjectInputStream(fjs)) {
			sjdb = (List<SungJukVO>) ois.readObject();
		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);

		}
		return sjdb;

	}

	private List<SungJukVO> initSungJukFromFile() {
		List<SungJukVO> sjdb = new ArrayList<>();

		try (FileReader fr = new FileReader(fpath1); BufferedReader br = new BufferedReader(fr);) {
			while (br.ready()) {
				String[] sjrow = br.readLine().split("/");
				SungJukVO sj = new SungJukVO(sjrow[0], Integer.parseInt(sjrow[1]), Integer.parseInt(sjrow[2]),
						Integer.parseInt(sjrow[3]));
				sj.setTot(Integer.parseInt(sjrow[4]));
				sj.setAvrg(Double.parseDouble(sjrow[4]));
				sj.setGrade(sjrow[4]);

				sjdb.add(sj);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);
		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);
		}
		return sjdb;
	}

	@Override
	protected void finalize() throws Throwable {
		writeSungJukToSerialized();

		super.finalize();
	}

	private void writeSungJukToFile() {
		try (FileWriter fw = new FileWriter(fpath1); BufferedWriter bw = new BufferedWriter(fw);

		) {
			StringBuffer out = new StringBuffer();

			for (SungJukVO sj : sjdb) {
				out.append(sj.getName()).append("/").append(sj.getName()).append("/").append(sj.getKor()).append("/")
						.append(sj.getEng()).append("/").append(sj.getMat()).append("/").append(sj.getTot()).append("/")
						.append(sj.getAvrg()).append("/").append(sj.getGrade()).append("\n");
				bw.write(out.toString());
				out.setLength(0);

			} // for
		} catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);

		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);

		}
	}

	private void writeSungJukToSerialized() {
		try (FileOutputStream fos = new FileOutputStream(fpath2); ObjectOutputStream oos = new ObjectOutputStream(fos);

		) {
			oos.writeObject(sjdb);
		}

		catch (FileNotFoundException fnfe) {
			System.out.println(FILENOTFOUND);

		} catch (IOException ioe) {
			System.out.println(FILEIOERROR);
		} catch (Exception ex) {
			System.out.println(ANYWAYERROR);

		}
	}
}