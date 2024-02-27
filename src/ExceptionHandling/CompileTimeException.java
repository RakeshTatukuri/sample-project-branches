package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class CompileTimeException {

	/*
	 * By default all compile time exceptions  handles by Jvm
	 */
	public static void main(String[] args) throws Exception //InterruptedException, FileNotFoundException
	{
		
		System.out.println("program starts....");
		Thread.sleep(2500);//InterruptedException
		System.out.println("program stopped....");
		//properties file
		//file path in File object
		File f1=new File("./"+"\\config.property");
		FileInputStream fis=new FileInputStream(f1);//FileNotFoundException
		//To read data from properties file-->load
		Properties p1=new Properties();
		p1.load(fis);//IOException
		
		System.out.println("username is:"+p1.getProperty("un"));
		System.out.println("password is:"+p1.getProperty("pwd"));
		
	}
}
