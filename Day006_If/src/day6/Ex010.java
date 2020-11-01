package day6;

public class Ex010 {
	public static void main(String[] args) {
		//C =5/9 ×(F - 32) = 37.7778
	    int F = 100;
 	    float C = (
	    		(int)(5/9f * (F - 32)*100) +
    			((5/9f * (F - 32)*1000)%10 
    					>=5? 1: 0)
    		)/100f;
	    
 	    System.out.println("Fahrenheit : " + F);
	    System.out.println("Celcius : " + C);
	    

		
	}//end main

}//end class
/*
클래스명 Ex010.
아래는 화씨를 섭씨로 변환하는 코드이다 
변환공식이 
C =5/9 ×(F - 32)
단 변환 결과값은 소수점 셋째자리에서 반올림해야한다 Math , String을 사용하지 않고 처리하시오.  


public class Ex010 {
   public static void main(String[] args) {
            
      
      int fahrenheit = 100;
      float celcius =   / 처리하시오. / ; // 37.77778
      
      System.out.println("Fahrenheit : " + fahrenheit);
      System.out.println("Celcius : " + celcius);
*/
