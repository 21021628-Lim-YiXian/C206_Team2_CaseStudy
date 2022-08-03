import java.util.ArrayList;

public class C206_CaseStudy {
	 // Yong Xing
		public static void main(String[] args) {
			int option = 0;

			while (option != 4) {
				
				C206_CaseStudy.menu();
				option = Helper.readInt("Enter an option > ");

				if (option == 1) {
					// Yong Xing
					ArrayList<Tuition> TuitionList = new ArrayList<Tuition>();

					TuitionList.add(new Tuition(1111, "Chemistry", "Science","Science that deals with the composition, structure, and properties of substances","1.5 Hours" ,"Above 15 years old" ,"Mr Tan"));
					TuitionList.add(new Tuition(1112, "Physics", "Science", "Science that deals with matter and energy and their interactions", "2 Hours","Above 13 years old" ,"Mrs Wong"));
					
					int option1 = 0;

					while (option1 != 4) {

						C206_CaseStudy.menu1();
						option1 = Helper.readInt("Enter an option > ");

						if (option1 == 1) {
							// View all items
							C206_CaseStudy.viewAllTuition(TuitionList);
							

						} else if (option1 == 2) {
							// Add a new item
							C206_CaseStudy.setHeader("ADD TUITION");			
							
							Tuition tt = inputTuition(TuitionList);
							C206_CaseStudy.addTuition(TuitionList, tt);
							System.out.println("Tuition added");
							



						}  else if (option1 == 3) {
							// Delete item
							C206_CaseStudy.setHeader("DELETE TUITION");		
							C206_CaseStudy.deleteTuition(TuitionList);
							



						} else if (option1 == 4) {
							System.out.println("Bye!");
						} else {
							System.out.println("Invalid option");
						}

					}
				

				} else if (option == 2) {
					// Yi Xian
					

				} else if (option == 3) {
					// Joey
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
						Menu2();
						option2 = Helper.readInt("Enter an option > ");
						if (option2 == 1) {
							enquiry ei = inputEnquiry();
							C206_CaseStudy.addEnquiry(enquiryList, ei);
							System.out.println("added");

						} else if (option2 == 2) {
							viewEnquiry();
							C206_CaseStudy.viewAllEnquiry(enquiryList);

						} else if (option2 == 3) {
							deleteEnquiry(enquiryList);
						} else if (option2 == 4) {
							System.out.println("Quit");
						} else {
							System.out.println("Invalid options");
						}
					}					

				} else if (option == 4) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}

			}

		}
		// Yong Xing
		public static void menu() {
			C206_CaseStudy.setHeader("TUITION CENTRE APP");
			System.out.println("1. Yong Xing");
			System.out.println("2. Yi Xian");
			System.out.println("3. Joey");
			System.out.println("4. Quit");
			Helper.line(80, "-");

		}
		// Yong Xing
		public static void menu1() {
			C206_CaseStudy.setHeader("TUITION CENTRE APP");
			System.out.println("1. Display Tuition");
			System.out.println("2. Add Tuition");
			System.out.println("3. Delete Tuition");
			System.out.println("4. Quit");
			Helper.line(80, "-");
		}
		//Joey
		private static void Menu2() { 
//			enquiry.setHeader("ENQUIRY DEPARTMENT");
			System.out.println("1. ADD ENQUIRY");
			System.out.println("2. VIEW ENQUIRY");
			System.out.println("3. DELETE ENQUIRY");
			System.out.println("4. Quit");
			Helper.line(80, "-");
		}
		
		// Yong Xing
		public static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");
		}
		// Yong Xing
		public static String retrieveAllTuition(ArrayList<Tuition> TuitionList) {
			String output = "";

			for (int i = 0; i < TuitionList.size(); i++) {

				output += String.format("%-12d %-15s %-20s %-90s %-20s %-20s %-20s\n", TuitionList.get(i).getTuitionCode(),
						TuitionList.get(i).getTuitionTitle(), TuitionList.get(i).getSubjectGName(),
						TuitionList.get(i).getTuitionDesc(), TuitionList.get(i).getTuitionDur(),
						TuitionList.get(i).getPreReq(), TuitionList.get(i).getTeacher());
			}
			return output;
		}
		// Yong Xing
		public static void viewAllTuition(ArrayList<Tuition> TuitionList) {
			C206_CaseStudy.setHeader("TUITION LIST");
			String output = String.format("%-10s %-15s %-20s %-90s %-20s %-20s %-20s\n", "TUITION CODE", "TUITION TITLE",
					"SUBJECT GROUP NAME", "TUITION DESCRIPTION", "TUITION DURATION", "PRE REQUISITE", "TEACHER");
			output += retrieveAllTuition(TuitionList);
			System.out.println(output);
		}
		// Yong Xing
		public static Tuition inputTuition(ArrayList<Tuition> TuitionList) {
			int code = TuitionList.get(TuitionList.size() - 1).getTuitionCode() + 1;
			String title = Helper.readString("Enter tuition title > ");
			String subjname = Helper.readString("Enter subject group name > ");
			String description = Helper.readString("Enter tuition description > ");
			String duration = Helper.readString("Enter duration > ");
			String preReq = Helper.readString("Enter pre-requisite > ");
			String teacher = Helper.readString("Enter Teacher > ");

			Tuition tt = new Tuition(code, title, subjname, description, duration, preReq, teacher);
	 return tt;

		}
		// Yong Xing
		public static void addTuition(ArrayList<Tuition> TuitionList, Tuition tt) {
			TuitionList.add(tt);

		}
		// Yong Xing
		public static void deleteTuition(ArrayList<Tuition> TuitionList) {
			int code = Helper.readInt("Enter tuition code to remove> ");
			for (int i = 0; i < TuitionList.size(); i++) {
				if (TuitionList.get(i).getTuitionCode() == code) {
					TuitionList.remove(TuitionList.get(i));
					System.out.println("Tuition Deleted!");
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
		//Joey
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

		private static void viewEnquiry() {

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

				output += String.format("%-15s %-15s %-50s %-15s %-15s\n", enquiryList.get(i).getEnquiryId(),
						enquiryList.get(i).getTitle(), enquiryList.get(i).getFollowupResponses(),
						enquiryList.get(i).getDate(), enquiryList.get(i).isUrgency());
			}
			return output;
		}
		//Joey
		public static void viewAllEnquiry(ArrayList<enquiry> enquiryList) {
//					EnquiryMain.setHeader("CAMCORDER LIST");
			String output = String.format("%-15s %-15s %-50s %-15s %-15s\n", "ENQUIRY ID", "TITLE", "FOLLOW UP-RESPONSES",
					"DATE/TIME", "URGENCY");
			output += retrieveAllEnquiry(enquiryList);
			System.out.println(output);
		}

}
