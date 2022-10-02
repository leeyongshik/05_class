package Class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Compute c = new Compute();
		
		Compute[] ar = new Compute[3]; // 객체 배열 생성, 결합도 1:1 관계
		
		
		for( int i=0; i<ar.length; i++) {
			
		ar[i] = new Compute();
		
		System.out.print("x 입력 : ");
		int x = s.nextInt();
		ar[i].setX(x); //  =>  ar[i].setX(s.nextInt()); 동일한 문장
		System.out.print("y 입력 : ");
		int y = s.nextInt();
		ar[i].setY(y);
		
		ar[i].calc();
		System.out.println();

		}
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		for (int i=0; i<3; i++) {
		System.out.println(ar[i].getX() + "\t" + ar[i].getY() + "\t" + ar[i].getSum() + "\t" + 
									ar[i].getSub() + "\t" +ar[i].getMul() + "\t" +String.format("%.2f", ar[i].getDiv()));
		}
		
		System.out.println();
		for( Compute data : ar) {
			System.out.println(data.getX() + "\t" + data.getY() + "\t" + data.getSum() + "\t" + 
					data.getSub() + "\t" +data.getMul() + "\t" +String.format("%.2f", data.getDiv()));
		}
		
	}
}
/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
       double div
메소드 : setX(~)
       setY(~)
       calc() - 합차곱몫을 계산
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/