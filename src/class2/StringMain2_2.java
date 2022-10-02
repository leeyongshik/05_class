package class2;

import java.util.Scanner;

public class StringMain2_2 { // 강사님 풀이 

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("문자열 입력 : ");
	      String inputStr = scan.next(); //문자열 입력
	      System.out.print("현재 문자열 입력 : ");
	      String targetStr = scan.next(); //현재 문자열 입력
	      System.out.print("바꿀 문자열 입력 : ");
	      String changeStr = scan.next(); //바꿀 문자열 입력
	      
	      if(inputStr.length() < targetStr.length()) {
	         System.out.println("입력한 문자열의 크기가 작습니다");
	      }else {
	         inputStr = inputStr.toLowerCase();
	         targetStr = targetStr.toLowerCase();
	         
	         int count = 0;
	         int index = 0;
	         
	         while( (index=inputStr.indexOf(targetStr, index)) != -1) {
	            count++;
	            index = index + targetStr.length();
	         }//while
	         
	         System.out.println(inputStr.replace(targetStr, changeStr));
	         System.out.println(count + "개 치환");
	      }

	   }

	}