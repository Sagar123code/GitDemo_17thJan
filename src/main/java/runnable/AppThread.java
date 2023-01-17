package runnable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppThread extends Thread {
//	"C:\Users\DEEL\Downloads\Ex_Files_Java_EE_Concurrency\Ex_Files_Java_EE_Concurrency\Exercise Files\Chapter2\02_03\begin"
	
	@Override
	public void run() {
		try(BufferedReader bufferReader= new BufferedReader(new FileReader(new File("C:\\Users\\DEEL\\Downloads\\Ex_Files_Java_EE_Concurrency\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_03\\begin\\sample.txt")))){
			String line=null;
			while((line=bufferReader.readLine())!=null) {
				System.out.println(Thread.currentThread().getName()+" reading the linee :"+line);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
