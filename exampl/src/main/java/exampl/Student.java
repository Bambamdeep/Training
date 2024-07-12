package exampl;

import org.springframework.stereotype.Component;

@Component

class Student {
	int id;
	String name;
	String subject;
	int marks;
	public Student () {
		id = 101;
		name = "Deepak";
		subject = "spring";
		marks = 85;
		
	}

	public Student(int id, String name, String subject, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	
}
