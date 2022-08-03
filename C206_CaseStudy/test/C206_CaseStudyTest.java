import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Tuition tt1;
	private Tuition tt2;
	private Tuition tt3;
	
	//Joey
		private enquiry ei1;
		private enquiry ei2;
		private enquiry ei3;
		private enquiry ei4;
	
	private ArrayList<Tuition> TuitionList;
	private ArrayList<enquiry>enquiryList; //Joey

	@Before
	public void setUp() throws Exception {
		tt1 = new Tuition(1111, "Chemistry", "Science","Science that deals with the composition, structure, and properties of substances","1.5 Hours" ,"Above 15 years old" ,"Mr Tan");
		tt2 = new Tuition(1112, "Physics", "Science", "Science that deals with matter and energy and their interactions", "2 Hours","Above 13 years old" ,"Mrs Wong");
		tt3 = new Tuition(1112, "Physics", "Science", "Science that deals with matter and energy and their interactions", "2 Hours","Above 13 years old" ,"Mrs Wong");
		TuitionList= new ArrayList<Tuition>();
		
		//Joey
		ei1 = new enquiry("EI001", "Join", "Call-In : 31/07/2022 9:00AM : Progressing", "31/07/2022", true);
		ei2 = new enquiry("EI002", "Participate", "Send-In : 06/08/2021 11:05AM : Done", "06/08/2021", false);
		ei3 = new enquiry("EI003", "Resign/withdraw", "Call-In : 23/06/2022 4:00PM : Done", "23/06/2022", true);
		ei4 = new enquiry("EI004", "question", "Send-In : 08/08/2021 5:00PM : progressing", "08/08/2021", false);
		enquiryList = new ArrayList<enquiry>();		
	}
	

	
	
	@Test
	public void testRetrieveAllTuition() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Tuition arraylist to add to", TuitionList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String allTuition= C206_CaseStudy.retrieveAllTuition(TuitionList);
		String testOutput = "";
		assertEquals("Check that ViewAllTuitionlist", testOutput, allTuition);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addTuition(TuitionList, tt1);
		C206_CaseStudy.addTuition(TuitionList, tt2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, TuitionList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allTuition= C206_CaseStudy.retrieveAllTuition(TuitionList);

		testOutput = String.format("%-12d %-15s %-20s %-90s %-20s %-20s %-20s\n", 1111, "Chemistry", "Science","Science that deals with the composition, structure, and properties of substances","1.5 Hours" ,"Above 15 years old" ,"Mr Tan");
		testOutput += String.format("%-12d %-15s %-20s %-90s %-20s %-20s %-20s\n", 1112, "Physics", "Science", "Science that deals with matter and energy and their interactions", "2 Hours","Above 13 years old" ,"Mrs Wong");
	
		assertEquals("Check that ViewAllTuitionlist", testOutput, allTuition);
		
	}
	
	@Test
	public void testAddTuition() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Tuition arraylist to add to", TuitionList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addTuition(TuitionList, tt1);		
		assertEquals("Test if that Tuition arraylist size is 1?", 1, TuitionList.size());
		
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Tuition is added same as 1st item of the list?", tt1, TuitionList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addTuition(TuitionList, tt2);
		C206_CaseStudy.addTuition(TuitionList, tt3);
		assertEquals("Test that Tuition arraylist size is 2?", 3, TuitionList.size());
		assertSame("Test that Tuition is added same as 3rd item of the list?", tt3, TuitionList.get(2));
	}
	
	/*@Test
	public void testDeleteTuition() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Tuition arraylist to delete from", TuitionList);
		C206_CaseStudy.addTuition(TuitionList, tt1);	
		C206_CaseStudy.addTuition(TuitionList, tt2);
		
		//Given an list with 2, after deleting 1 item, the size of the list is 1
		C206_CaseStudy.deleteTuition(TuitionList);		
		assertEquals("Test if that Tuition arraylist size is 1?", 1, TuitionList.size());
		
		
		//Delete another item. test The size of the list is 0?
		C206_CaseStudy.deleteTuition(TuitionList);
		assertEquals("Test that Tuition arraylist size is 0?", 0, TuitionList.size());
	} */
	
	@Test //Joey
	public void testAddEnquiry() {
//		fail("Not yet implemented");
		assertNotNull("Check if there is valid Enquiry arraylist to add to", enquiryList);
		C206_CaseStudy.addEnquiry(enquiryList, ei1);
		assertEquals("Check that Enquiry arraylist size is 1", 1, enquiryList.size());
		assertSame("Check that Enquiry is added", ei1, enquiryList.get(0));
		
		C206_CaseStudy.addEnquiry(enquiryList, ei2);
		assertEquals("Check that Enquiry arraylist size is 2", 2, enquiryList.size());
		assertSame("Check that Enquiry is added", ei2, enquiryList.get(1));
	}
	@Test //Joey
	public void testRetriveAllEnquiry() {
		assertNotNull("Test if there is valid Enquiry arraylist to retrieve item", enquiryList);
		String allEnquiry= C206_CaseStudy.retrieveAllEnquiry(enquiryList);
		String testOutput = "";
		assertEquals("Check that ViewAllEnquiryList", testOutput, allEnquiry);
		C206_CaseStudy.addEnquiry(enquiryList, ei1);
		C206_CaseStudy.addEnquiry(enquiryList, ei2);
		C206_CaseStudy.addEnquiry(enquiryList, ei3);
		C206_CaseStudy.addEnquiry(enquiryList, ei4);
		assertEquals("Test that Enquiry arraylist size is 4", 4, enquiryList.size());
		allEnquiry= C206_CaseStudy.retrieveAllEnquiry(enquiryList);
		testOutput = String.format("%-15s %-15s %-50s %-15s %-15b\n","EI001","Join","Call-In : 31/07/2022 9:00AM : Progressing","31/07/2022",true);
		testOutput += String.format("%-15s %-15s %-50s %-15s %-15b\n","EI002","Participate", "Send-In : 06/08/2021 11:05AM : Done", "06/08/2021",false);
		testOutput += String.format("%-15s %-15s %-50s %-15s %-15b\n","EI003", "Resign/withdraw", "Call-In : 23/06/2022 4:00PM : Done","23/06/2022", true);
		testOutput += String.format("%-15s %-15s %-50s %-15s %-15b\n", "EI004", "question",  "Send-In : 08/08/2021 5:00PM : progressing","08/08/2021", false);
		
		assertEquals("Test that ViewAllEnquirylist", testOutput, allEnquiry);
	}
	@Test //Joey
	public void testDeleteEnquiry() {
		    //boundary
		    assertNotNull("Test if there is valid Enquiry arraylist to delete", enquiryList);
		    C206_CaseStudy.addEnquiry(enquiryList,ei1);

		    //normal
		    Boolean isDeleted = C206_CaseStudy.doDeleteEnquiry(enquiryList, "EI001");;
		    assertTrue("Check that 'EI001' is deleted - true?", isDeleted);
		    //error
		    isDeleted = C206_CaseStudy.doDeleteEnquiry(enquiryList, "EI002");;
		    assertFalse("Check that 'EI002' is deleted - false?", isDeleted);
		  }

	
	@After
	public void tearDown() throws Exception {
		tt1 = null;
		tt2 = null;
		tt3 = null;
		
		//Joey
		ei1 = null; 
		ei2 = null;
		
		TuitionList = null;
		enquiryList = null; //Joey
	}
	//1

}

