
public class DictionaryTest {
	public static void main(String[] args){
		
		Dictionary d1 = new Dictionary(500,500);
		System.out.println("Dictionary d1 has: ");
		System.out.println(""+d1.getPages()+" pages");
		System.out.println(""+d1.getDefinitions()+" definitions");
		System.out.println(""+d1.computeRatio()+" definitions per page on average");
	
	}
}
