package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebSiteSimulator.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	
	List<Category> categories = new ArrayList<Category>();
//	CATEGORİES [] CATEGORİES1 = NEW CATEGORİES[] {};
	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Categories registration added with HIBERNATE " );
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categories;
	}

}
