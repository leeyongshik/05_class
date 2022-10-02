package constructor;

public class ExamMain {

	public static void main(String[] args) {
		Exam e = new Exam();
		
		
		System.out.println();
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		System.out.print(e.getName()+"\t");
		e.compare();
		System.out.println(e.getScore());
		

	}

}
/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'

클래스명 : Exam
* 필드
private String name;
private String dap;
private char[] ox;
private int score;
private final String JUNG="11111"; //상수화

* 메소드
생성자 - Scanner 쓰기
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
이름 입력 : 홍길동
답 입력 : 12311                                                                                                                                                                                                                                                                           

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
 */