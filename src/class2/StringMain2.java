package class2;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String a = s.next();
		System.out.print("현재 문자열 입력 : ");
		String b = s.next();
		System.out.print("바꿀 문자열 입력 : ");
		String c = s.next();
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		c = c.toLowerCase();
		
		int cnt = (a.length() - a.replace(b, "").length())/b.length();
		
		System.out.println();
	
		if(cnt==0) {
			System.out.println("입력한 문자열의 크기가 작습니다");
			System.out.println("치환 할 수 없습니다");
		}
		else {
			System.out.println(a.replace(b, c));
			System.out.println(cnt + "개 치환했습니다.");
		}

	}

}
/*
치환하는 프로그램을 작성하시오 - indexOf(), replace() // indexOf(?, ?) 오버로드 사용 , 치환 갯수는 whlie 쓰는게 편하
String 클래스의 메소드를 이용하시오 // 문자열 입력 -> 대문자 혹은 소문자로 변경 해서 진행 
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

indexOf()
replace()
*/