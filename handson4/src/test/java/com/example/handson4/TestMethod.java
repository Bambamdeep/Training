package com.example.handson4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.handson4.Service.StudentService;
import com.example.handson4.model.Student;

//@SpringBootTest
//public class TestMethod {
//	@Autowired
//	StudentService service;
//   @Test
//  public void testAdd() {
	//  Student s = new Student (1,"Deepak");
	  
	 // Student s1 = service.add(s);
	 //assertNotNull(s1.getId());
	// assertEquals(s.getName(),s1.getName()); 
 // }
  // @Test
 // public void testByid() {
//	   Student s = new Student (2,"Bambam");
//	   service.add(s);
//	   Student getBYId = service.getById(2);
//	   assertNotNull(getBYId.getId());
//	   assertEquals (s.getId(),getBYId .getId());
 // }
 //    @Test
  // public void testDelete() {
//	   Student s = new Student (3,"deepak");
//	   service.add(s);
//	   boolean sDelete = service.delete(s.getId());
//	   
//       assertTrue(sDelete);   
  // }        
  //           @Test
//           public void testupdte() {
//        	   Student s = new Student (4,"Bambam");
//        	 Student s1 =  service.add(s);
//        	   s1.setName("deepak");
//        	   assertNotNull(s1.getId());
//        Student update = service.update(s1,s1.getId());
//        
//        assertNotNull(update);
//        assertEquals("deepak",update.getName());    	   
//}              
//             @Test
//             public void testfindall() {
//            	 Student s = new Student (4,"kumar");
//            	 Student s1 = new Student (5,"kumari");
//            	Student s2 = service.add(s);
//            	Student s3 = service.add(s2);
//            	List<Student> student = service.findAll();
//            	assertTrue (student.size()> 0 );
////            	
//         
//            	
//            	
//             }
//			
////}
