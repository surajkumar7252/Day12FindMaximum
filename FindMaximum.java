package day12testmaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum 
{   public static Integer firstNumber,secondNumber,thirdNumber;
    public static Float firstFloatNumber,secondFloatNumber,thirdFloatNumber;
    public static String firstString,secondString,thirdString;

	public static Logger log=LogManager.getLogger(FindMaximum.class);
	static Scanner inputFeed=new Scanner(System.in);
	
	public Integer findingMaximum() {
		Integer maxNumber=0;
		if(firstNumber.compareTo(maxNumber)>0) {
			maxNumber=firstNumber;
		}
		if(secondNumber.compareTo(maxNumber)>0) {
			maxNumber=secondNumber;
		}
		if(thirdNumber.compareTo(maxNumber)>0) {
			maxNumber=thirdNumber;
		}
		
	     return maxNumber;
		        
	}
	
	public Float findingMaximumFloat() {
		Float maxNumber=0.0f;
		if(firstFloatNumber.compareTo(maxNumber)>0) {
			maxNumber=firstFloatNumber;
		}
		if(secondFloatNumber.compareTo(maxNumber)>0) {
			maxNumber=secondFloatNumber;
		}
		if(thirdFloatNumber.compareTo(maxNumber)>0) {
			maxNumber=thirdFloatNumber;
		}
		
	     return maxNumber;
		        
	}
	
	public String findingMaximumString() {
		String maxString=firstString;
		
		if(firstString.length()<secondString.length()) {
			 maxString=secondString;
		}
		if(secondString.length()<thirdString.length()) {
			 maxString=thirdString;
		}
		 return  maxString;
		        
	}
	void setValuesInterger() {
		log.debug( "Enter First Number: " );
    	firstNumber = inputFeed.nextInt();
    	log.debug( "Enter Second Number: " );
    	secondNumber = inputFeed.nextInt();
    	log.debug( "Enter Third Number: " );
    	thirdNumber = inputFeed.nextInt();
		}
	
	void setValuesFloat() {
		log.debug( "Enter First Number: " );
    	firstFloatNumber = inputFeed.nextFloat();
    	log.debug( "Enter Second Number: " );
    	secondFloatNumber = inputFeed.nextFloat();
    	log.debug( "Enter Third Number: " );
    	thirdFloatNumber = inputFeed.nextFloat();
		}
	void setValuesString() {
		log.debug( "Enter First String: " );
    	firstString = inputFeed.nextLine();
    	log.debug( "Enter Second String: " );
    	secondString = inputFeed.nextLine();
    	log.debug( "Enter Third String: " );
    	thirdString = inputFeed.nextLine();
		}
    public static void main( String[] args )
    {    
         Integer choice;
    	FindMaximum findMaximum=new FindMaximum ();
    	log.debug( "Select the type of number you want to compare : ");
    	log.debug( "1.Integer ");
    	log.debug( "2.Float ");
    	log.debug( "3.String ");
    	
    	choice = inputFeed.nextInt();
    	switch(choice) {
    	case 1: findMaximum.setValuesInterger();
    	        log.debug( "Max String : "+ findMaximum.findingMaximum());
    	        break;
    	case 2: findMaximum.setValuesFloat();
                log.debug( "Max String : "+ findMaximum.findingMaximumFloat());
                break;
    	case 3: findMaximum.setValuesString();
        log.debug( "Max String : "+ findMaximum.findingMaximumString());
        break;
    	}
    	   
    }
}
