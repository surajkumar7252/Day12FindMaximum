package day12testmaximum;


import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest 
{   
	@Test
	public void FirstNumberAsMaxNumber_ShouldReturnTheFirstNumber() {
		FindMaximum findingMaxNum=new FindMaximum();
		Integer firstNumber=75,secondNumber=10, thirdNumber=55;
		Integer maxNumber=findingMaxNum.findingMaximum(firstNumber,secondNumber, thirdNumber);
		Assert.assertEquals(firstNumber,maxNumber);
	}
	
	@Test
	public void SecondNumberAsMaxNumber_ShouldReturnTheSecondNumber() {
		FindMaximum findingMaxNum=new FindMaximum();
		Integer firstNumber=10,secondNumber=75, thirdNumber=55;
		Integer maxNumber=findingMaxNum.findingMaximum(firstNumber,secondNumber, thirdNumber);
		Assert.assertEquals(secondNumber,maxNumber);
	}
	
	
	@Test
	public void ThirdNumberAsMaxNumber_ShouldReturnTheThirdNumber() {
		FindMaximum findingMaxNum=new FindMaximum();
		Integer firstNumber=10,secondNumber=55, thirdNumber=75;
		Integer maxNumber=findingMaxNum.findingMaximum(firstNumber,secondNumber, thirdNumber);
		Assert.assertEquals(thirdNumber,maxNumber);
	}
    
   
}
