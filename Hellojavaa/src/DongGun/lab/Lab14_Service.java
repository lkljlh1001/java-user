package DongGun.lab;

public class Lab14_Service {

	// 6-4
	// getTotal

	int tot = 0;
	float avg = 0;

	public int getTotal1(int kor, int eng, int math) {
		tot = kor + eng + math;
		return tot;
	}

	public float gerAverage() {

		avg = (float) tot / 3;
		return avg;
	}
}