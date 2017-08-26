package swings;

import java.awt.FileDialog;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.swing.JFrame;

public class catchthedata
{
 void catc(String str) throws FileNotFoundException
 {
 JFrame f= new JFrame();
 FileDialog fd=new FileDialog(f,"save",FileDialog.SAVE);
 fd.setVisible(true);
 fd.setLocationRelativeTo(new txtdito());
 String s1=fd.getFile();
 String s2=fd.getDirectory();
 String s3=s2+s1;
 
	 try{
		 String s4=s3+".txt";
	 FileWriter fs=new FileWriter(s4);
	 
	 System.out.println("catch thedtat");
	System.out.println(str);
	 
		 char ch[]=str.toCharArray();
		 
		 
	 
	 fs.write(ch);
	 fs.flush();
	 fs.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
 }
}
