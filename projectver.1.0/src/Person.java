
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


		public String[] ask() {
			return new String[] {personName,personAge,personJob,};
		}
	}

