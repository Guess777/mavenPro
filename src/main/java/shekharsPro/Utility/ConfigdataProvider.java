package shekharsPro.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigdataProvider {
	Properties pro;
	public ConfigdataProvider() throws IOException {
			String path=System.getProperty("user.dir")+"\\Config\\Config.properties";
			System.out.println(path);
			FileInputStream fis=new FileInputStream(path);
			pro=new Properties();
			pro.load(fis);
			
			
	}
	
	public String getBaseUrl()
	{
		
		return pro.getProperty("Url");
	}
	
	
}
