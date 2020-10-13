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
	public  findMaximum first,second,third;
	
	private findMaximum[] requiredDataArray;
	
	public FindMaximum(findMaximum ...requiredDataArray) {
		this.requiredDataArray =requiredDataArray;
		
	}
	
	 
	 
	
		public void testMaximum() {
			 printMax(maxElement(requiredDataArray));
			
		}
    
		private void printMax(findMaximum greatest) {
			log.info("The Greatest one is : " + greatest);
			
		}
		public <findMaximum extends Comparable<findMaximum>> findMaximum maxElement(findMaximum[]inputList) {
			int greatest = 0;
			for(int index = 1; index < inputList.length; index++) 
				if (inputList[index].compareTo(inputList[greatest]) > 0) 
					greatest = index;
			return inputList[greatest];
			
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
         log.debug( "Select the type of number you want to compare : ");
     	log.debug( "1.Integer ");
     	log.debug( "2.Float ");
     	log.debug( "3.String ");
     	
     	choice = inputFeed.nextInt();
     	switch(choice) {
     	case 1: FindMaximum<Integer> findMaxInt=new FindMaximum<Integer>( firstNumber,secondNumber,thirdNumber); 
     	        findMaxInt.setValuesInterger();
     	        findMaxInt.testMaximum();
     	        break;
     	case 2: FindMaximum<Float> findMaxFloat=new FindMaximum<Float>( firstFloatNumber,secondFloatNumber,thirdFloatNumber); 
	        findMaxFloat.setValuesFloat();
	         findMaxFloat.testMaximum();
	        break;
     	case 3: FindMaximum<Integer> findMaxString=new FindMaximum<Integer>( firstStringLength,secondStringLength,thirdStringLength); 
	        findMaxString.setValuesInterger();
	        findMaxString.testMaximum();
	        break;
     	}
        
    	   
    }
}
