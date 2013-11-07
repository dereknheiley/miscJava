
public class Swap<T>{
	//demo of method in question, doesn't have desired effect in calling scope
	public static <T> void swap1(T a, T b){
		T c=a; 
		a=b;
		b=c;
	}
	//demo of trying to swap primitive types, same problem, no change in calling scope
	public static void swap1(int a, int b){
		int c=a; 
		a=b;
		b=c;
	}
//	//couldn't use either of these because of "Method .. was undefined for type T errors
//	public static <T> void swap3(T a, T b){
//		a.swapper(b);
//	}
//	public static <T> void swap4(T a, T b){
//		String temp = a.toString();
//		a.set(b.toString());
//		b.set(a.toString());
//	}
}
