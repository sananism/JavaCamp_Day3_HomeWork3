package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}
