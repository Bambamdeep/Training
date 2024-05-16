package springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
   Student s = (Student)context.getBean("stu");
   System.out.println(s);
	}

}
