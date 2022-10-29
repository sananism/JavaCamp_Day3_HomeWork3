package kodlamaIoWebSiteSimulator.core.logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Data logged to DataBase.." + data);
		
	}
	

}
