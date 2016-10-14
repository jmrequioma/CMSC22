import java.io.*;
import java.util.*;


public class StudentRegistry {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			String sCurrentLine;
			int ctr = 1;
			List<Student> studentList = new ArrayList<Student>();
			br = new BufferedReader(new FileReader("studentListing.txt"));
			Student stud = new Student();;
			while ((sCurrentLine = br.readLine()) != null) {
				switch(ctr){
					case 1:
						stud.setStudentNumber(sCurrentLine);
						ctr++;
						break;
					case 2:
						stud.setFirstName(sCurrentLine);
						ctr++;
						break;
					case 3:
						if (sCurrentLine.length() == 0) {
							stud.setMiddleInitial((char) 54321);
						} else {
							stud.setMiddleInitial(sCurrentLine.charAt(0));
						}
						ctr++;
						break;
					case 4:
						stud.setLastName(sCurrentLine);
						ctr++;
						break;
					case 5:
						stud.setCourse(sCurrentLine);
						ctr++;
						break;
					default:
						stud.setYearLevel(Integer.parseInt(sCurrentLine));
						studentList.add(stud);
						ctr = 1;
						stud = new Student();
				}
			}
			for (Student str: studentList) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
