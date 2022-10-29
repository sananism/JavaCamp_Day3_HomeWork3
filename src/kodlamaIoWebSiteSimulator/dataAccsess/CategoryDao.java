package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();

}
