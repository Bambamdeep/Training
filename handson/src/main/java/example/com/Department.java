package example.com;

import org.springframework.stereotype.Component;

//@Component
public class Department {
 
int id;
   String name;
   String location;
   
   public Department() {
	    id = 101;
	    name = "MicroService";
	    location = "Bangalore";
	    
   }
   public Department(int id, String name, String location) {
 		super();
 		this.id = id;
 		this.name = name;
 		this.location = location;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
}
public void iniMethod () {
	System.out.println("inside the initalization phase");
}
public void destroyMethod () {
	System.out.println("inside the initalization phase");
}
   
}
