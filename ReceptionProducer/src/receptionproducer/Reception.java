package receptionproducer;

public class Reception {
	
	String receptionId, receptionName,  salary, degree, degreeAmount ;
	
 // degree = student want degree name  All receptionist have dgree list 
//	this reception have this degree details thats one
	//degree name 
	//degree amount

	 
	
	public Reception() { 

	}

	public Reception(String receptionId, String receptionName, String salary, String degree, String degreeAmount) {
		super();
		this.receptionId = receptionId;
		this.receptionName = receptionName;
		this.salary = salary;
		this.degree = degree;
		this.degreeAmount = degreeAmount;
		
	}

	public String getReceptionId() {
		return receptionId;
	}

	public void setReceptionId(String receptionId) {
		this.receptionId = receptionId;
	}

	public String getReceptionName() {
		return receptionName;
	}

	public void setReceptionName(String receptionName) {
		this.receptionName = receptionName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDegreeAmount() {
		return degreeAmount;
	}

	public void setDegreeAmount(String degreeAmount) {
		this.degreeAmount = degreeAmount;
	}

	

	
	
	

}
