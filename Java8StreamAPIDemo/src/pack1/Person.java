package pack1;

public class Person {
	
	private int pId;
	private int age;
	private String pName;
	
	private String gender;

	public Person(int pId, int age, String pName, String gender) {
		super();
		this.pId = pId;
		this.age = age;
		this.pName = pName;
		this.gender = gender;
	}

	public int getpId() {
		return pId;
	}

	public int getAge() {
		return age;
	}

	public String getpName() {
		return pName;
	}

	public String getGender() {
		return gender;
	}
	
	

}
