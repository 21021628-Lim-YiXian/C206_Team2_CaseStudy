
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21023096, 2 Aug 2022 6:33:03 pm
 */

public class Tuition {
	public int tuitionCode;
	public String tuitionTitle;
	public String subjectGName;
	public String tuitionDesc;
	public String tuitionDur;
	public String preReq;
	public String teacher;

	public Tuition(int tuitionCode, String tuitionTitle, String subjectGName, String tuitionDesc, String tuitionDur, String preReq, String teacher) {
		this.tuitionCode = tuitionCode;
		this.tuitionTitle = tuitionTitle;
		this.subjectGName = subjectGName;
		this.tuitionDesc = tuitionDesc;
		this.tuitionDur = tuitionDur;
		this.preReq = preReq;
		this.teacher = teacher;
	}

	public String getTuitionDur() {
		return tuitionDur;
	}

	public int getTuitionCode() {
		return tuitionCode;
	}

	public String getTuitionTitle() {
		return tuitionTitle;
	}

	public String getSubjectGName() {
		return subjectGName;
	}

	public String getTuitionDesc() {
		return tuitionDesc;
	}

	public String getPreReq() {
		return preReq;
	}

	public String getTeacher() {
		return teacher;
	}

	/**
	 * @param camcorder
	 */
	
	

}
