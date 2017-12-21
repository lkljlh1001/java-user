package project.v1b;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void addCustomer(CustomerV0 sj) {
		processCustomer(sj);
		System.out.println("새로운 고객데이터가 추가되었습니다");
	}

	private void processCustomer(CustomerV0 sj) {

	}

	@Override
	public String getNum() {
		String out = "번호가 등록되었습니다";
		return out;
	}

	@Override
	public String getNum(String num) {
		System.out.println("번호가 조회 되었습니다");
		return null;

	}

	@Override
	public String getName() {
		String out = "이름이 등록되었습니다";
		return out;

	}

	@Override
	public String getName(String name) {
		System.out.println("이름이 조회 되었습니다");
		return null;
	}

	@Override
	public String getJumin() {
		String out = "주민번호가 등록되었습니다";
		return out;
	}

	@Override
	public String getJumin(String jumin) {
		System.out.println("주민번호가 조회되었습니다");
		return null;
	}

	@Override
	public String getAdr() {
		String out = "주소가 등록되었습니다";
		return out;
	}

	@Override
	public String getAdr(String adr) {
		System.out.println("주소가 조회되었습니다");
		return null;
	}

	@Override
	public String getPhon() {
		String out = "핸드폰번호가 등록되었습니다";
		return out;
	}

	@Override
	public String getPhon(String phon) {
		System.out.println("핸드폰번호가 조회되었습니다");
		return null;
	}

	@Override
	public void modifyCustomer(CustomerService sj) {
		System.out.println("고객 데이터가 수정되었습니다");
	}

	@Override
	public void removeCystomer(CustomerService name) {
		System.out.println("고객 데이터가 삭제 되었습니다.");
	}

}