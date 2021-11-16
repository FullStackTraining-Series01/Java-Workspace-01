
public class ExceptionHandling2 {
	public static void main(String[] args) throws CustomException2 {

		
	//	handleExceptionV2(0);

	//	handleExceptionV3(0);
		
	//	handleExceptionV4(0);   // custom excption and throw
		
		
		try {
			handleExceptionV5(0);
		} catch (CustomException2 e) {
			
			System.out.println(" CustomException2 "+e.getMessage());
			throw e;
		}   // throws
		catch (Exception e) {
			System.out.println(" Exception "+e.getMessage());
		}
	}

	private static void handleExceptionV5(int denomiator) throws CustomException2, CustomException1  {  // throws need not throw Runtime Exceptions

		try {
			int a = 1/0;
		
		
			throw new CustomException2("some exception in my code");
			
		}catch(NumberFormatException e) {
			System.out.println("my catch V5" +e.getMessage());
			throw new CustomException1("some exception in my code");
		}
			

	}

	private static void handleExceptionV4(int denomiator) {

	
		System.out.println("Handle Exception checking - start method");
		try {

			
//			int result = 1/denomiator;
//			
//			System.out.println("NUll pointer Exception checking - start try");
//			String  myStringvalue = null; 
//			System.out.println(myStringvalue.toString());
//			System.out.println("NUll pointer Exception checking - try done");
		

			//throw new NullPointerException();
			
			//throw new ArrayIndexOutOfBoundsException();
		
			//if my code matches this criteria .. then it should throw error and make sue next times dont execute
			//throw new CustomException1();
			throw new CustomException1("some exception in my code");
		
			
			
		}catch (CustomException1 e) {
			System.out.println("Custom  Exception pointer");
			
			System.out.println(e.getMessage());
			
		} 
		catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e1 ) {
			System.out.println("Arithmetic Exception pointer Exception checking - exception child");
			
			System.out.println(e1.getClass());
			
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointer Exception pointer Exception checking - exception child2");
			
			System.out.println(e.getClass());
			
		}catch (RuntimeException e) { // Catch ALL Runtime Exception
			System.out.println("Exception pointer Exception checking - exception parent");
			
			System.out.println(e.getClass());
		}catch (Exception e) { // Catch ALL
			System.out.println("Exception pointer Exception checking - exception parent");
			
			System.out.println(e.getClass());
		}
		
		
		finally {
			System.out.println("Optional finally");
		}
		
	}
	
	
	private static void handleExceptionV3(int denomiator) {

	
		System.out.println("NUll pointer Exception checking - start method");
		try {

			int result = 1/denomiator;
			
			System.out.println("NUll pointer Exception checking - start try");
			String  myStringvalue = null; 
			System.out.println(myStringvalue.toString());
			System.out.println("NUll pointer Exception checking - try done");
		

			
		} catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e1 ) {
			System.out.println("Arithmetic Exception pointer Exception checking - exception child");
			
			System.out.println(e1.getClass());
			
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointer Exception pointer Exception checking - exception child2");
			
			System.out.println(e.getClass());
			
		}catch (RuntimeException e) { // Catch ALL Runtime Exception
			System.out.println("Exception pointer Exception checking - exception parent");
			
			System.out.println(e.getClass());
		}catch (Exception e) { // Catch ALL
			System.out.println("Exception pointer Exception checking - exception parent");
			
			System.out.println(e.getClass());
		}
		
		
		finally {
			System.out.println("Optional finally");
		}
		
	}
	
	private static void handleExceptionV2(int denomiator) {

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
}
