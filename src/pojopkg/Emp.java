package pojopkg;

public class Emp {
	int empId; 
	String empName;
	int Age;
	String Qualification;
	String Designation;
	int DOB;
	int Salary;
	int leaveCount;
	int Experience;
	
	
	public Emp(int empId, String empName, int age, String qualification, String designation, int dOB, int salary,
			int leaveCount, int experience) {
		super();
		this.empId = empId;
		this.empName = empName;
		Age = age;
		Qualification = qualification;
		Designation = designation;
		DOB = dOB;
		Salary = salary;
		this.leaveCount = leaveCount;
		Experience = experience;
	}
	public Emp() {
		
	}
	
	public Emp(int eid, String ename, int age2, String qual, String dest, String dob2, int sal, int leavecount2,
			int exp) {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getLeaveCount() {
		return leaveCount;
	}
	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", Age=" + Age + ", Qualification=" + Qualification
				+ ", Designation=" + Designation + ", DOB=" + DOB + ", Salary=" + Salary + ", leaveCount=" + leaveCount
				+ ", Experience=" + Experience + "]";
	}
}
