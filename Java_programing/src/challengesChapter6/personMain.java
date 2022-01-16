package challengesChapter6;

public class personMain {

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("john");
		person.setLastName("");
		System.out.println("first name is "+person.getFirstName());
		System.out.println("last name is "+person.getLastName());
		person.setAge(18);
		System.out.println("the age is "+person.getAge());
		System.out.println("the person full name is "+person.getFullName());
		System.out.println("is person Teen = "+person.isTeen());
	}

}
