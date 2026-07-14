package com.practise.linkedin.set2;

public class Program25_MarkerInterfaceExample implements Cloneable {

	private String name;
	private String id;

	public Program25_MarkerInterfaceExample(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void display() {
		System.out.println("The Employee name " + name + "  ==> the  employee id " + id);
	}

	public static void main(String[] args) {

		Program25_MarkerInterfaceExample details = new Program25_MarkerInterfaceExample("bhaskar", "29");
		try {
			Program25_MarkerInterfaceExample clonedObject = (Program25_MarkerInterfaceExample) details.clone();
			clonedObject.display();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}
}
