/* 
 * precious idehen 
 * program : this program converts miles to kilometers and 
 * 			 outputs the results 10 times.
 */




public class MilesToKilometersLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double miles , kilometers = 0.0;
	    for (miles = 1.0; miles<=10; miles++) {
	    	kilometers = miles * 1.609;
	    	System.out.println(miles+" mile is "+kilometers+" kilometers");
	     }

	}

}
