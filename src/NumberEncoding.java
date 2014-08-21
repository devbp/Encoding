

import java.util.*;

public class NumberEncoding {
	private char[][] code= new char[11][4];
	
	NumberEncoding()
	{    //encoding rule
		//rule which do not have any character is replaced with character '#'
		code[0][0]='e';code[0][1]='#';code[0][2]='#';
		code[1][0]='j';code[1][1]='n';code[1][2]='q';
		code[2][0]='r';code[2][1]='w';code[2][2]='x';
		code[3][0]='d';code[3][1]='s';code[3][2]='y';
		code[4][0]='f';code[4][1]='t';code[4][2]='#';
		code[5][0]='a';code[5][1]='m';code[5][2]='#';
		code[6][0]='c';code[6][1]='i';code[6][2]='v';
		code[7][0]='b';code[7][1]='k';code[7][2]='u';
		code[8][0]='l';code[8][1]='o';code[8][2]='p';
		code[9][0]='g';code[9][1]='h';code[9][2]='z';
	}
	
	public void encode()
	{
		//get the phone number from the file
		String phonenumber= "4824";
		
	      
	       char[] phone_char=phonenumber.toCharArray();
	     
	       String encryptedstring;
	       Vector encryptedstringvector= new Vector();
	       
	       if(phonenumber.length()==2)
	       {
	       int index0=Character.getNumericValue(phone_char[0]);
		   int index1=Character.getNumericValue(phone_char[1]);
	       
	       for(int i=0;i<3;i++)
	    	   for(int j=0;j<3;j++)
	    	   {  
	    		  
	    		   if( code[index0][i]=='#'||code[index1][j]=='#')continue;
	    		   String a=Character.toString(code[index0][i]);
	    		    String b= Character.toString(code[index1][j]);
	    		   encryptedstring=a+b;
	    		   encryptedstringvector.add(encryptedstring);
	    	   }
	       
	       }
	       
	       
	       
	       else if(phonenumber.length()==3)
	       {
	       int index0=Character.getNumericValue(phone_char[0]);
		   int index1=Character.getNumericValue(phone_char[1]);
		   int index2=Character.getNumericValue(phone_char[2]);
	       
	       for(int i=0;i<3;i++)
	    	   for(int j=0;j<3;j++)
	    		   for(int k=0;k<3;k++)
	    	   {  
	    		  
	    		   if( code[index0][i]=='#'||code[index1][j]=='#'||code[index2][k]=='#')continue;
	    		   String a=Character.toString(code[index0][i]);
	    		    String b= Character.toString(code[index1][j]);
	    		    String c=Character.toString(code[index2][k]);
	    		   encryptedstring=a+b+c;
	    		   encryptedstringvector.add(encryptedstring);
	    	   }
	       
	       }
	       
	       
	       else if(phonenumber.length()==4)
	       {
	       int index0=Character.getNumericValue(phone_char[0]);
		   int index1=Character.getNumericValue(phone_char[1]);
		   int index2=Character.getNumericValue(phone_char[2]);
		   int index3=Character.getNumericValue(phone_char[3]);
	       
	       for(int i=0;i<3;i++)
	    	   for(int j=0;j<3;j++)
	    		   for(int k=0;k<3;k++)
	    			   for(int l=0;l<3;l++)
	    			   {  	    		  
	    				   if( code[index0][i]=='#'||code[index1][j]=='#'||code[index2][k]=='#'||code[index3][l]=='#')continue;
	    				   String a=Character.toString(code[index0][i]);
	    				   String b= Character.toString(code[index1][j]);
	    				   String c=Character.toString(code[index2][k]);
	    				   String d=Character.toString(code[index3][l]);
	    				   encryptedstring=a+b+c+d;
	    				   encryptedstringvector.add(encryptedstring);
	    			   }
	       
	       }
	              
	       
	       
	       ListIterator iter = encryptedstringvector.listIterator();
	       while (iter.hasNext()) {
	       	String singleword=(String)iter.next();
	           System.out.println(singleword);
	       }
	        
	     }
	        
	        
	        
	      
	     
	      
	        
	
	

}
