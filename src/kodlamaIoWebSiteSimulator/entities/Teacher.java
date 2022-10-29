package kodlamaIoWebSiteSimulator.entities;

public class Teacher {
	String _teacherFirstName;
	String _teacherlastName;
	
	public Teacher() {
		
	}
	
	public Teacher(String teacherFirstName, String teacherLastName ) {
		this._teacherFirstName = teacherFirstName;
		this._teacherlastName = teacherLastName;
		
	}
	
	public String getTeacherFirstName() {
		return _teacherFirstName;
	}
	public void setTeacherFirstName(String teacherFirstName) {
		this._teacherFirstName = teacherFirstName;
	}
	public String getTeacherlastName() {
		return _teacherlastName;
	}
	public void setTeacherlastName(String teacherlastName) {
		_teacherlastName = teacherlastName;
	}
	

}
