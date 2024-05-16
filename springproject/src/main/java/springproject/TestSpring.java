package springproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigs.class);
		Address addr = (Address) context.getBean(Address.class);
		System.out.println(addr.getDno()+" "+addr.getStreet()+" "+addr.getCity());
	}

}
 