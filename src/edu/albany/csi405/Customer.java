package edu.albany.csi405;

public class Customer {
	//Customer ID
	private int Id;
	private String name; // Customer Name
	
	public int getId() { //Accessor for ID
		return Id;
	}

	public void setId(int id) {  //Mutator for ID
		Id = id;
	}

	public String getName() { //Accessor for Name
 		return name;
	}

	public void setName(String name) {  //Mutator for Name
		this.name = name;
	}
	
	

}
