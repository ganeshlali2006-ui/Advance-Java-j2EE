package basics;

//Java Program to test performance of StringBuffer and StringBuilder

public class PerformanceTest {
 public static void main(String[] args) {

     long startTime;

     // ================= StringBuffer =================
     startTime = System.currentTimeMillis();

     StringBuffer sb = new StringBuffer("AIET");

     for (int i = 0; i < 10000; i++) {
         sb.append("AIET");
     }

     System.out.println("Time taken by StringBuffer: " +
             (System.currentTimeMillis() - startTime) + " ms");


     // ================= StringBuilder =================
     startTime = System.currentTimeMillis();

     StringBuilder sb2 = new StringBuilder("AIET");

     for (int i = 0; i < 10000; i++) {
         sb2.append("AIET");
     }

     System.out.println("Time taken by StringBuilder: " +
             (System.currentTimeMillis() - startTime) + " ms");
 }
}