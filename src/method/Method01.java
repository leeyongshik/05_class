package method;

public class Method01 {

	public static void main(String[] args) {
		int a=25, b=36; // 지역변수, local variable
		Method01 m = new Method01();//생성
		
		int sum = m.sum2(25, 36); // 호출
		int sub = m.sub2(25, 36); // 호출
		int mul = m.mul2(25, 36); // 호출
		double div = m.div2(25, 36); // 호출
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}
	
	public int sum2(int a, int b){//구현, 인수(argument), 매개변수(parameter)
		return a+b;
	}
	public int sub2(int a, int b){//구현, 인수(argument), 매개변수(parameter)
		return a-b;
	}
	public int mul2(int a, int b){//구현, 인수(argument), 매개변수(parameter)
		return a*b;
	}
	public double div2(double a, int b){//구현, 인수(argument), 매개변수(parameter)
		return a/b;
	}

}
