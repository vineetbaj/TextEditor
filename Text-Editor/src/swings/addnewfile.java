package swings;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class addnewfile extends JFrame
{ static int i=0;
	
 static JTextArea textArea1;
  public static void addnewfile()
  {   
	  i++;
      String str;
      str="New tab " + String.valueOf(i);
	  textArea1 = new JTextArea();
	  txtdito.tabbedPane.addTab(str, null, textArea1, null);
      textArea1.setLineWrap(true);
	  
  }
}
 