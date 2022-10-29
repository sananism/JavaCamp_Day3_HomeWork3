package kodlamaIoWebSiteSimulator.business;

import kodlamaIoWebSiteSimulator.core.logging.Logger;
import kodlamaIoWebSiteSimulator.dataAccsess.TeacherDao;
import kodlamaIoWebSiteSimulator.entities.Teacher;

public class TeacherManager {
	private TeacherDao _teacherDao;
	private Logger[] _loggers;
	
	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this._loggers = loggers;
		this._teacherDao = teacherDao;
	}
	
	public void add(Teacher teacher) {
		_teacherDao.add(teacher);
		
		for(Logger logger : _loggers ) {
			logger.log(teacher.getTeacherFirstName());
		}
	}
	

}
