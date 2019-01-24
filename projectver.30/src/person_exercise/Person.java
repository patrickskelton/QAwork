package person_exercise;

public class Person {
	private String personAge;
	private String personJob;
	private String personName;
	public Person(String Name) {
		personName = Name;
	}
	

	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}


	public void setPersonJob(String personJob) {
		this.personJob = personJob;
	}


	public String getPersonAge() {
		return personAge;
	}


	public String getPersonJob() {
		return personJob;
	}


	public String getPersonName() {
		return personName;
	}
	public boolean checkName(String guess) {
		if(guess.equals(personName.toUpperCase())) {
			return true;
		}
		else {
			return false;
		}
	}


	public String[] ask() {
		return new String[] {personName,personAge,personJob,};
	}
}
