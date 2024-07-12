package example.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigrationDemo {
	
	@Bean("Dept")
	//@Scope("prototype")
	
	public Department createdepartment() {
		return  new Department (107,"Sap","Btm");
		
	}
    @Bean("Dept1")
	
	public Department createdepartment1() {
		return  new Department (108,"Electrical","kolkata");
		
	}
     @Bean("emp")
      public Employee createemployee() {
		return new Employee(109,"Narendra", createdepartment());
	}

    
}

