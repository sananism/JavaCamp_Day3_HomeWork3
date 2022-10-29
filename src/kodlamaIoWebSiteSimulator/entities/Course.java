package kodlamaIoWebSiteSimulator.entities;

public class Course extends Teacher {
	private String _courseName;
	private String _info;
	private String _coursePhoto;
	private double _courseUnitPrice;
	
	public Course() {  
		
	}
	
	public Course(String courseName, String info, String coursePhoto, double courseUnitPrice) {
		this._courseName = courseName;
		this._info = info;
		this._coursePhoto = coursePhoto;
		this._courseUnitPrice = courseUnitPrice;
	}
	
	public String getCourseName() {
		return _courseName;
	}
	public void setCourseName(String courseName) {
		this._courseName = courseName;
	}
	
	
	public String getInfo() {
		return _info;
	}
	public void setInfo(String info) {
		this._info = info;
	}
	
	
	public String getCoursePhoto() {
		return _coursePhoto;
	}
	public void setCoursePhoto(String coursePhoto) {
		this._coursePhoto = coursePhoto;
	}
	
	
	public double getCourseUnitPrice() {
		return _courseUnitPrice;
	}
	public void setCourseUnitPrice(double courseUnitPrice) {
		this._courseUnitPrice = courseUnitPrice;
	}
	
	

}
