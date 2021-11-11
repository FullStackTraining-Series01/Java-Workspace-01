import java.util.HashMap;
import java.util.Map;

public class MapCollections {

	public static void main(String[] args) {
		
		Map<String, String> abcMap = new HashMap<>();

		abcMap.put("1", "Ajay");
		
		abcMap.put("1", "Ajay2");
		abcMap.put("2", "Ajay4");

		

		System.out.println(abcMap.toString());
		
		
		int a =1;			//primitive class
		Integer aI = 1;		// Wrapper Class
		
		int[] rollNum = {1,2,3,4,5};//new int[5];// =[1, 2]
		int[] rollNum2 = new int[5];// =[1, 2];		
		Integer[] aIArray = new Integer[3] ;//= 1;	-- fixed size
		
		//rollNum = {1,2,3,4,5};
		
		rollNum2[0]=90;
		rollNum2[4]=94;
		
		System.out.println(rollNum);
		System.out.println(rollNum[0]);
		System.out.println(rollNum2[0]);
		//System.out.println(rollNum2[5]);
		
		//Single DImenesion Array
		//2 D
		
		
		//Array --> Collection of objects of same type
		//Collections --> List (ArrayList), Map(HashMap) , Set (HashSet);
	
//		System.out.println(a);
	}
}
