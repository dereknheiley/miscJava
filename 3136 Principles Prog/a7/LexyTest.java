import java.util.Enumeration;
public class LexyTest{
	public static void main(String[] args) {
		Lexy l = new Lexy(3);
		Enumeration<String> e = l.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}