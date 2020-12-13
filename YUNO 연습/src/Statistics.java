import java.io.File;
import java.util.Scanner;

public class Statistics {
	File file = new File("./Data.csv");
	
	public Statistics() {}
	
	public void update() {
		
		try {
			Scanner sc = new Scanner(file);
	
			for(int i=0;sc.hasNextLine();i++) {
				
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
