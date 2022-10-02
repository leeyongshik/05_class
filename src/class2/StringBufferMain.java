package class2;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력 : ");
		int dan = s.nextInt();
		this.dan = dan;
		System.out.println();
	}
	
	public void output() {
		StringBuffer buffer = new StringBuffer();
		
		for (int i =1 ; i <= 9; i++ ) {
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString());
			buffer.delete(0, buffer.length());// StringBuffer => String으로 변환해서 출력
			//System.out.println(dan+" * "+i +" = " + dan*i);
			
		}//for i
	}
	
	
	
	public static void main(String[] args) {
		StringBufferMain stringBufferMain = new StringBufferMain();
		stringBufferMain.input();
		stringBufferMain.output();
		
		
	}

}

/*
원하는 단을 입력 : 5 	input()
----------------------------
5*1 = 5				output()
...
5*9 = 45



*/