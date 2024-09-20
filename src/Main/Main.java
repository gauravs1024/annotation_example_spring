package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation_example_spring.Student;

/*Annotation Example using xml file
 * */


public class Main {
	 static String resource_file_path="sp/resources/applicationContext.xml";
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext(resource_file_path);
		Student std=(Student)context.getBean("student");
		std.disp();
	}
}
