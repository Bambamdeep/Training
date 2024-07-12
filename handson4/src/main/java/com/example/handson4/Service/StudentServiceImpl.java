package com.example.handson4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.handson4.Exception.DataIncorrectException;
import com.example.handson4.Exception.IdNotFoundException;
import com.example.handson4.Repo.StudentRepo;
import com.example.handson4.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepo repo;
	@Override
	public Student add(Student student) {
		//if(student.getId()==0 && student.getfName()==null && student.getlName()==null && student.getNumber()==null) {
	//throw new DataIncorrectException("Id Should Not Null == "+ student.getId()+" "  + " ,"
	
//	+ " fName Should Not Null == " + student.getfName() +" "  + " ,"
//	+ " lName Should Not Null == " + student.getlName()
//	+" "  + " ,"
//	+ " Number Should Not Null == " + student.getNumber());
		//}
		return repo.save(student);
	}
	@Override
	public Student getById(int id) throws IdNotFoundException{
		
		return repo.findById(id).orElseThrow(()-> new IdNotFoundException());
	}
	@Override
	public boolean delete(int id) {
		if(repo.existsById(id)) {
		repo.deleteById(id);
		}
		else {
			throw  new IdNotFoundException();
		}
		return true;
		
	}
	@Override
	public Student update(Student student, int id)throws IdNotFoundException {
		Student stu = repo.findById(id).orElseThrow(()-> new IdNotFoundException());
		stu.setfName(student.getfName());
		stu.setlName(student.getlName());
		stu.setPhone(student.getPhone());
		return stu;
	}
	@Override
	public List<Student> findAll() {
		
		return repo.findAll();
	}

}
