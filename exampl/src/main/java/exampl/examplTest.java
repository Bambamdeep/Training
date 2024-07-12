package exampl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class examplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(examplconfig.class);
		Student s = (Student)context.getBean(Student.class);
		System.out.println("The Value is :" + s);
		System.out.println("The Value of Result is :");
		Result r =  (Result)context.getBean(Result.class);
		System.out.println(r);
		 ShapeService ss = context.getBean(ShapeService.class);
		 ss.printArea();
		
	}

}
