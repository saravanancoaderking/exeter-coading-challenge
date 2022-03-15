import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class wordtranslate {
	
	

	static String paragraph;
	
	
	// IN Example give a just 20 translated languages
	 
	static String french[]= {
			
"respecter"
,"sur",
"au dessus",
"à l'étranger",
"absence",
"abuse",
"abuser de",
"selon",
"Compte",
"accuser",
"connaissance",
"action",
"avantage",
"Conseil",
"affaires",
"affection",
"affections",
"peur",

			
			
			
			
			
			
	
	};
	static String english[]= {
			                   "abide",
			                   "about",
			                   "above",
			       			"abroad",
			       			"absence",
			       			"abuse",
			       			"according",
			       			"account",
			       			"accuse",
			       			"acquainted",
			       			"action",
			       			"advantage",
                               "advice",
			                   "affairs",
			                   "affection",
			                   "affections",
			                   "afraid",
			                   
			                   
			                   
	
	
	
	
	
	
	};
	static {
		
		System.out.println("<--------FIND AND REPLACE THE WORD BY SARAVANAN------------>" );
	}
	
	
	static String passgate(String a) {
	    
		int i=0;
		System.out.println(english.length);
		while(english.length>i) {
		
		if(a.equals(english[i])) {
			
			a="true";
		}	
		
		i++;
		}
		return a;
	
		
	}
	
	static String frenchword(String french1) {
	
		for(int i=0;i<english.length;i++)
		{
			if(french1.equals(english[i])) {
				
			 french1=french1.replace(french1, french[i]);
			 
				
			        return french1;
			}
		}
		
		
		
		
		
		
		
		
		return french1;
	
	}
	
	
	static String translate(String findtext,String para) {
		
		//System.out.println("paralength"+para.length());
		//System.out.println("frenchlen"+french.length);
       	String replaced="";
		String[] paralength = paragraph.split(" "); 
		//System.out.println("englength"+english.length);
		boolean flag=true;
		for(int i=0;i<english.length;i++) {
		
			if(findtext.equalsIgnoreCase(english[i])) {
				flag=true;
				replaced=para.replace(findtext, french[i]);
				
				
			}
			else if(flag=false){
				
				System.out.println("No matches found");
			}
			
			
			
			
			
		}
		
	
		
		
		return replaced;
		
		
		
	}
	
	static int count(String find) {
		
		String findtext=find;
		int count=0;
		  String special=paragraph.replaceAll("[^a-zA-Z0-9]"," ");
		  special.trim();
          String arr[]=special.split(" ");
          
          
          int i=0;
          
          while(arr.length>i) {
       	   
       	   if(find.equalsIgnoreCase(arr[i])) {
       		   count++;
       		   }
       	  
       	   i++; 
       	   }
         
		return count;
	
	}	
			
			
		
		
		
		
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
/*     		-------- date and time -------------*/
		Date startDate=Calendar.getInstance().getTime();
		System.out.println(startDate);
		long startime=System.currentTimeMillis();
		start();
		long endtime=System.currentTimeMillis();
		
		long duration=(endtime-startime);
		
		long sec=(duration/1000)%60;
		String sec1=String.valueOf(sec);
		long min=(duration/1000)/60;
		String min1=String.valueOf(min);
		
		long total=Runtime.getRuntime().totalMemory();
		long used=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		used=used/1024;
		long mb=used/1024;
		System.out.println("Memory : "+mb +" Mb " +used+ " Kb used");
		
		
		
//		System.out.println("Time To Process:"+min1 + "and" +sec1);
	
		
		
		
		String performance=("Time to Process : \n " +min1+ " minutes "+ " and " +sec1+" seconds\n Memory Used: "+mb +" Mb  " +used+ " Kb used");
		
		
		
		System.out.println(performance);
	File performancetxt = new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\performance.txt");	
		
		FileWriter perfom=new FileWriter(performancetxt);
		perfom.write(performance);
		perfom.flush();
		System.out.println("Performance Path Created :"+performancetxt.getPath());
//		File shake= new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\t8.shakespeare.translated.txt");
	//	FileWriter shake123 =new FileWriter(shake);
		//String notepad1=translate(findtext,paragraph);
		
		//shake123.write(notepad);
		
		
		
		
		
		
	
	}
	
	                    
		public static void start() throws IOException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Given Paragraph:");
		 
		
		File file =new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\t8.shakespeare.txt");
         Scanner file1=new Scanner(file);
     	String content="";
     		while(file1.hasNextLine()) {
     			
     			
     			content=content.concat(file1.nextLine()+"\n");
     			
     		}
     		
     		paragraph=content;
		
		
     		
     		System.out.println(paragraph);
		//System.out.println(gateway("gg"));
		System.out.println("Enter the Translated Word:");
		String findtext=sc.nextLine();
 //         	String passing=gateway(findtext);
		int count=count(findtext);
		String Check=passgate(findtext);
	//	System.out.println(Check);
	
		if(count(findtext)>0&&Check=="true") {
		
		
		System.out.println("Translated Paragraph is:");
		System.out.println(translate(findtext,paragraph));
		
		
		String notepad=translate(findtext,paragraph);
		
		
		
		File shake= new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\t8.shakespeare.translated.txt");
		FileWriter shake123 =new FileWriter(shake);
		
		shake123.write(notepad);
		System.out.println("Tanslate path created:"+shake.getPath());
		shake123.flush();

		
		
		
		
		
		
		
		
		File myfile=new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\succes.txt");
		
		FileWriter fc=new FileWriter(myfile);
		
		fc.write(notepad);
		
		fc.flush();
		System.out.println("Path created:"+myfile.getPath());
		
		
		
		System.out.println("It was Replaced by ---> " +count +"times");
		System.out.println("Equvalent french word is ---> "+frenchword(findtext));
		String frequency=("The Text :"+findtext+"\n It was Replaced by ---> " +count +"times \n Equvalent french word is ---> "+frenchword(findtext));
		System.out.println(frequency);
		//File myfile12=new File("/Exeter_Project_Fresher/26012000.Saravanan.Jayanthi.Shanmuga_Industries_of_Arts_and_Science_College/frequency.csv");
		File myfile12=new File("C:\\Users\\Stylish Sanjay\\Documents\\Exeter\\sample\\frequency.csv");
		FileWriter frequency1=new FileWriter(myfile12);
		frequency1.write(frequency);
		frequency1.flush();
		System.out.println("frequency path created:"+myfile12.getPath());
		}
		else if(count(findtext)==0) {
			
			System.out.println("The word  "+findtext+" Did not matched");
			
		}
		else if(Check!="true") {
			System.out.println("The word " +findtext+ "is not present in translated language!!!");
			
		}
		}
		
}
