package exampl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Result {
	
int percentage;
@Autowired
Student student;
public Result () {
	percentage = 85;
}
public Result(int percentage) {
	super();
	this.percentage = percentage;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Result [percentage=" + percentage + ", student=" + student + "]";
}


}