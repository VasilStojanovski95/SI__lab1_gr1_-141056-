import java.util.ArrayList;
import java.util.Arrays;

class Student {
	String index;
	String firstName;
	String lastName;
	List<int> labPoints = new ArrayList<>();
	
	//constructor
	public Student(int index, String firstName, String lastName)
	{
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//TODO seters & getters
	public String setIndex(String index) { this.index = index;}
	public String setFirstName(String firstName) {this.firstName = firstName;}
	public String setLastName(String firstName) {this.lastName = lastName;}
	
	public String getIndex() { return this.index;}
	public String getFirstName() { return this.firstName;}
	public String getLastName() { return this.lastName;}
	
	public double getAverage() {
		//TODO
		int total = 0;
		int size = labPoints.size();
		labPoints.forEach(p -> total += p);
		double avg = total/size;
		return avg;
	}

	public boolean hasSignature() {
		if (labPoints.size() >= 8) 
			{
				return true;
			}
		else 
			{
				return false;
			}
	}
}
