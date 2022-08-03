import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//Joey Fook
	private enquiry ei1;
	private enquiry ei2;
	private enquiry ei3;
	private enquiry ei4;
	
	private ArrayList<enquiry>enquiryList;
	
	@Before //Joey
	public void setUp() throws Exception {
		ei1 = new enquiry("EI001","Join","Call-In : 31/07/2022 9:00AM : Progressing","31/07/2022",true);
		ei2 = new enquiry("EI002","Participate", "Send-In : 06/08/2021 11:05AM : Done", "06/08/2021",false);
		ei3 = new enquiry("EI003", "Resign/withdraw", "Call-In : 23/06/2022 4:00PM : Done","23/06/2022", true);
		ei4 = new enquiry("EI004", "question",  "Send-In : 08/08/2021 5:00PM : progressing","08/08/2021", false);
		enquiryList = new ArrayList<enquiry>();
	}
	

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
	public void testRetrieveAllEnquiry() {
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
		testOutput = String.format("%-15s %-15s %-50s %-30s %-15b\n","EI001","Join","Call-In : 31/07/2022 9:00AM : Progressing","31/07/2022",true);
		testOutput += String.format("%-15s %-15s %-50s %-30s %-15b\n","EI002","Participate", "Send-In : 06/08/2021 11:05AM : Done", "06/08/2021",false);
		testOutput += String.format("%-15s %-15s %-50s %-30s %-15b\n","EI003", "Resign/withdraw", "Call-In : 23/06/2022 4:00PM : Done","23/06/2022", true);
		testOutput += String.format("%-15s %-15s %-50s %-30s %-15b\n", "EI004", "question",  "Send-In : 08/08/2021 5:00PM : progressing","08/08/2021", false);
		
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


	@After //Joey
	public void tearDown() throws Exception {
		ei1 = null;
		ei2 = null;
		enquiryList = null;
	}

}

