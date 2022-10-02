package class2;

class Fruit {
	   private String pum;
	   private int jan, feb, mar, tot;
	   private static int sumJan, sumFeb, sumMar;
	   
	   public Fruit(String pum, int jan, int feb, int mar) {
	      this.pum = pum;
	      this.jan = jan;
	      this.feb = feb;
	      this.mar = mar;
	   }
	   
	   public void calcTot() {
	      tot = jan + feb + mar;
	      
	      sumJan += jan;
	      sumFeb += feb;
	      sumMar += mar;
	   }
	   
	   public void display() {
	      System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	   }
	   
	   public static void output() {
	      System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	   }
	}
	//-----------
	public class FruitMain {

	   public static void main(String[] args) {
	      Fruit[] ar = {new Fruit("사과", 100, 80, 75),
	                 new Fruit("포도", 30, 25, 10),
	                 new Fruit("딸기", 25, 30, 90)};
	      
	      
	      System.out.println("------------------------------------");
	      System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
	      System.out.println("------------------------------------");
	      
	      for(int i=0; i<ar.length; i++) {
	         ar[i].calcTot();
	         ar[i].display();
	      }
	      
	      System.out.println("------------------------------------");
	      Fruit.output();
	   }

	}
/*
class Fruit{
	
	private static int sumJan, sumFeb, sumMar;
	private String[] pum = new String[] {"사과","포도","딸기"};
	private static int[] jan = new int[] {100,35,25};
	private static int[] feb = new int[] {80,25,30};
	private static int[] mar = new int[] {25,30,90};
	private int[] tot = new int[3];
	
	public Fruit() {
		display();
	}
	
	public void calcTot() {
		for (int i=0; i<pum.length;i++) {
			tot[i] = jan[i] + feb[i] + mar[i];
		}
		
	}
	
	public void display() {
		calcTot();
		
		System.out.println("-------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-------------------------------------");
		for(int i=0;i<pum.length;i++) {
			System.out.println(pum[i]+"\t"+jan[i]+"\t"+feb[i]+"\t"+mar[i]+"\t"+tot[i]);
		}
		System.out.println("-------------------------------------");
		
		output();
	}
	
	public static void output() {
		for(int i = 0; i < jan.length; i++) {
			sumJan += jan[i];
			sumFeb += feb[i];
			sumMar += mar[i];
		}
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
	}
	
	
}


public class FruitMain {

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		
		
		
	}

}
*/
/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static


클래스 : FruitMain


[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리
*/