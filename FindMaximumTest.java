package day12testmaximum;


import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest 
{   
	@Test
	public void FirstIntegerNumberAsMaxNumber_ShouldReturnTheFirstNumber() {
		System.out.println("This is First Integer Max Test");
		FindMaximum findingMaxNum1=new FindMaximum();
		findingMaxNum1.setValuesInterger();
		Integer maxNumber=findingMaxNum1.findingMaximum();
		Assert.assertEquals(findingMaxNum1.firstNumber,maxNumber);
		
	}
	@Test
	public void SecondIntegerNumberAsMaxNumber_ShouldReturnTheSecondNumber() {
		System.out.println("This is Second Integer Max Test");
		
		FindMaximum findingMaxNum2=new FindMaximum();
		findingMaxNum2.setValuesInterger();
		Integer maxNumber=findingMaxNum2.findingMaximum();
		Assert.assertEquals(findingMaxNum2.secondNumber,maxNumber);
	}
	
	
	@Test
	public void ThirdIntegerNumberAsMaxNumber_ShouldReturnTheThirdNumber() {
		System.out.println("This is Third Integer Max Test");
		
		FindMaximum findingMaxNum3=new FindMaximum();
		findingMaxNum3.setValuesInterger();
		Integer maxNumber=findingMaxNum3.findingMaximum();
		Assert.assertEquals(findingMaxNum3.thirdNumber,maxNumber);
	}
	
	@Test
	public void FirstFloatNumberAsMaxNumber_ShouldReturnTheFirstNumber() {
		System.out.println("This is First Float Max Test");
		FindMaximum findingMaxNum1=new FindMaximum();
		findingMaxNum1.setValuesInterger();
		Float maxNumber=findingMaxNum1.findingMaximumFloat();
		Assert.assertEquals(findingMaxNum1.firstFloatNumber,maxNumber);
		
	}
	@Test
	public void SecondFloatNumberAsMaxNumber_ShouldReturnTheSecondNumber() {
		System.out.println("This is Second Float Max Test");
		
		FindMaximum findingMaxNum2=new FindMaximum();
		findingMaxNum2.setValuesInterger();
		Float maxNumber=findingMaxNum2.findingMaximumFloat();
		Assert.assertEquals(findingMaxNum2.secondFloatNumber,maxNumber);
	}
	
	
	@Test
	public void ThirdFloatNumberAsMaxNumber_ShouldReturnTheThirdNumber() {
		System.out.println("This is Third Float Max Test");
		
		FindMaximum findingMaxNum3=new FindMaximum();
		findingMaxNum3.setValuesInterger();
		Float maxNumber=findingMaxNum3.findingMaximumFloat();
		Assert.assertEquals(findingMaxNum3.thirdFloatNumber,maxNumber);
	}
	
	@Test
	public void FirstStringAsMaxString_ShouldReturnTheFirstString() {
		System.out.println("This is First String Max Test");
		FindMaximum findingMaxNum1=new FindMaximum();
		findingMaxNum1.setValuesString();
		 String maxString=findingMaxNum1.findingMaximumString();
		 Assert.assertEquals(findingMaxNum1.firstString,maxString);
		
	}
	@Test
	public void  SecondStringAsMaxString_ShouldReturnTheSecondString() {
		System.out.println("This is Second  String Max Test");
		
		FindMaximum findingMaxNum2=new FindMaximum();
		findingMaxNum2.setValuesString();
		 String maxString=findingMaxNum2.findingMaximumString();
		 Assert.assertEquals(findingMaxNum2.secondString,maxString);
	}
	
	
	@Test
	public void  ThirdStringAsMaxString_ShouldReturnTheThirdString() {
		System.out.println("This is Third  StringMax Test");
		
		 FindMaximum findingMaxNum3=new FindMaximum();
		 findingMaxNum3.setValuesString();
		 String maxString=findingMaxNum3.findingMaximumString();
		 Assert.assertEquals(findingMaxNum3.thirdString,maxString);
	}
	
	
   
}
