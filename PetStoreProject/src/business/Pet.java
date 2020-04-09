package business;

public class Pet {
	
	//variables for constructor
	private int id;
	private String type;
	private String species;
	private String name;
	private int age;
	
	//generated empty constructor
	public Pet() {
	}

	//generated fully loaded constructor
	public Pet(int id, String type, String species, String name, int age) {
		super();
		this.id = id;
		this.type = type;
		this.species = species;
		this.name = name;
		this.age = age;
	}
	
	//generated getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String report = "name: " +name + "\ttype: " +type + "\tspecies: " +species
					  + "\tage: " +age + "\tid: " +id;
					 
		return report;
	}
	
	
	
	
	

}
