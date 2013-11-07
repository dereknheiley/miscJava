public class Thing{
	private String content="";
	public Thing(String str){
		content=str;
	}
	public void swap(Thing b){
		String temp = content;
		content=b.toString();
		b.set(temp);
	}
	public static void swap(Thing a, Thing b){
		String temp = a.toString();
		a.set(b.toString());
		b.set(temp);
	}
	public void set(String str){
		content=str;
	}
	public String toString(){
		return content;
	}
}