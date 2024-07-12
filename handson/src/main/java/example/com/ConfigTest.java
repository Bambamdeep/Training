package example.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigrationDemo.class);
		Department d = (Department)context.getBean("Dept");
		System.out.println (d);
		
		Department d1 = (Department)context.getBean("Dept1");
	
     
        System.out.println(d.hashCode());
        System.out.println(d1.hashCode());
		

	
	}
}
