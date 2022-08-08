
public class Timetables {
	
	private int timetableId;
	private double price;
	private String studentEmail;
	private String startTime;
	private String endTime;
	private int ttmode;
	
	public Timetables(int timetableId, double price, String studentEmail, String startTime, String endTime, int ttmode) { 
		
		this.timetableId = timetableId;
		this.price = price;
		this.studentEmail = studentEmail;
		this.startTime = startTime;
		this.endTime = endTime;
		this.ttmode = ttmode;
		
	}
	
	public int getTimetableId() { 
		return timetableId;
		
	}
	
	public void setTimetableId ( int timetableId) { 
		this.timetableId = timetableId;
	}
	
	public double getPrice() { 
		return price;
	}
	
	public void setPrice ( double price) { 
		this.price = price;
	}
	
	public String getStudentEmail() { 
		return studentEmail;
	}
	
	public void setStudentEmail(String studentEmail) { 
		this.studentEmail = studentEmail;
	}
	
	public String getStartTime() { 
		return startTime;
		
	}
	
	public String getEndTime() { 
		return endTime;
	}
	
	public void setStartTime(String startTime) { 
		this.startTime = startTime;
	}
	
	public void setEndTime(String endTime) { 
		this.endTime = endTime;
	}
	
	public int getTTmode() { 
		return ttmode;
		
	}
	
	public void setMode(int ttmode) { 
		this.ttmode = ttmode;
	}

}
