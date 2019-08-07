package spring.demo2;

public class Employee {
	private String Name;
	private int Id;
	private int Age;

	//constructor Injection
	
	 public Employee(String name, int id, int age) {
		this.Name = name;
		this.Id = id;
		this.Age = age;
	}

	public String getName() {
		return Name;
	}

	/*public void setName(String name) {
	      Name = name;
	}
*/
    public int getId() {
		return Id;
	}

	/*public void setId(int id) {
		Id = id;
	}
*/
	public int getAge() {
		return Age;
	}

	/*public void setAge(int age) {
		Age = age;
		
	}
	*/

	void DisplayInfo() {
		System.out.println("Name:" + Name);
		System.out.println("Id:" + Id);
		System.out.println("Age:" + Age);

	}

}
