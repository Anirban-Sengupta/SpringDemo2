package spring.demo2;

public class Employee {
	private String Name;
	private int Id;
	private int Age;
	private int Salary;

	// constructor Injection

	public Employee(String name, int id, int age) {
		this.Name = name;
		this.Id = id;
		this.Age = age;
	}

	public Employee(String name, int age) {
		super();
		Name = name;
		Age = age;
	}

	
	public Employee(String name, int id, int age, int salary) {
		super();
		Name = name;
		Id = id;
		Age = age;
		Salary = salary;
	}

	public String getName() {
		return Name;
	}

	/*
	 * public void setName(String name) { Name = name; }
	 */
	public int getId() {
		return Id;
	}

	/*
	 * public void setId(int id) { Id = id; }
	 */
	public int getAge() {
		return Age;
	}

	/*
	 * public void setAge(int age) { Age = age;
	 * 
	 * }
	 */
	
	public int getSalary() {
		return Salary;
	}

	/*public void setSalary(int salary) {
		Salary = salary;
	}*/


	void DisplayInfo() {
		System.out.println("Name:" + Name);
		System.out.println("Id:" + Id);
		System.out.println("Age:" + Age);
		System.out.println("sal:"+Salary);

	}

}
