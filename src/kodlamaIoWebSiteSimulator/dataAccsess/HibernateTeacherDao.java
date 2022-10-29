package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Course;
import kodlamaIoWebSiteSimulator.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
	List<Teacher> teachers = new ArrayList<Teacher>();
	@Override
	public void add(Teacher teacher) {
		teachers.add(teacher);
		System.out.println("Teachers registration added with HIBERNATE " );
	}

	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
