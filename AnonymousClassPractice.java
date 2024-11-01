interface Greeting
{
	void sayHello();
}  
class AnonymousClassPractice
{
	public static void main(String[] args){
	
	//Create an anonymous class that implements the Greeting interface
	Greeting g1 = new Greeting(){
		@Override
		public void sayHello(){
			System.out.println("Hello, World!");
		}
	};
	g1.sayHello();
	} 
}	