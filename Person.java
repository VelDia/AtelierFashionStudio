package clothes;

public abstract class Person {
	
		private String name;
		private String lastName;
		
		public Person () {}
		
		public Person(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}

		public String toString() {
			return "Person [name=" + name + ", lastName=" + lastName + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public abstract boolean putOnClothes (Clothes clothes);
	}
