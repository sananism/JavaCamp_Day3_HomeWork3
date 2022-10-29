package kodlamaIoWebSiteSimulator.business;

import java.util.List;

import kodlamaIoWebSiteSimulator.core.logging.Logger;
import kodlamaIoWebSiteSimulator.dataAccsess.CourseDao;
import kodlamaIoWebSiteSimulator.entities.Course;

public class CourseManager {
	
	private CourseDao _courseDao;
	private Logger[] _loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this._courseDao = courseDao;
		this._loggers = loggers;
	}
	
	
	public void add(Course course) throws Exception {
		//business rules
		for(Course turnCourses: _courseDao.getAll()) {
			if(turnCourses.getCourseName().equals(course.getCourseName())) {
				throw new Exception("We have a course by this name !");
			}
		}
	
		if(course.getCourseUnitPrice() < 10)  {
			throw new Exception("Courses price can not be less than 0 !");
			
		}
			_courseDao.add(course);
		
		for(Logger logger:_loggers) {
			logger.log(course.getCourseName());
		}
		
		
	}

}
