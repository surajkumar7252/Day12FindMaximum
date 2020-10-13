package day12testmaximum;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindMaximum<findMaximum extends Comparable<findMaximum>>
{  
	public static Integer firstNumber,secondNumber,thirdNumber;
    public static Float firstFloatNumber,secondFloatNumber,thirdFloatNumber;
    public static Integer firstStringLength,secondStringLength,thirdStringLength;
	public static Logger log=LogManager.getLogger(FindMaximum.class);
	static Scanner inputFeed=new Scanner(System.in);
	findMaximum first,second,third;
	
	public findMaximum findingMaximum(findMaximum first,findMaximum second,findMaximum third) {
		findMaximum greatest = first;
		if (second.compareTo(greatest) > 0) {
			greatest =second;
		}
		if (third.compareTo(greatest) > 0) {
			greatest = third;
		}
		return greatest;
	}
	
	void setValuesInterger() {
		
		log.debug( "Enter First Element: " );
    	firstNumber =inputFeed.nextInt();
    	log.debug( "Enter Second Element: " );
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
		String firstString=null,secondString=null,thirdString=null;
		log.debug( "Enter First String: " );
    	firstString = inputFeed.nextLine();
    	firstStringLength=firstString.length();
    	log.debug( "Enter Second String: " );
    	secondString = inputFeed.nextLine();
    	secondStringLength=secondString.length();
    	log.debug( "Enter Third String: " );
    	thirdString = inputFeed.nextLine();
    	thirdStringLength=thirdString.length();
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
    	        log.debug( "Max String : "+ findMaximum.findingMaximum(firstNumber,secondNumber,thirdNumber));
    	        break;
    	case 2: findMaximum.setValuesFloat();
                log.debug( "Max String : "+ findMaximum.findingMaximum(firstFloatNumber,secondFloatNumber,thirdFloatNumber));
                break;
    	case 3: findMaximum.setValuesString();
        log.debug( "Max String : "+ findMaximum.findingMaximum(firstStringLength,secondStringLength,thirdStringLength));
        break;
    	}
    	   
    }
}
