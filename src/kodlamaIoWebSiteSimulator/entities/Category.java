package kodlamaIoWebSiteSimulator.entities;

public class Category{
	String _programming;
	String _categoryName;
	
	public Category() {
		
	}
	
	public Category(String programming, String categoryName) {
		this._categoryName = categoryName;
		this._programming = programming;
	}
	
	
	
	public String getProgramming() {
		return _programming;
	}
	public void setProgramming(String programming) {
		this._programming = programming;
	}
	public String getCategoryName() {
		return _categoryName;
	}
	public void setCategoryName(String categoryName) {
		this._categoryName = categoryName;
	}
	

}
