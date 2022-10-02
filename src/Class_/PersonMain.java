package Class_;



class Person{
	private String name; // 필드, 초기화, null
	private int age;//필드, 초기화, 0 
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
	public void setName(String n) {//구현
		name = n;
	}
	public void setAge(int n) {
		age = n;
	}
	public void setData(String a, int b) {//overload
		name = a;
		age = b;
	}
	public void setData() {}//overload -> 똑같은 메소드가 여러개 존재할떄
	
}
//------------------------------------
public class PersonMain {

	public static void main(String[] args) {	
		//int aa; // 정수형 변수
		//double aa ; //실수형 변수
		Person aa; // 객체형 변수
		aa= new Person(); // 메모리 생성
		System.out.println("객체 aa = " + aa);
		
		aa.setName("홍길동");//호출
		aa.setAge(25);
		
		System.out.println("이름은 = " + aa.getName());
		System.out.println("나이는 = " + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		
		bb.setName("가나다");//호출
		bb.setAge(50);
		
		System.out.println("이름은 = " + bb.getName());
		System.out.println("나이는 = " + bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		
		cc.setData("둘리",100);
		
		System.out.println("이름은 = " + cc.getName());
		System.out.println("나이는 = " + cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		
		dd.setData();
		
		System.out.println("이름은 = " + dd.getName());
		System.out.println("나이는 = " + dd.getAge());
		System.out.println();
		
		
	}

}


