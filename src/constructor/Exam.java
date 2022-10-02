package constructor;

import java.util.Scanner;

public class Exam {
	private String name;
	private String dap;
	private char[] ox;
	private int score;
	private final String JUNG="11111"; //상수화
	
	public Exam() {
		this.ox = new char[5];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("답 입력 : ");
		String dap = s.next();
		this.name = name;
		this.dap = dap;
	}
	
	public void compare() {
		int count = 0;
		for (int i=0; i < ox.length; i++) {
		if (dap.charAt(i) == JUNG.charAt(i)) {
			ox[i]='O';
			count++;
		}
		else ox[i]='X';
		
		this.score = count*20;
		
		System.out.print(ox[i]+"\t");
		}
	}

	public String getName() {
		return name;
	}

	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}
	
	
	
}
