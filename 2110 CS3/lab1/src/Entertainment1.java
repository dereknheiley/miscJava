//Tester (client)program: Entertainment1
public class Entertainment1
{
	public static void main(String[] args)
	{
		Production p1, p2, p3, p4, p5;
		p1 = new Production();
		p2 = new Film("Fight Club", "Jack's Brain", "Jack's Arms", 1234);
		p3 = new Play("Romeo & Devon", "W. Shakespoon", "The Dude", 350);
		p4 = new Musical("EVH", "Eddie VanHalen", "Eddie VanHalen", 109458, "Eddie VanHalen", "Eddie VanHalen");
		p5 = new ActionFilm("Worst Movie Ever", "That other guy", "That other guy", 20, "That guy's brother", 2010);
		p1.display();
		System.out.println();
		p2.display();
		System.out.println();
		p3.display();
		System.out.println();
		p4.display();
		System.out.println();
		p5.display();
	}
}//Entertainment1 ends
