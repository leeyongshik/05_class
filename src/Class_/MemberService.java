package Class_;

import java.util.Scanner;

public class MemberService {
    private MemberDTO[] ar = new MemberDTO[5];//객체 배열

    

    // 필드는 이제 끝 -> 메소드만 설정한다.

    // 삭제 하고싶으면 ar[0] = "null"
    public void menu() {
    	
    	int index = 0;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("***************");
            System.out.println("    1. 가입");
            System.out.println("    2. 출력");
            System.out.println("    3. 수정");
            System.out.println("    4. 탈퇴");
            System.out.println("    5. 끝내기");
            System.out.println("***************");
            System.out.print("   번호 : ");
            int b = s.nextInt();
            System.out.println();

            if (b == 1) {
            	insert(index);
            	if(index == 5) index=5;
            	else index++;
            	
            }
            else if (b == 2) list(index);
            else if (b == 3) updata(index);
            else if (b == 4) {
                  delete(index);
                  index--;
            }
            else if (b == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 메뉴를 선택하세요.");
                System.out.println();
                continue;
            }



        }

    }
    
    
    public void insert(int index) {
    	
        Scanner s = new Scanner(System.in);
        

        if(index > 4) {
        	System.out.println("5명의 정원이 꽉 찼습니다.");
        	System.out.println();
        	index--;
        	return;
        	
        }
        else {
	
	        System.out.print("이름 입력 : ");
	        String name = s.next();
	        System.out.print("나이 입력 : ");
	        String age = s.next();
	        System.out.print("핸드폰 입력 : ");
	        String num = s.next();
	        System.out.print("주소 입력 : ");
	        String ads = s.next();
	        System.out.println();
	        System.out.println("1 row created");
	        System.out.println((ar.length-index-1)+"자리 남았습니다.");
	        System.out.println();
	        System.out.println();
	
	
	        
	        
	        ar[index] = new MemberDTO();
	        
	        ar[index].setName(name);
	        ar[index].setAge(age);
	        ar[index].setNum(num);
	        ar[index].setAds(ads);
	

	        
        }
    }
    
    
    
    public void list(int index) {
        
        System.out.println("이름\t나이\t핸드폰\t\t주소");
        for (int i =0; i <index; i++) {
        	System.out.println(ar[i].getName()+"\t"+ar[i].getAge()+"\t"+ar[i].getNum()+"\t"+ar[i].getAds());
        }
        System.out.println();
    }
    
    
    
    public void updata(int index) {
    	Scanner s = new Scanner(System.in);
    	boolean a = false;
    	
    	System.out.print("핸드폰 번호 입력 : ");
        String num = s.next();
        System.out.println();
        
        
        for( int i=0; i<index; i++) {
	        if (ar[i].getNum().equals(num)) {
	        	System.out.print(ar[i].getTot()); 
	        	System.out.println();
	        	System.out.println();
	        	System.out.print("수정 할 이름 입력 : ");
	        	String rename = s.next();
	        	System.out.print("수정 할 핸드폰 입력 : ");
	        	String renum = s.next();
	        	System.out.print("수정 할 주소 입력 : ");
	        	String reads = s.next();
	        	
	        	ar[i].setName(rename);
		        ar[i].setNum(renum);
		        ar[i].setAds(reads);
		        
		        System.out.println();
		        System.out.println("1 row(s) updated");
		        System.out.println();
		        System.out.println(ar[i].getTot());
		        System.out.println();
	        	
		        a = true;
	        }
        }
        if(a == false) System.out.println("찾는 회원이 없습니다.");
        
    }
        
    public void delete(int index) {
    	
    	Scanner s = new Scanner(System.in);
    	
    	String[] tmp = new String[5];
    	
    	boolean a = false;
    	
    	System.out.print("핸드폰 번호 입력 : ");
        String num = s.next();
        
        for( int i=0; i<index; i++) {
	        if (ar[i].getNum().equals(num)) {
	        	
	        	ar[i] = new MemberDTO();
	        	for (int j = i; j<index-1; j++) {
	        	ar[i] = ar[i+1];
	        	}
		        
		        System.out.println();
		        System.out.println("1 row(s) delete");
		        System.out.println();
		        index--;
		        a=true;
		        
	        }

        }
        if( a= false) {
        System.out.println();
        System.out.println("찾는 회원이 없습니다.");
        System.out.println();
        }
    }


}
