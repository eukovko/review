package by.karpov.webcrawler.entity;

public class User {
	private long id;
	private String name;
	private int age; // optional
	private String profession; // optional

	public User(long id, String name) {
		this.id = id;
		this.name = name;
	}


	public long getId() {
		return id;
	}

	public User setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public User setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public User setProfession(String profession) {
		this.profession = profession;
	}
}
