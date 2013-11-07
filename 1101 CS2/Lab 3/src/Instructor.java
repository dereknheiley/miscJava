//Instructor.java
public class Instructor
{
		private String lName;
		private String fName;
		private String officeNum;
		
		public Instructor(String lName, String fName, String officeNum)
		{
			this.lName = lName;
			this.fName = fName;
			this.officeNum = officeNum;
		}
		public String getLName()
		{
			return lName;
		}
		public String getFName()
		{
			return fName;
		}
		public String getONum()
		{
			return officeNum;
		}
		public void setONum(String o)
		{
			officeNum = o;
		}
		public String toString()
		{
			String str = "Last Name: " + lName + "\nFirst Name: " + fName + "\nOffice Number: " + officeNum + "\n";
			return str;
		}
}
