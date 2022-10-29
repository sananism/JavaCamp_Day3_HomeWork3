package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{

	
	List<Teacher> teachers = new ArrayList<Teacher>();
	@Override
	public void add(Teacher teacher) {
		teachers.add(teacher);
		System.out.println("Teachers registration added with JDBC " );
	}

	@Override
	public List<Teacher> getAll() {
		return this.teachers;
	}

}
