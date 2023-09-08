package controller;

import dto.Student;
import service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		
		s.setSid(101);
		s.setSname("Rutik");
		s.setRoll(70);
		
		StudentService studentservice =new StudentService();
		Student ss=studentservice.saveStudent(s);
		
		if(s!=null) {
//			System.out.println("Data Show Successfully");
//			System.out.println(s.getSid());
//			System.out.println(s.getSname());
//			System.out.println(s.getRoll());
			
			System.out.println(s.getRoll()+"save ");
		}
	}

}
