package annotation_example_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Mansi")
	private String name;
	@Value("Mansi@gmail.com")
	private String email;
	@Value("234")
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void disp() {
		System.out.println("name : "+name);
		System.out.println("email : "+email);
		System.out.println("marks : "+marks);

	}
}
