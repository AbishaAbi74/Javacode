package com.obsqura.inheritanceconcept;

public class AdditionResult extends AdditionTwoNumbers 
{
	public void checkDivisiblity()
	{
		int value = super.addNumbers();
		if(value%10==0) {
			System.out.println("Number is divisible by 10");
		}else {
			System.out.println("Number is not divisible by 10");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionResult ad = new AdditionResult();
		ad.checkDivisiblity();
		
				
		

	}
}

