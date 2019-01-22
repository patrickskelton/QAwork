package working_with_files_exercise;

public class person {
	private String personName;
	private String personAge;
	private String personOccupation;
	public person(String name, String age, String occupation) {
		personName = name;
		personAge = age;
		personOccupation = occupation;
	}
	public String getPersonName() {
		return personName;
	}
	public String getPersonAge() {
		return personAge;
	}
	public String getPersonOccupation() {
		return personOccupation;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	public void setPersonOccupation(String personOccupation) {
		this.personOccupation = personOccupation;
	}
	
	
	
	
}


