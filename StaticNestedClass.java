//Outer class 
class  University
{
	//Static nested class department
	static class Department
	{
		//Instacnce variables for department 
		private String departmentName;
		private int facultyCount;
		
		//constructor to initialize department
		public Department(String departmentName, int facultyCount){
			this.departmentName = departmentName;
			this.facultyCount = facultyCount;
		}
		
		//Method to display department information
		void displayInfo()
		{
			System.out.println("Department Name :"+ departmentName);
			System.out.println("Number of Faculties :" + facultyCount);
		}
	}
}

class StaticNestedClass
{
	//Main method
	public static void main (String[] args){
		
		//creating an instace of the static nested class department
		University.Department d1 = new University.Department("Computer Science",50);
		d1.displayInfo();
	}
}
