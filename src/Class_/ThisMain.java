package Class_;


class This {
	private int a;
	
	
	
	public void setA (int a){
		System.out.println("this = " + this);
		this.a = a;
	}
	
	
	public int getA(){
		return a; // this 생략
	}
	
	
	
}
//---------------------------------
public class ThisMain {

	public static void main(String[] args) {
		This t = new This();
		System.out.println("객체 t = " + t);
		t.setA(10);
		System.out.println(t.getA());
		System.out.println();
		
		This s = new This();
		System.out.println("객체 s = " + s);
		s.setA(20);
		System.out.println(s.getA());
		
	}

}
