
import java.io.*;
import java.util.*;
import java.io.BufferedReader;


//import Filename;


public class Main {
	
	
	public static void main(String []args)throws Exception{
				
		
		
		
		GetURLContent urlcontent= new GetURLContent();
		urlcontent.getcontent();
		
		//String_Demo s= new String_Demo();
		//String pattern= "hello";
		//String text="hi hello and hello";
		//s.searchpattern(pattern.toCharArray(), text.toCharArray());
	/*	
		String_Demo s_object= new String_Demo();
	
		s_object.countnumberofsubstrings();
		
		String ss=s_object.findsubstring("Hello World I am here");
		
		
		String ts=s_object.Triming("    Hello World=   ");
		
		String Paragraph="This is a text to look for some substring";
		
		String searchstring="look";
		
		int index=Paragraph.indexOf(searchstring);
		if(index==-1)
			System.out.println(searchstring+"is not found");

		else System.out.println("searchstrig found at"+index);
		System.out.println(index);
		
		System.out.println(ss);
		
		System.out.println(ts);
		
		StringBuilder sb= new StringBuilder();
		sb.append(ss);
		*/
		
		/*
		for(int i=0;i<200;i++)
		{
			EvenOrOdd thread1= new EvenOrOdd(i);
			thread1.start();
		}*/
			
		
		//BankingSystem bs= new BankingSystem();
		
		/*
	MyThread t= new MyThread();
	t.start();
		
	
	MathSin st= new MathSin(45);
	
	
	MathTan tt= new MathTan(70);
	
	
	st.start();
	tt.start();
	 try { // wait for completion of all thread and then sum
		 st.join();
		// ct.join(); //wait for completion of MathCos object
		 tt.join();
		 double z = st.res  + tt.res;
		 System.out.println("Sum of sin, cos, tan = "+z);
		 }
		 catch(InterruptedException IntExp) {
		 }
	*/
		//MyNetwork ntw= new MyNetwork();	
		//	ntw.openurl();
	
		//MyGUI gui= new MyGUI();
		
		//ReadingFile f= new ReadingFile();
		//NumberEncoding encoder= new NumberEncoding();
		//f.Read(gui.selectedfilename);
		//encoder.encode();
		
        /*
        final String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
        
        */

}//end of main function

}//end of main class
