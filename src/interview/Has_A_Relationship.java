package interview;

public class Has_A_Relationship {
	String name;
	int id;
	String street, city, hno;
	Has_A_Relationship(String name, int id, Address add) {
		this.name = name;
		this.id = id;
		this.street = add.street;
		this.city = add.city;
		this.hno = add.hno;
	}

	void display() {
		System.out.println(name + "..." + id + "..." + street + "..." + city + "..." + hno);
	}
	public static void main(String[] args) {
		Address add = new Address("164", "kadapa", "jmd");
		Has_A_Relationship emp = new Has_A_Relationship("gsk", 123, add);
		emp.display();

	}

}
