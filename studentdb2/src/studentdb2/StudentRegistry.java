package studentdb2;

import java.util.*;
import java.io.*;

public class StudentRegistry {
	private static List<Student> studentInfoList = new ArrayList<Student>();
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		// User Inputs
		int option;
		boolean exit = false;

		while(!exit) {
			System.out.println("1. Register");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Save");
			System.out.println("5. Delete Contents");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");
			option = sc.nextInt();
			System.out.println();

			if(option == 1) {
				// Load Contents
				loadContents("studentListing.txt");
				deleteContents("studentListing.txt");
				try {
					register();
				} catch(StudentNumberAlreadyExistsException ex) {
					System.out.println(ex.getInfo());
				}
			} else if(option == 2) {
				retrieve();
			} else if(option == 3) {
				delete();
			} else if(option == 4) {
				save();
			} else if (option == 5) {
				deleteContents("studentListing.txt");
			} else {
				exit = true;
			}
			System.out.println("========================================");
		}
		System.out.println("Bye!");
	}
	
	public static void deleteContents(String inputFile) {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(inputFile));
			br.write("");
		} catch (IOException ex) {
				ex.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException ex) {
					ex.printStackTrace();
			}
			//System.out.println("Contents deleted!");
		}
	}
	
	public static void loadContents(String inputFile) {
		//BufferedReader br = null;
		FileInputStream fis = null;
	    ObjectInputStream ois = null;
		try {
			// DESERIALIZATION...
            File fin = new File(inputFile);
            if(fin.length() == 0) {
                 //file is emtpy!!
                System.err.println("FILE IS EMPTY");
               
            } else {
	            fis = new FileInputStream(fin);
	            ois = new ObjectInputStream(fis);
	            
	            studentInfoList = (List<Student>) ois.readObject();
	            
	            //studentInfoList.add(isko);
	            
	            ois.close();
            }
	        /*
			String studentNumber;
			br = new BufferedReader(new FileReader(inputFile));

			while((studentNumber = br.readLine()) != null) {
				Student isko = new Student();
				String firstName = br.readLine();
				String middleInitial = br.readLine();
				String lastName = br.readLine();
				String course = br.readLine();
				String yearLevel = br.readLine();
				String crushName = br.readLine();
				Course faveSubject = br.readLine();

				isko.setStudentNumber(studentNumber);
				isko.setFirstName(firstName);
				if(middleInitial.equals("")) {
					isko.setMiddleInitial(' ');
				} else {
					isko.setMiddleInitial(middleInitial.charAt(0));
				}
				isko.setLastName(lastName);
				isko.setCourse(course);
				isko.setYearLevel(Integer.valueOf(yearLevel));
				isko.setCrushName(crushName);
				isko.setFaveSubject(faveSubject);
				
				studentInfoList.add(isko);
				
			}
			*/
		} catch (IOException ex) {
				ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		//} finally {
			//try {
				 //ois.close();
			//} catch (IOException ex) {
				//	ex.printStackTrace();
			//}
		}
	}

	public static void register() throws StudentNumberAlreadyExistsException {
		sc.nextLine();
		System.out.print("Student Number: ");
		String studentNumber = sc.nextLine();

		for(Student isko : studentInfoList) {
			if(isko.getStudentNumber().equals(studentNumber)) {
				throw new StudentNumberAlreadyExistsException(studentNumber);
			}
		}

		System.out.print("First Name: ");
		String firstName = sc.nextLine();

		System.out.print("Middle Initial: ");
		char middleInitial = sc.next().charAt(0);

		sc.nextLine();
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();

		System.out.print("Program: ");
		String course = sc.nextLine();

		System.out.print("Year Level: ");
		int yearLevel = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Crush Name: ");
		String crushName = sc.nextLine();
		
		System.out.print("Course Code: ");
		String courseCode = sc.nextLine();
		
		System.out.print("Course Description: ");
		String courseDescription = sc.nextLine();
		
		Course faveSubject = new Course(courseCode, courseDescription);
		Student isko = new Student(studentNumber, firstName, middleInitial, 
										 lastName, course, yearLevel, crushName, faveSubject);
		studentInfoList.add(isko);
		System.out.println("Student added!");
	}

	public static void retrieve() {
		System.out.print("Search Student: ");
		String studentNumber = sc.next();
		Student retrievedStudent = null;

		for(Student isko : studentInfoList) {
			if(isko.getStudentNumber().equals(studentNumber)) {
				retrievedStudent = isko;
				break;
			}
		}
		System.out.println(retrievedStudent);
	}

	public static void delete() {
		System.out.print("Delete Student: ");
		String studentNumber = sc.next();

		for(Student isko : studentInfoList) {
			if(isko.getStudentNumber().equals(studentNumber)) {
				studentInfoList.remove(isko);
				break;
			}
		}

		System.out.println("Student " + studentNumber + " deleted!");
	}

	public static void save() {
		//BufferedWriter br = null;
		FileOutputStream fos = null;
	    ObjectOutputStream oos = null;
		try {
			// SERIALIZATION...
			File fout = new File("studentListing.txt");
            fos = new FileOutputStream(fout);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(studentInfoList);
            
            oos.close();
           
           
            
			/*
			br = new BufferedWriter(new FileWriter("studentListing.txt"));
			for(Student isko : studentInfoList) {
				br.append(isko.getStudentNumber() + "\n");
				//br.newLine();

				br.append(isko.getFirstName()+ "\n");
				//br.newLine();

				br.append(isko.getMiddleInitial()+ "\n");
				//br.newLine();

				br.append(isko.getLastName()+ "\n");
				//br.newLine();

				br.append(isko.getCourse()+ "\n");
				//br.newLine();

				br.append(String.valueOf(isko.getYearLevel())+ "\n");
				//br.newLine();
				 */
			//}
		} catch (IOException ex) {
				ex.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException ex) {
					ex.printStackTrace();
			}
		}
		System.out.println("Saved.");
	}
}
