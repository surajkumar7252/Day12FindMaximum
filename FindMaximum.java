package day12testmaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum 
{   
	
	public static Logger log=LogManager.getLogger(FindMaximum.class);
	
	static Scanner inputFeed=new Scanner(System.in); 
	public Integer findingMaximum(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
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
	
	
    public static void main( String[] args )
    {    Integer result;
    	FindMaximum findMaximum=new FindMaximum ();
    	 log.debug( "Enter First Number: " );
    	Integer firstNumber = inputFeed.nextInt();
    	log.debug( "Enter Second Number: " );
    	Integer secondNumber = inputFeed.nextInt();
    	log.debug( "Enter Third Number: " );
    	Integer thirdNumber = inputFeed.nextInt();
    	result=findMaximum.findingMaximum(firstNumber,secondNumber,thirdNumber);
    	log.debug( "Max Number : "+result );
       
    }
}
