import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class testing {

	public static void main(String[] args) throws IOException {
		File file=new File("//Exeter_Project_Fresher//26012000.Saravanan.Jayanthi.Shanmuga_Industries_of_Arts_and_Science_College//gitlink.txt");

		
		
		FileWriter ff= new FileWriter(file);
		
		String s="saravanan";
		ff.write(s);
		ff.flush();
		
		
	}

}
