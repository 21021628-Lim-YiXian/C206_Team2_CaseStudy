import java.time.LocalDateTime;


public class TimetableRegistration {
	
	private int registrationNo;
	private int timetableId;
	private String studentEmail;
	private LocalDateTime dateTime;
	private String status;
	
	public TimetableRegistration(int registrationNo, int timetableId, String studentEmail) {
		this.registrationNo = registrationNo;
		this.timetableId = timetableId;
		this.studentEmail = studentEmail;
		this.dateTime = LocalDateTime.now();
		this.status = "Pending";
	}
	
	public int getRegistrationNo() {
		return registrationNo;
		
	}
	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}
	
	public int getTimetableId() {
		return timetableId;
	}
	
	public void setTimetableId(int timetableId) {
		this.timetableId = timetableId;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
