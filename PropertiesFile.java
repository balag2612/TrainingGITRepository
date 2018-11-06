package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.FirstSeleniumClass;

public class PropertiesFile {
	static String projectLocation = System.getProperty("user.dir");
	static Properties prop = new Properties();
	public static void main(String[] args) {
		readProperties();
	//	writeProperties();
		readProperties();

	}
	public static void readProperties() {
		try {
			InputStream input = new FileInputStream(projectLocation+"\\src\\Config\\Config.properties");
			prop.load(input);
			FirstSeleniumClass.browser = prop.getProperty("browser");
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void writeProperties () {
		
		try {
			OutputStream output = new FileOutputStream(projectLocation+"\\src\\Config\\Config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(output, null);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
