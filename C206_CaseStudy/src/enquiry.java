
public class enquiry{
	private String EnquiryId;
	private String Title;
	private String Date;
	private String FollowupResponses;
	private boolean Urgency;

	public enquiry(String EnquiryId, String Title, String FollowupResponses,String Date,boolean Urgency) {
		this.EnquiryId = EnquiryId;
		this.Title = Title;
		this.FollowupResponses = FollowupResponses;
		this.Date = Date;
		this.Urgency = Urgency;
		
	}
	public String getEnquiryId() {
		return EnquiryId;
	}
	public void setEnquiryId(String enquiryId) {
		EnquiryId = enquiryId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getFollowupResponses() {
		return FollowupResponses;
	}
	public void setFollowupResponses(String followupResponses) {
		FollowupResponses = followupResponses;
	}
	public boolean isUrgency() {
		return Urgency;
	}
	public void setUrgency(boolean urgency) {
		Urgency = urgency;
	}
	public static String showUrgency(boolean isUrgency) {
		String Urgency;

		if (isUrgency == true) {
			Urgency = "Yes";
		} else {
			Urgency = "No";
		}
		return Urgency;
	}
}

