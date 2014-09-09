import java.io.*;
import java.net.*;



public class GetURLContent {

	private URL url;
	void getcontent() throws IOException
	{
		url= new URL("http://www.mykong.com");
		URLConnection conn=url.openConnection();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String inputline;
		String filename="test.html";
		
		File file= new File(filename);
		if(!file.exists())
			file.createNewFile();
		FileWriter fw= new FileWriter(file,true);
		
		BufferedWriter bw= new BufferedWriter(fw);
	
		
		while(br.readLine()!=null){
			inputline=br.readLine();
			bw.write(inputline);
			System.out.println(inputline);
		}
		
		bw.flush();
		bw.close();
	}
}
