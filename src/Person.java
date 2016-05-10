
public class Person {
	private String m_firstName, m_lastName;
	private int m_age;
	private float m_weight;
	
	public Person(){}
	public Person(String fname, String lname){
		this.m_firstName = fname;
		this.m_lastName = lname;
	}
	public void setAge(int age){
		this.m_age = age;
	}
	public void setFirstName(String fname){
		this.m_firstName = fname;
	}
	public void setWeight(float weight){
		this.m_weight = weight;
	}
	public String displayFullName() {
		return this.m_firstName + " " + this.m_lastName;
	}
}
