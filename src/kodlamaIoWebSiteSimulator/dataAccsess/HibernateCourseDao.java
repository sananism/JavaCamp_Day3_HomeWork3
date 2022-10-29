package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Course;

public class HibernateCourseDao implements CourseDao{

	
	List<Course> courses = new ArrayList<Course>();
	
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Courses registration added with HIBERNATE " );
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return this.courses;
	}

}
