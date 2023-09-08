package service;

import dao.StudentDao;
import dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
		
		
	}
	
}
