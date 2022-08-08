import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class C206_CaseStudy {
	 // Yong Xing
		public static void main(String[] args) {
			int option = 0;

			while (option != 5) {
				
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
							//Yong Xing
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
					ArrayList<TimetableRegistration> tregisList = new ArrayList<TimetableRegistration>();
					
					tregisList.add(new TimetableRegistration(1,24,"johnnytan@gmail.com"));
					tregisList.add(new TimetableRegistration(2,10,"johnnytan@gmail.com"));
					
					int optionTr = 0;

					while (optionTr != 4) {

						C206_CaseStudy.menu3();
						optionTr = Helper.readInt("Enter an option > ");

						if (optionTr == 1) {
							// View all items
							C206_CaseStudy.viewAllTimetableRegistrations(tregisList);

						} else if (optionTr == 2) {

							// Add a new item
							C206_CaseStudy.setHeader("ADD");
							TimetableRegistration tr = inputTimetableRegistration(tregisList);
							C206_CaseStudy.addTimetableRegistration(tregisList, tr);

						} else if (optionTr == 3) {

							// Loan item
							C206_CaseStudy.setHeader("DELETE");
							C206_CaseStudy.deleteTimetableRegistration(tregisList);

						} else if (optionTr == 4) {
							System.out.println("Bye!");
						} else {
							System.out.println("Invalid option");
						}

					}
					

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
					
					// Kyra 
					
					ArrayList<Timetables> ttList = new ArrayList<Timetables>();
					
				
					ttList.add(new Timetables(2345, 150.00, "jerry@gmail.com", "Start: 09/07/2022 4:00PM", "End: 09/07/2022 7:00PM", 4));
					ttList.add(new Timetables(6789, 200.00, "mary@gmail.com", "Start: 04/09/2022 2:00PM", "End: 04/09/2022 6:00PM", 2));
					
					
					int optiontt = 0;
					
					while(optiontt != 4) {
						
						C206_CaseStudy.menu4();
						optiontt = Helper.readInt("Enter an option >");
						
						 if(optiontt == 1) {
							 
							 // VIEW ALL TIMETABLES
							 
							 C206_CaseStudy.viewAllTimetables(ttList);
							 
						 } else if ( optiontt == 2) { 
							 
							 // ADD TIMETABLES
							 
							 int ttc = Helper.readInt("Enter tuition code > ");
							 
							 for ( int i = 0; i < ttList.size(); i++) { 
								 
								 if (ttList.get(i).getTimetableId() == ttc) { 
									 System.out.println("Tuition ID already exists.");
								 } else { 
									 
									Timetables ttb = inputTimetables(ttList);
									C206_CaseStudy.addTimetables(ttList, ttb);
									System.out.println("Tuition Timetable added.");
									
								 }
							 }
							 
						 } else if ( option == 3) { 
							 
							 // DELETE TIMETABLES 
							 
							 C206_CaseStudy.deleteTimetable(ttList);
							 
						 } else if ( option == 4) { 
							 System.out.println("Quit.");
							 
						 } else { 
							 System.out.println("Invalid Option.");
						 }
					}
					
					
					
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}

			}

		}
		
		//Menus from all members
		
		// Yong Xing - Main
		public static void menu() {
			C206_CaseStudy.setHeader("TUITION CENTRE APP");
			System.out.println("1. Yong Xing");
			System.out.println("2. Yi Xian");
			System.out.println("3. Joey");
			System.out.println("4. Kyra");
			System.out.println("5. Quit");
			Helper.line(80, "-");

		}
		// Yong Xing - Tuition
		public static void menu1() {
			C206_CaseStudy.setHeader("TUITION CENTRE APP");
			System.out.println("1. Display Tuition");
			System.out.println("2. Add Tuition");
			System.out.println("3. Delete Tuition");
			System.out.println("4. Quit");
			Helper.line(80, "-");
		}
		//Joey - Enquiry
		private static void Menu2() { 
//			enquiry.setHeader("ENQUIRY DEPARTMENT");
			System.out.println("1. ADD ENQUIRY");
			System.out.println("2. VIEW ENQUIRY");
			System.out.println("3. DELETE ENQUIRY");
			System.out.println("4. Quit");
			Helper.line(80, "-");
		}
		// Yi Xian - Timetable Registration
		public static void menu3() {
			C206_CaseStudy.setHeader("TIMETABLE REGISTRATION");
			System.out.println("1. View Registration");
			System.out.println("2. Add Timetable Registration");
			System.out.println("3. Delete Timetable Registration");
			System.out.println("4. Quit");
			Helper.line(80, "-");
			
		}
		
		// Kyra - Timetable Update 
		public static void menu4() { 
			
			C206_CaseStudy.setHeader("TIMETABLE UPDATE");
			System.out.println("1. VIEW TUITION TIMETABLES");
			System.out.println("2. ADD TUITION TIMETABLES");
			System.out.println("3. DELETE TUITION TIMETABLES");
			System.out.println("4. Quit");
			Helper.line(80, "-");
			
			
			
			
		}
		
		// Yong Xing - Header
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
		
		
		
		
		// Yi Xian - Tuition Timetable Registration
		
		// Yi Xian - Option 1 - View Timetable Registration
		
		public static String retrieveAllTimetableRegistrations(ArrayList<TimetableRegistration> tregisList) {
			String output = "";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			for (TimetableRegistration tr : tregisList) {
				String formatDateTime = tr.getDateTime().format(formatter);
				output += String.format("%-20d %-15d %-35s %-35s %-10s\n",tr.getRegistrationNo(),tr.getTimetableId(),
						tr.getStudentEmail(),formatDateTime,tr.getStatus());
			}
			return output;
		}
		
		public static void viewAllTimetableRegistrations(ArrayList<TimetableRegistration> tregisList) {
			C206_CaseStudy.setHeader("TIMETABLE REGISTRATIONS");
			String output = String.format("%-20s %-15s %-35s %-35s %-10s\n", "REGISTRATION NO.", "TIMETABLE ID",
					"STUDENT EMAIL", "REGISTRATION DATE/TIME","STATUS");
			output += retrieveAllTimetableRegistrations(tregisList);
			System.out.println(output);
		}
		
		// Yi Xian - Option 2 - Add Timetable Registration
		
		public static TimetableRegistration inputTimetableRegistration(ArrayList<TimetableRegistration> tregisList) {
			int rNo = tregisList.get(tregisList.size() - 1).getRegistrationNo() + 1;
			int ttId = Helper.readInt("Enter Timetable ID > ");
			String sEmail = Helper.readString("Enter Student Email > ");
					
			TimetableRegistration tr= new TimetableRegistration(rNo, ttId, sEmail);
			return tr;
			
		}
		public static void addTimetableRegistration(ArrayList<TimetableRegistration> tregisList, TimetableRegistration tr) {
			tregisList.add(tr);
			System.out.println("Tution Registration: No. " + tr.getRegistrationNo() + " has been added!");
		}
		
		// Yi Xian - Option 3 - Delete Timetable Registration
		
		public static void deleteTimetableRegistration(ArrayList<TimetableRegistration> tregisList) {
			int rNo = Helper.readInt("Enter Registration No. to delete > ");
			for (TimetableRegistration tr : tregisList) {
				if (tr.getRegistrationNo() == rNo) {
					tregisList.remove(tr);
					break;
				}
			}
			System.out.println("Tution Registration: No. " + rNo + " has been deleted!");
		}
		
		// Kyra - Timetable Updates (ADMIN) 
		
		// Kyra -  Option 1 - View Timetables 
		
		public static String retrieveAllTimetables(ArrayList<Timetables>ttList) { 
			String output = "";
			
			for (Timetables tt : ttList) {
	
				output += String.format("%-20d %-15d %-35s %-35s %-10s\n",tt.getTimetableId(), tt.getPrice(), 
						tt.getStudentEmail(),tt.getStartTime(), tt.getEndTime(),tt.getTTmode());
			}
				return output;
			}
		
		public static void viewAllTimetables(ArrayList<Timetables> ttList) { 
			
			 String output = String.format("%-15s %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n",
					 "TIMETABLE ID" , "PRICE" , "EMAIL" , "START DATE/TIME" , "END DATE/TIME" , "MODE");
			 
			 output += retrieveAllTimetables(ttList);
			 System.out.println(output);
		}
		
		// Kyra - Option 2 - Add Timetable 
		
		public static Timetables inputTimetables(ArrayList<Timetables> ttList) {
			
			int timetableId = Helper.readInt("Enter Tuition Timetable ID > ");
			double price = Helper.readDouble("Enter Price >");
			String studentEmail = Helper.readString("Enter student's email > ");
			String startTime = Helper.readString("Enter Start Date/Time >");
			String endTime = Helper.readString("Enter End Date/Time >");
			int ttmode = Helper.readInt("Enter mode >");
			
			Timetables ttb = new Timetables (timetableId, price, studentEmail, startTime, endTime, ttmode);
			return ttb;
		}
		
		public static void addTimetables(ArrayList<Timetables> ttList, Timetables tt) {
			ttList.add(tt);
			System.out.println("Tution Timetable ID: " + tt.getTimetableId() + " has been added!");
		}
		
		
		// Kyra - Option 3 - Delete Timetable 
		
		public static void deleteTimetable(ArrayList<Timetables> ttList) { 
			
			int ttc = Helper.readInt("Enter Tuition ID > ");
			
			for ( int i = 0; i < ttList.size(); i++) { 
				if ( ttList.get(i).getTimetableId() == ttc) { 
					ttList.remove(i);
					
					System.out.println("Tuition Timetable ID" + ttc + "Has been Deleted.");
				} else { 
					System.out.println("Tuition timetable ID  does not exist.");
				}
			}
			
		}

}
