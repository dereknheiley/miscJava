
public class KidTest {
	public static void main(String[] args) {
		
		SchoolKid sk1 = new SchoolKid("Tammy",12,"Mr Boodreau","Female");
		ExaggeratingKid ek1 = new ExaggeratingKid("Mark",13,"Ms Strict","Male");
		
		System.out.println("The regular school kid is:");
		System.out.println(sk1);
		
		System.out.println("\nThe exaggerating kid is:");
		System.out.println(ek1);
		System.out.println("Because their age is two less than "+ek1.getAge());
		System.out.println("and because they wrote: "+ek1.getGreeting());

	}

}
