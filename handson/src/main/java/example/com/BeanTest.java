package example.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("spring.xml");
		   
		Department D = (Department)context.getBean("dept");
		System.out.println(D);
		Employee E = (Employee)context.getBean("emp");
		System.out.println(E);
		 

	}

}
