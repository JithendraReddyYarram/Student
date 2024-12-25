package student.exception;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Studentdetails {

	public static void main(String[] args)throws Exception {
		
		Student s1=new Student("Sudhher","lakshimipuram",58.65);
		Student s2=new Student("vijay","pattabhipuram",88.23);
		Student s3=new Student("ajay","svncolony",48.68);
	/*	ArrayList<Student> Studentlist=new ArrayList<Student>();
		Studentlist.add(s1);
		Studentlist.add(s2);
		Studentlist.add(s3);
         for(Student p:Studentlist) {
        	 System.out.println(p);
         }
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student id no :");
		int  search_id=sc.nextInt();
		Student details=null;
		   for(Student s:Studentlist) {
			   if(s.getId()==search_id) {
				   details=s;
			   }
			  
		   }
		   if(details!=null)
			   System.out.println(details);
		   
		   else {
			   throw new StudentNotFoundException("Student with ID:" + search_id + " details not available");  
		   }
		   */
		   // either arraylist or map used to print id you entered id else shows exception
		   
		   Map<Integer,Student> StudentMap = new TreeMap<Integer,Student>(); 
			StudentMap.put(s1.getId(), s1);
			StudentMap.put(s2.getId(), s2);
			StudentMap.put(s3.getId(), s3);
			
			for(Map.Entry<Integer, Student> entry : StudentMap.entrySet()) {
				System.out.println(entry);
			}
			
			System.out.println("**********************************************");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID of the student to be searched : ");
			int search_id = sc.nextInt();
			
			if(StudentMap.containsKey(search_id))
				System.out.println(StudentMap.get(search_id));
			
			else 
				throw new StudentNotFoundException("Student with ID:" + search_id + " details not available");
			
			
			System.out.println("------------------------------------------------------------------");
			
		
			
	}

}
