package kodlamaIoWebSiteSimulator.business;

import java.util.List;

import kodlamaIoWebSiteSimulator.core.logging.Logger;
import kodlamaIoWebSiteSimulator.dataAccsess.CategoryDao;
import kodlamaIoWebSiteSimulator.entities.Category;

public class CategoryManager {

	private CategoryDao _categoryDao;
	private Logger[] _loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this._categoryDao = categoryDao;
		this._loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category turnCategories : _categoryDao.getAll()) {
			if (turnCategories.getCategoryName().equals(category.getCategoryName()))
				;
			throw new Exception("We have a category name by this name !");
		}

		_categoryDao.add(category);
		for (Logger turnLogger : _loggers) {
			turnLogger.log(category.getCategoryName());
		}
	}

}
