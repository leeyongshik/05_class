package Class_;

public class SungjukMain2 {

	public static void main(String[] args) {
//		
//		Sungjuk aa = new Sungjuk(); // 객체 
//		Sungjuk bb = new Sungjuk();
//		Sungjuk cc = new Sungjuk();
//		
		
		
		Sungjuk[] ar = new Sungjuk[3]; // 객체 배열
		ar[0] = new Sungjuk();
		ar[1] = new Sungjuk();
		ar[2] = new Sungjuk();
		
		
		ar[0].setData("홍길동", 90, 95, 100); //호출
		ar[1].setData("프로도", 100, 89, 75);
		ar[2].setData("죠르디", 75, 80, 48);
		
		for(int i = 0; i< 3;i++) {
		ar[i].calc();
		System.out.println(ar[i].getName()+"\t"+ar[i].getKor()+"\t"+ar[i].getEng()+"\t"
				+ar[i].getMath()+"\t"+ar[i].getTot()+"\t"+ar[i].getAvg()+"\t"+ar[i].getGrade());
		}//for i
		System.out.println();
		
		for(Sungjuk s : ar) {
			s.calc();
			System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"
					+s.getMath()+"\t"+s.getTot()+"\t"+s.getAvg()+"\t"+s.getGrade());
		}

	}

}
