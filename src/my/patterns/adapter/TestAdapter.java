package my.patterns.adapter;

public class TestAdapter {
	public static void main(String args[]) {
		AceClass aceObject = new AceClass();
		aceObject.setName("Cary Grant");
		AceToAcmeAdapter adapter = new AceToAcmeAdapter(aceObject);
		System.out.println("Customerís first name: " + adapter.getFirstName());
		System.out.println("Customerís last name: " + adapter.getLastName());
	}
}
