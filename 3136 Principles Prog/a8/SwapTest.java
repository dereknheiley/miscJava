public class SwapTest {
	public static void main(String[] args) {
		int a=5;
		int b=6;
		System.out.println("Integer test");
		System.out.println("a:"+a+" b:"+b);
		Swap s = new Swap();
		s.swap1(a,b);
		System.out.println("run swap method");
		System.out.println("a:"+a+" b:"+b);
		System.out.println();
		
		Thing t1 = new Thing("a");
		Thing t2 = new Thing("b");
		System.out.println("Object test");
		System.out.println("t1:"+t1+" t1:"+t2);
		s.swap1(t1,t2);
		System.out.println("run swap method");
		System.out.println("t1:"+t1+" t2:"+t2);
		System.out.println();
		
		System.out.println("Object test w/static swap method");
		System.out.println("t1:"+t1+" t1:"+t2);
		Thing.swap(t1, t2);
		System.out.println("run swap method");
		System.out.println("t1:"+t1+" t2:"+t2);
		System.out.println();
		
		System.out.println("Object test w/object's swap method");
		System.out.println("t1:"+t1+" t1:"+t2);
		t1.swap(t2);
		System.out.println("run swap method");
		System.out.println("t1:"+t1+" t2:"+t2);
		System.out.println();
	}
}
