import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.css.CSSRule;

public class Streammethod {

	public static void main(String[] args) throws IOException {
		Map<String, String> variablemap=filMap();
		Path path=Paths.get("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\paragraph.txt");
		Stream<String> lines;
		
		
		lines =Files.lines(path,Charset.forName("UTF-8"));
		List<String> replacedlines=lines.map(line->replaceTag(line, variablemap))
			.collect(Collectors.toList());
	//	FileWriter newpath=new FileWriter("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\paragraph.txt");
		Path newpathString=Paths.get("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\paragraph1.txt");
	 Files.write(newpathString, replacedlines,Charset.forName("UTF-8") );
	 
	 
	 lines.close();
	 System.out.println("Find and Replace done");
	 
		
		
		
	
		

	}
	public static Map<String, String> filMap() throws FileNotFoundException{
		File file=new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample");
		Scanner sc=new Scanner(file);
		String filecontent="";
		while(sc.hasNextLine())
		{
			filecontent=filecontent.concat(sc.nextLine() +"\n");
			
		//	String key[]=filecontent.split()
			
		}
		
	Map<String, String> map =new HashMap<String, String>();
	map.put("abide", "respecter");
	map.put("about", "sur");
	map.put("above", "absence");
	map.put("abroad", "abuse");
	map.put("absence", "abuser de");
	map.put("abuse", "selon");
	map.put("according", "Compte");
	map.put("account", "accuser");
	map.put("accuse", "connaissance");
	map.put("acquainted", "action");
	//map.put("action", "avantage");)
	
		return map;
	
	}

	private static String replaceTag (String str,Map<String, String> map) {
		
		for(Map.Entry<String,String>entry:map.entrySet()) {
			
			
			if(str.contains(entry.getKey())){
				str=str.replace(entry.getKey(),entry.getValue());
				
				
			}
		}
		return str;
		
		
		
		
		
	
		
		
		
		
		
	}

}
