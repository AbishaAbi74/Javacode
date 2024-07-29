package com.obsqura.inheritanceconcept;

public class CalculateHraPf extends Salary 

{
	int hra;
	int pf;
	public void findPfHraAmount() {
		
		 hra = basicpay *5/100;
		 pf = basicpay *20/100;
		System.out.println(hra);
		System.out.println(pf);
		
	}
	
		

	
}
