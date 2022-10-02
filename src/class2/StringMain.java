package class2;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; // literal 생성
		String b = "apple";
		
		if(a==b) System.out.println("a와 b의 참조값은 같다");
		else System.out.println("a와 b의 참조값은 다르다");
		
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다르다");
		System.out.println();
		
		
		String c = new String("apple");
		String d = new String("apple");

		if(c==d) System.out.println("c와 d의 참조값은 같다");
		else System.out.println("c와 d의 참조값은 다르다");
		
		if(c.equals(d)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		
		
		String e = "오늘 날짜는 " + 2022 + 9 + 27;
		System.out.println("e = " + e);
		System.out.println("문자열 크기 = " + e.length());
		
		for(int i = 0; i < e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i));
		}// for i
		
		System.out.println();
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7,11));
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); // 없으면 -1
		
		System.out.println("문자열 검색 = " + e.replace("날짜", "일자"));
		
		
		
	}

}
