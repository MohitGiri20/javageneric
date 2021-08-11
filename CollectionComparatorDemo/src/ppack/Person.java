package ppack;

public class Person {
	
	
	private int id;
	private int age;
	private String name;
	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	

}
