package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingpropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//both file are works
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/testdata/config.properties");
		//FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\onfig.properties");
		Properties propetyobj=new Properties();
		propetyobj.load(file);
		
		String name=propetyobj.getProperty("name");
		System.out.println(name);
	}

}
