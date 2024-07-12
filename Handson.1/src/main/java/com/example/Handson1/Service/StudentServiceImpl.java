package com.example.Handson1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.Handson1.Dao.StudentRepository;
import com.example.Handson1.Exception.DataIncorrect;
import com.example.Handson1.Exception.StudentNotFound;
import com.example.Handson1.Model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
StudentRepository repository;
	@Override
	public Student addStudent(Student student) throws DataIncorrect{
	
		return repository.save(student);
	}
	@Override
	public List<Student> allStudent(int pageNumber , int pageSize) {
	
		Pageable p = PageRequest.of(pageNumber, pageSize);
		Page<Student> s = repository.findAll(p);
		List<Student> stu1 = s.getContent();
	//	return repository.findAll();
		return stu1;
	}
	@Override
	public void delete(int sId) throws StudentNotFound{
		if(repository.existsById(sId)) {
		repository.deleteById(sId);
		}
		else {
			throw new StudentNotFound("Student Not FOund");
		}
		
	}
	@Override
	public List<Student> getStudentByName(String name) {
		// TODO Auto-generated method stub
		List<Student> stu = repository.findAll();
		List<Student> student = new ArrayList<>();
		for(Student s : stu) {
			if(s.getName().equals(name)) {
				student.add(s);
			}
			
		}
		return student;
	}
	@Override
	public Student update(Student student, int sId) throws StudentNotFound {
            Student stu = repository.findById(sId).orElseThrow(()-> new StudentNotFound("Student Not FOund"));
	      stu.setName(student.getName());
	      stu.setStandard(student.getStandard());
	      stu.setSection(student.getSection());
	      stu.setSchoolName(student.getSchoolName());
	      stu.setPhone(student.getPhone());
		return repository.save(stu);
	}
	@Override
	public Student findById(int sId) throws StudentNotFound {
		// TODO Auto-generated method stub
		return repository.findById(sId).orElseThrow(()->  new StudentNotFound("Student Not FOund WITH THis : " +sId)) ;
	}
	
	
	


}
