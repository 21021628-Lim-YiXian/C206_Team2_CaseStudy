import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Tuition tt1;
	private Tuition tt2;
	private Tuition tt3;
	
	private ArrayList<Tuition> TuitionList;


	@Before
	public void setUp() throws Exception {
		tt1 = new Tuition(1111, "Chemistry", "Science","Science that deals with the composition, structure, and properties of substances","1.5 Hours" ,"Above 15 years old" ,"Mr Tan");
		tt2 = new Tuition(1112, "Physics", "Science", "Science that deals with matter and energy and their interactions", "2 Hours","Above 13 years old" ,"Mrs Wong");
		tt3 = new Tuition(1112, "Physics", "Science", "Science that deals with matter and energy and their interactions", "2 Hours","Above 13 years old" ,"Mrs Wong");
		TuitionList= new ArrayList<Tuition>();
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
	
	@Test
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
	}
	
	@After
	public void tearDown() throws Exception {
		tt1 = null;
		tt2 = null;
		tt3 = null;
		
		TuitionList = null;
	}
	//1

}

