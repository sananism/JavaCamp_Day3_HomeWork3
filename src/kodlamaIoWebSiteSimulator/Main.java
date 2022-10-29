package kodlamaIoWebSiteSimulator;

import kodlamaIoWebSiteSimulator.business.CourseManager;
import kodlamaIoWebSiteSimulator.core.logging.DataBaseLogger;
import kodlamaIoWebSiteSimulator.core.logging.FileLogger;
import kodlamaIoWebSiteSimulator.core.logging.Logger;
import kodlamaIoWebSiteSimulator.dataAccsess.HibernateCourseDao;
import kodlamaIoWebSiteSimulator.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(), new DataBaseLogger()};
		
		Course course1 = new Course("Java", "2022 Java Developer Camp", "Java.jpg", 3200);
		Course course2 = new Course("C#", "2020 C# Developer Camp", "Java.jpg", 0);
		Course course3 = new Course("Java", "2023 C# Developer Camp", "Java.jpg", 2600);
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		//courseManager.add(course2);
		//courseManager.add(course3);
		
//		System.out.println(course);

	}

}
