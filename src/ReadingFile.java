import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import java.io.FileReader;

public class ReadingFile {
	
	private   BufferedReader br ;
	public void  Read(String filename) throws IOException
	{
  
	StringBuilder sb = new StringBuilder();
	Vector wordvector= new Vector(); 
	String dict= new String();
	long count=0;
	
	
	try {
		br = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
	try {
        
        String line = br.readLine();

        while (line != null) {
        	sb.append(line);
        	sb.append("\n");
            wordvector.add(line);
            line = br.readLine();
            count++;
        }
       
    } 
	
	
	finally {
        br.close();
    }
	
    dict=sb.toString();
    System.out.println("Number of words"+count);
    System.out.println("Number of words"+wordvector.size());
    System.out.println(dict);
	}
 /*   
    ListIterator iter = wordvector.listIterator();
    while (iter.hasNext()) {
    	String singleword=(String)iter.next();
        System.out.println(singleword);
    }*/	
	
	
}

