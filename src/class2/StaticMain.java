package class2;

class StaticTest{
	private int a; // 필드, 인스턴스 변수 
	private static int b; // 필드 , 클래스 변수 
	
	static {
		System.out.println("초기화 영역");
		b = 7;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a = 7;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = " + this.a + "\t b = " + StaticTest.b);
	}
	
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a = " + a + "\t b = " +b); -> Static 메소드 안에서는 Static 변수만 사용이 가능하다.
		// a 는 Static 변수가 아니라서 error 
	}
}


//-------------------
public class StaticMain {

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		
		StaticTest.output(); // 클래스명.메소드() 사용가능
		st.output(); // 객체.메소드() 사용가능 
		
	}

}
