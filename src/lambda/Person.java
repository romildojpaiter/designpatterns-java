package lambda;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String givenName;
	private String surName;
	private int age;
	private Gender gender;
	private String eMail;
	private String phone;
	private String address;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String surName) {
		this.surName = surName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void printName() {
		System.out.println(this.getSurName());
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static List<Person> createShortList() {
		
		List<Person> people = new ArrayList<>();
		
		people.add(
			new PersonBuilder()
		        .givenName("Bob")
		        .surName("Baker")
		        .age(21)
		        .gender(Gender.MALE)
		        .email("bob.baker@example.com")
		        .phoneNumber("201-121-4678")
		        .address("44 4th St, Smallville, KS 12333")
		        .build() 
		  );
		
		people.add(
			new PersonBuilder()
		        .givenName("Jane")
		        .surName("Doe")
		        .age(25)
		        .gender(Gender.FEMALE)
		        .email("jane.doe@example.com")
		        .phoneNumber("202-123-4678")
		        .address("33 3rd St, Smallville, KS 12333")
		        .build() 
		  );
		
		people.add(
			new PersonBuilder()
		        .givenName("John")
		        .surName("Doe")
		        .age(25)
		        .gender(Gender.MALE)
		        .email("john.doe@example.com")
		        .phoneNumber("202-123-4678")
		        .address("33 3rd St, Smallville, KS 12333")
		        .build()
		);
		
		return people;
	
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}