package java8lambdabasics;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test mylambda = (s) -> s.length();
//		System.out.println(mylambda.getLength("anil1"));
		testMethod((s) -> s.length());
	}
	
	
	public static void testMethod(Test t) {
		System.out.println(t.getLength("testing"));
	}
	
@FunctionalInterface
interface Test {
	int getLength(String s);
}

}
