import java.util.Enumeration;
public class Lexy {
	private Enumeration<String> e;
	public Lexy (int len){
		e=new LexyEnumeration(len);
	}
	public Enumeration<String> elements(){
		return e;
	}
}