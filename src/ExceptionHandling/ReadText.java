package ExceptionHandling;
import java.io.*;
//import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadText {
	public static void main(String[] args){
		String path = "/Users/ruksanafaruqui/Documents/i-130.pdf";
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(path);
		}catch(FileNotFoundException e)
		{ e.printStackTrace();}
		br = new BufferedReader(fr);
		String text;
		try {
			while((text=br.readLine())!=null)
			{System.out.println(text);}
		}catch(IOException e)
		{e.printStackTrace();}
		finally {
				try{
					br.close();
					fr.close();
			}catch(IOException e)
			{ e.printStackTrace();}
		}
	}
}




		
		
				

