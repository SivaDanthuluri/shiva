package com.app.data;

public class Player {
	
	private int id;
	private String name;
	private String gender;
	private String city;
	private String sportsName;
	private int age;
	private long Contact;
	
	
	public Player() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return Contact;
	}

	public void setContact(long contact) {
		Contact = contact;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + ", sportsName="
				+ sportsName + ", age=" + age + ", Contact=" + Contact + "]";
	}
	
	public Player(int id, String name, String gender, String city, String sportsName, int age, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.sportsName = sportsName;
		this.age = age;
		Contact = contact;
	}
	
	

}
