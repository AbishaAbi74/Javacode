package com.obsqura.inheritanceconcept;

public class Biodata extends Name 
{
	public void displayName()
	{
		System.out.println("Abisha");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biodata b = new Biodata();
		b.displayName();
		b.age();
		b.height();

	}

}
