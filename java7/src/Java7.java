import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Java7 {
	public static void main(String args[]) {
		
		// string in switch
		System.out.println(sToB("true"));
		System.out.println();
		
		// try auto close resource and multi exception catch
		try (MyAutoCloseableResource x = new MyAutoCloseableResource()) {
			x.doSomething();
		} catch(MyException1 | MyException2 e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		// type inference
		Map<String, List<String>> map = new HashMap<>();
		
		// binary literals
		int three = 0b011;
		System.out.println("three declared as binary literal: "+three);
		System.out.println();
		
		// underscore in binary literals
		int bigNumber = 123_456_789;
		System.out.println(bigNumber);
		
	}
	
	static boolean sToB(String s) {
		switch (s) {
		case "true": return true;
		default: return false;
		}
	}
}
