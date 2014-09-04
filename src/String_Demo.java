
import java.io.*;
import java.util.*;
public class String_Demo {
	
	 String findsubstring(String s)
	{
		 int beginIndex=0;
		 int EndIndex=3;
		 String result=s.substring(beginIndex,EndIndex);
		 return result;
	}

	 
	 String Triming(String s)
	 {
		 String result=s.trim();
		 return result;
		 
	 }
	 
	 
	 void countnumberofsubstrings()
	 {
		 Scanner scanner = new Scanner(System.in);

		    System.out.println("Enter a sentence please: \n");
		    String string = scanner.nextLine();

		    int atIndex = 0;
		    int count = 0;

		    while (atIndex != -1)
		    {
		        atIndex = string.indexOf("hello", atIndex);

		        if(atIndex != -1)
		        {
		            count++;
		            atIndex += 5;
		        }
		    }

		    System.out.println(count);
		 
	 }
	 
	 
}
