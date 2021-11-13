import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnyClass {
	public static void main(String[] args) {
		
		//mycollections();
		
		//myStrings();
		
		//myexception();
		
		handleExceptions(0);
		
	}
	
	private static void  handleExceptions(int denomiator){
		
//		try {
//			System.out.println(1/denomiator);
//		}catch(Exception e) {
//			System.out.println("in catch block");
//		}
		
		try {
			System.out.println("starting try");
			int result = 1/denomiator;
			System.out.println(result);
			System.out.println("starting line 33");
			
			//open the lid
			// pul the fuel  - if exception comes ehre
			// close the lid
		
		}catch(Exception e) {
			System.out.println("in catch");  // only when exception is there.. otherwise it dont reach here
		
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally -- I dont know if there was exception.. but this piece of code needs to exception before we exit.."
					+ "so they coded me :)");
			
			//if lid is open.. then close the lid
		}
		
		System.out.println("resume my code");
		
		
	
		System.out.println("NUll pointer");
		try {
			String  myStringvalue = null; 
			System.out.println(myStringvalue.toString());
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void  myexception(){
		int a=1;
		System.out.println(a);
		System.out.println(	a+1);			
		System.out.println( (a-1));
		System.out.println(a*5);
		System.out.println(a/5); // 0.5, a is integer ---> the caulcations with Integer will result Integer
		
		Float b=(float) 1;
		System.out.println(b/5); // 0.5, b is Float ---> the caulcations with Float will result -- Float
		
		System.out.println(a/5.0); // 0.5, a is integer/-0.5 float ---> the caulcations with Integer & Float will result Float
		
		
		//int is primitive , Integer is class (Wrapper around int) --> Integer extends int
		//int myint1 = null;
		Integer myint2 = 5;   // all class in java by default inherit from Object
		System.out.println(myint2 == 5);
		System.out.println(myint2.compareTo(5));
		System.out.println(myint2.toString());
		
		//For exception
		Integer myint3 = null;   // all class in java by default inherit from Object
		System.out.println();
		
		
		///back to exception
		
		System.out.println("line 47");
		//System.out.println(a/0); // Arithmatic excption
		System.out.println("line 49");		
		
		Integer myvalue = null; 
//		System.out.println(myvalue.toString() );
		String  myStringvalue = null; 
		System.out.println(myStringvalue.toString());
	}

	private static void myStrings() {
		
		//Learn String
		
		System.out.println(  1+1  ); 
		System.out.println( "Ajay"+1 );//String append   ----> + operator in Arithmatic -> add, + operator for String means append
		System.out.println( "1"+"1" ); //String append
		
		Integer a=1;
		System.out.println(a);
		System.out.println("a+1 "	+	a+1);			// String append
		System.out.println("a-1"+	 (a-1));
		System.out.println("a*5"+		a*5);
		System.out.println("a/5"+a/5);
		//System.out.println(a/0);
		
	}

	private static void mycollections() {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(1);
		
		//myList.add("Ajay");
		System.out.println("my List "+myList);
		
		Set<String> myset = new HashSet<>();
		myset.add("ABC");
		myset.add("DEF");
		myset.add("ABC");
		System.out.println("myset "+ myset);
		
		Map<Integer,String> myMap = new HashMap<>();
		myMap.put(1,"ABC");
		myMap.put(2,"ABC");
		myMap.put(3,"DEf");
		myMap.put(1,"DEF");
		System.out.println("myMap "+ myMap);
		
		
	}
}
