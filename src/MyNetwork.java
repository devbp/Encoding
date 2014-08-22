import java.net.*;
import java.io.*;
public class MyNetwork {

	public void openurl() throws Exception
	{
		URL myurl= new URL("http://docs.oracle.com/javase/tutorial/index.html");
		
		 System.out.println("protocol = " + myurl.getProtocol());
		 System.out.println("protocol = " + myurl.getProtocol());
	        System.out.println("authority = " + myurl.getAuthority());
	        System.out.println("host = " + myurl.getHost());
	        System.out.println("port = " + myurl.getPort());
	        System.out.println("path = " + myurl.getPath());
	        System.out.println("query = " + myurl.getQuery());
	        System.out.println("filename = " + myurl.getFile());
	        System.out.println("ref = " + myurl.getRef());
	}
}
