package Class_;

public class Sungjuk {
	private String name,grade;
	private int kor, eng, math, tot;
	private double avg;
	
	public void setData(String a, int b, int c, int d) {
		name = a;
		kor = b;
		eng = c;
		math = d;
	}
	public void calc() { 
		tot = kor + eng + math;
		avg = (double)(tot)/3;
		if (avg >=90) grade= "A";
		else if (avg >=80) grade= "B";
		else if (avg >=70) grade= "C";
		else if (avg >=60) grade= "D";
		else grade = "F";
	}
	
	
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public String getAvg() {
		return String.format("%.2f", avg);
	}

}
