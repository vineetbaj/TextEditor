package swings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Delayed;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorChooserUI;
import javax.swing.text.DefaultEditorKit;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;

public class txtdito extends JFrame implements ActionListener
{
    public static String str,str1;
    public static JTabbedPane tabbedPane; 
	JTextArea textArea;
	JMenuItem Save,Exit,New,Open,Cut,Copy,Paste,Delete,About;
	JMenuBar menuBar;
	JMenu File,Edit,Help;
	int pos1,i;
	public static ScrollPane scrollPane;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	public txtdito()
		{
		this.setTitle("Text Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 494);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		File = new JMenu("file");
		menuBar.add(File);
		
		New = new JMenuItem("new");
		File.add(New);
		New.addActionListener(this);
		KeyStroke key=KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK);
		New.setAccelerator(key);
		
		JSeparator separator = new JSeparator();
		File.add(separator);
		
		
		Open = new JMenuItem("open");
		File.add(Open);
		Open.addActionListener(this);
		KeyStroke key1=KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK);
		Open.setAccelerator(key1);
		
		JSeparator separator_1 = new JSeparator();
		File.add(separator_1);
		
		Save = new JMenuItem("save");
		File.add(Save);
		Save.addActionListener(this);
		KeyStroke key2=KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK);
		Save.setAccelerator(key2);
		
		JSeparator separator_2 = new JSeparator();
		File.add(separator_2);
		
		Exit = new JMenuItem("exit");
		File.add(Exit);
		Exit.addActionListener(this);
		
		Edit = new JMenu("edit");
		menuBar.add(Edit);
		
		Cut=new JMenuItem("cut");
		Edit.add(Cut);
		Cut.addActionListener(this);
		KeyStroke key3=KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK);
		Cut.setAccelerator(key3);
		
		
		separator_3 = new JSeparator();
		Edit.add(separator_3);
		
		Copy = new JMenuItem("copy");
		Edit.add(Copy);
		Copy.addActionListener(this);
		KeyStroke key4=KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK);
		Copy.setAccelerator(key4);
		
		separator_4 = new JSeparator();
		Edit.add(separator_4);
		
		Paste = new JMenuItem("paste");
		Edit.add(Paste);
		Paste.addActionListener(this);
		KeyStroke key5=KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK);
		Paste.setAccelerator(key5);
		
		separator_5 = new JSeparator();
		Edit.add(separator_5);
		
		Delete = new JMenuItem("delete");
		Edit.add(Delete);
		Delete.addActionListener(this);
		
		Help = new JMenu("help");
		menuBar.add(Help);
		Help.addActionListener(this);
		
		About = new JMenuItem("about");
		Help.add(About);
		About.addActionListener(this);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 696, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		scrollPane = new ScrollPane();
		textArea = new JTextArea();
		tabbedPane.addTab("New tab", null, scrollPane, "new tab");
		scrollPane.add(textArea, null);
        textArea.setLineWrap(true);
     }

	 
	//Actions performed
	
	@Override
	public void actionPerformed(ActionEvent arg)
	{	
		if(arg.getSource()==New)
		{
			addnewfile.addnewfile();
		}
	  else if(arg.getSource()==Save)	 
	   {  
		 str=textArea.getText();
		 System.out.println(str);
		 
		  catchthedata catc1=new catchthedata();
		 try 
		 {
			catc1.catc(str);
	     }
		catch (FileNotFoundException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		  
	   }
	  
	  else if(arg.getSource()==Open)	
	  {
		  JFrame f= new JFrame();
		  FileDialog fd=new FileDialog(f,"open",FileDialog.LOAD);
		  fd.setVisible(true);
		  fd.setLocationRelativeTo(this);
		  String s1=fd.getFile();
		  String s2=fd.getDirectory();
		  String s3=s2+s1;
		  String s4=""; 
		  try(FileReader fr=new FileReader(s3))
		  {
			  int c;
			  while((c=fr.read())!=-1)
			  {
				  s4=s4+(char)c;
			  System.out.print((char)c);
			     textArea.setText(s4);
			  }
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  this.setTitle(s1+"-Text Editor");
	  }
	  
	  else if(arg.getSource()==Exit)	 
	  {
		 int reply=JOptionPane.showConfirmDialog(getParent(),"do you really want to exit?", "Text Editor", JOptionPane.INFORMATION_MESSAGE);
		 if(reply==JOptionPane.YES_OPTION)
          System.exit(0);
	  }
	  else if(arg.getSource()==About)	
	  {
	   Help_fram helper=new Help_fram();
	   helper.setVisible(true);
	   helper.setLocationRelativeTo(this);
	  }
	  else if(arg.getSource()==Cut)
	  {
		    str1=textArea.getSelectedText();
		    i=textArea.getText().indexOf(str1);
		    textArea.replaceRange(" ", i, (i+(str1.length())));
	  }
	  else if(arg.getSource()==Copy)
	  {
		    str1=textArea.getSelectedText();
	  }
	  else if(arg.getSource()==Paste)
	  {
		    pos1=textArea.getCaretPosition();
		    textArea.insert(str1, pos1);
	  }	
	  else if(arg.getSource()==Delete)
	  {
		    String str1=textArea.getSelectedText();
		    i=textArea.getText().indexOf(str1);
		    textArea.replaceRange(" ", i, (i+(str1.length())));   
	  }	
	}
}
