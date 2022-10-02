package class2;

import static java.lang.Math.pow;
import static java.lang.Math.random;
//import static java.lang.Math.*; -> 모든것 wild card -> 왠만하면 비추천

import static java.lang.String.format;
import static java.lang.System.out;

public class ImportJava {

	public static void main(String[] args) {
		
		out.println("난수 = " + random());
		out.println("제곱 = " + pow(3, 4));
		out.println("소수 이하 2째 자리 = " + format("%.2f", 43.45678));		
	}

}
