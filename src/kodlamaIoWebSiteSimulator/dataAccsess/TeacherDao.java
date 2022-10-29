package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Course;
import kodlamaIoWebSiteSimulator.entities.Teacher;

public interface TeacherDao {
	void add(Teacher teacher);
	List<Teacher> getAll();
	
}