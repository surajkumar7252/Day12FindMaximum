package day12testmaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum 
{   public static Integer firstNumber,secondNumber,thirdNumber;
    public static Float firstFloatNumber,secondFloatNumber,thirdFloatNumber;

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
    public static void main( String[] args )
    {    
         Integer choice;
    	FindMaximum findMaximum=new FindMaximum ();
    	log.debug( "Select the type of number you want to compare : ");
    	log.debug( "1.Integer ");
    	log.debug( "2.Float ");
    	choice = inputFeed.nextInt();
    	switch(choice) {
    	case 1: findMaximum.setValuesInterger();
    	        log.debug( "Max Number : "+ findMaximum.findingMaximum());
    	        break;
    	case 2: findMaximum.setValuesFloat();
                log.debug( "Max Number : "+ findMaximum.findingMaximumFloat());
                break;
    	}
    	   
    }
}
