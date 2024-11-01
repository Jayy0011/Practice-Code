class  Person
{
	class Address
	{
		private String city;
		private String state;
		
		public Address(String city, String state){
			this.city = city;
			this.state = state;
		}
		
		public void getDetails(){
			System.out.println("City :"+ city);
			System.out.println("State :"+ state);
		}
	}	
}

class StaticNestedClass01
{
	public static void main(String[] args){
		
		/*You first need to create an instance of Person (the outer class).
Then, you use that instance to create an object of Person.Address (the inner class)

If you want Address to be created independently of Person, 
you should make it a static nested class.
*/
		//Outer class reference
		Person person = new Person();
		
		//Inner class object created using Outer class Object
		Person.Address pa1 = person.new Address("Mumbai","Maharastra");
		pa1.getDetails();
	}
}
