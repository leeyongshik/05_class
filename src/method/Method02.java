package method;

public class Method02 {

	public static void disp() {//구현 
		System.out.println("non-static method");
	}
	
	public static void output() {//구현 
		System.out.println("static method");
	}
	
	public static void main(String[] args) {	

		//호출 
		Method02.output();
		output(); // static 일 경우
		Method02 m = new Method02(); // static이 아닌 경우 new 해줘야한다.
		m.disp();
	}

}
