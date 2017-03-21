package bcci;
import java.util.Date;
public class Employee {
         private long Id;
         private String FristName;
         private String LastName;
         private String City;
         private String Address;
         private String State;
         private Date Dob;
         private long salary;
         private String Job;
         private Date JoinDate;
         private String Status;
         
         public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getFristName() {
			return FristName;
		}
		public void setFristName(String fristName) {
			FristName = fristName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public Date getDob() {
			return Dob;
		}
		public void setDob(Date dob) {
			Dob = dob;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public String getJob() {
			return Job;
		}
		public void setJob(String job) {
			Job = job;
		}
		public Date getJoinDate() {
			return JoinDate;
		}
		public void setJoinDate(Date joinDate) {
			JoinDate = joinDate;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		
}
