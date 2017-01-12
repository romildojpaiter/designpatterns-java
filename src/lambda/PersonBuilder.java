package lambda;

public class PersonBuilder {

	Person p = new Person();
	
	public PersonBuilder givenName(String string) {
		p.setGivenName(string);
		return this;
	}

	public PersonBuilder surName(String string) {
		p.setSurName(string);
		return this;
	}

	public PersonBuilder age(int i) {
		p.setAge(i);
		return this;
	}

	public PersonBuilder gender(Gender gender) {
		p.setGender(gender);
		return this;
	}

	public PersonBuilder email(String string) {
		p.seteMail(string);
		return this;
	}

	public PersonBuilder phoneNumber(String string) {
		p.setPhone(string);
		return this;
	}

	public PersonBuilder address(String string) {
		p.setAddress(string);
		return this;
	}

	public Person build() {
		return p;
	}

}