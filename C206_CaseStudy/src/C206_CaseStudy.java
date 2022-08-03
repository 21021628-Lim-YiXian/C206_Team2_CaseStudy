import java.util.ArrayList;

public class C206_CaseStudy {
	//Joey
	//Yong Xing
	public static void main(String[] args) {
		int option = 0;

		while (option != 4) {
			MainMenu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {

			} else if (option == 2) { // Joey
				Enquiry();
			} else if (option == 3) {

			} else {
				System.out.println("Invalid type");
			}
		}
	}

	// Joey
	private static void Enquiry() {
		ArrayList<enquiry> enquiryList = new ArrayList<enquiry>();

		enquiryList.add(new enquiry("EI001", "Join", "Call-In : 31/07/2022 9:00AM : progressing", "31/07/2022", true));
		enquiryList
				.add(new enquiry("EI002", "Participate", "Send-In : 06/08/2021 11:05AM : Done", "06/08/2021", false));
		enquiryList
				.add(new enquiry("EI003", "Resign/withdraw", "Call-In : 23/06/2022 4:00PM : Done", "23/06/2022", true));
		enquiryList.add(
				new enquiry("EI004", "question", "Send-In : 08/08/2021 5:00PM : progressing", "08/08/2021", false));

		int option2 = 1;

		while (option2 != 4) {
			SubMenu();
			option2 = Helper.readInt("Enter an option > ");
			if (option2 == 1) {
				enquiry ei = inputEnquiry();
				C206_CaseStudy.addEnquiry(enquiryList, ei);
				System.out.println("added");

			} else if (option2 == 2) {
				C206_CaseStudy.viewAllEnquiry(enquiryList);

			} else if (option2 == 3) {
				deleteEnquiry(enquiryList);
			} else if (option2 == 4) {
				System.out.println("Quit");
			} else {
				System.out.println("Invalid options");
			}
		}
	}

	// delete-Joey
	public static void deleteEnquiry(ArrayList<enquiry> enquiryList) {
		String enquiryId = Helper.readString("Enter enquiry id > ");
		Boolean isDeleted = doDeleteEnquiry(enquiryList, enquiryId);

		if (isDeleted == false) {
			System.out.println("Invalid enquiry ID");
		} else {
			System.out.println("enquiry ID " + enquiryId + " deleted");
		}
	}

	public static boolean doDeleteEnquiry(ArrayList<enquiry> enquiryList, String enquiryId) {
		boolean isDeleted = false;

		for (int i = 0; i < enquiryList.size(); i++) {
			if (enquiryId.equalsIgnoreCase(enquiryList.get(i).getEnquiryId())) {
				enquiryList.remove(i);

				isDeleted = true;
			}
		}
		return isDeleted;
	}
	// add n input -Joey
	private static enquiry inputEnquiry() {
		String EnquiryId = Helper.readString("Enter EnquiryId >");
		String Title = Helper.readString("Enter Title >");
		String FollowupResponses = Helper.readString("FollowupResponses >");
		String Date = Helper.readString("Date >");
		boolean Urgency = Helper.readBoolean("Urgency (Y/N)>");

		enquiry ei = new enquiry(EnquiryId, Title, FollowupResponses, Date, Urgency);
		return ei;
	}

	public static void addEnquiry(ArrayList<enquiry> enquiryList, enquiry ei) {

		enquiryList.add(ei);
	}

	// option2- view n retrieve -Joey
	public static String retrieveAllEnquiry(ArrayList<enquiry> enquiryList) {
		String output = "";

		for (int i = 0; i < enquiryList.size(); i++) {

			output += String.format("%-15s %-15s %-50s %-30s %-15s\n", enquiryList.get(i).getEnquiryId(),
					enquiryList.get(i).getTitle(), enquiryList.get(i).getFollowupResponses(),
					enquiryList.get(i).getDate(), enquiryList.get(i).isUrgency());
		}
		return output;
	}

	public static void viewAllEnquiry(ArrayList<enquiry> enquiryList) {
//				EnquiryMain.setHeader("CAMCORDER LIST");
		String output = String.format("%-15s %-15s %-50s %-30s %-15s\n", "ENQUIRY ID", "TITLE", "FOLLOW UP-RESPONSES",
				"DATE/TIME", "URGENCY");
		output += retrieveAllEnquiry(enquiryList);
		System.out.println(output);
	}

	private static void MainMenu() {
		System.out.println("1. ADD TUITION");
		System.out.println("2. ADD ENQUIRY");
		System.out.println("3. TIMETABLE REGISTRATION");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void SubMenu() { // Joey
//				enquiry.setHeader("ENQUIRY DEPARTMENT");
		System.out.println("1. ADD ENQUIRY");
		System.out.println("2. VIEW ENQUIRY");
		System.out.println("3. DELETE ENQUIRY");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

}
