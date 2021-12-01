package a;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

class b{
	public static void main(String[] args) {
		String a="2";
		
		a = "1";
		
		Integer b=2;
		
		if(b==1) System.out.println("this is printing b");
		else if(b==2) System.out.println("this is again printing b");
		else System.out.println("this is not printing b");
		
		switch (b) {
			case 1: {
				
				System.out.println("tis is 1 swtich");; break;
			}
			case 2: {
				
				System.out.println("tis is 2 swtich");; 
			}
			default:
				System.out.println("defuault switch");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("this is "+i+"th time");
		}
		
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("abc");
		listOfStrings.add("22");
		
		for (String strAbc : listOfStrings) {
			System.out.println(strAbc);
		}
		
		
//	  Date dateOfBirth = new Date
//	  System.out.println(dateOfBirth);
		
	  Date dateOfBirth2 = new Date();
	  System.out.println(dateOfBirth2);


	  SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	  SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

	  
	  System.out.println(sdf.format(dateOfBirth2));
	  
	  
	  
	  System.out.println(sdf2.format(dateOfBirth2));

	  java.sql.Timestamp dateSQl = new java.sql.Timestamp(dateOfBirth2.getTime());
	  
	  System.out.println(dateSQl);
	  
	  String a1 ="a";
	  String b1 ="a";
	  System.out.println(a1.equals(b1));
	  
	  StringBuilder str= new StringBuilder("a"); //memory saved
	  str.append("b");
	  System.out.println(str);
	}
	
	final public void ba() {
		// TODO Auto-generated method stub

	}
}