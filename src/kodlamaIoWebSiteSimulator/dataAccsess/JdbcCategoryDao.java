package kodlamaIoWebSiteSimulator.dataAccsess;

import java.util.ArrayList;
import java.util.List;
import kodlamaIoWebSiteSimulator.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	
//	private List<Category> categories1;
//
//	public JdbcCategoryDao() {
//		categories = new ArrayList<Category>();
//	}                                                  // BOYLEDE YAZILABILIR

	List<Category> categories = new ArrayList<Category>();
	
	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Category registration added with JDBC");
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return this.categories;
	}

}
