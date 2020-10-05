package asd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueTextFile {

	public static void main(String[] args) throws Exception {
		String line;
		HashSet<String> hs=new HashSet<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"), Charset.forName("UTF-8")));FileOutputStream fout=new FileOutputStream("test.txt",true)) {
		    while ((line = br.readLine()) != null) {
		       String[] words = line.split(" ");
		       for(int i=0;i<words.length;i++){
		    	   if(words[i]!="!" ||  words[i]!=","|| words[i]!="?"){
		    		   hs.add(words[i]);
		    	   }
		       }
		    }
		    String str1="";
		   Iterator<String> itr = hs.iterator();
		   while(itr.hasNext()){
			   str1=str1+" "+itr.next();
		   }
		   byte[] b = str1.getBytes();
		    fout.write(b);
		    System.out.println("Successfully written..");
		}System.out.println(hs);
		
	}

}
