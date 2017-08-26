package swings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Help_fram extends JFrame implements ActionListener
{	
	public Help_fram()
	{
		setVisible(true);
		setSize(450,200);
		
		JButton btnClose = new JButton("    CLOSE");
		btnClose.setForeground(Color.YELLOW);
		btnClose.setToolTipText("close the window");
		btnClose.setBackground(Color.BLUE);
		btnClose.addActionListener(this);
		JLabel lblThisIsMade = new JLabel("THIS TEXT EDITOR IS MADE BY VINEET BAJ.");
		lblThisIsMade.setForeground(Color.BLUE);
		
		JLabel lblNewLabel = new JLabel("The text editor is to provide a platform to edit plain text files.");
		
		JLabel lblButSoonMore = new JLabel("All Rights Reserved..!!");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(347, Short.MAX_VALUE)
					.addComponent(btnClose)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblButSoonMore)
						.addComponent(lblNewLabel)
						.addComponent(lblThisIsMade, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(94, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblThisIsMade, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblButSoonMore)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(btnClose)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);	
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		dispose();
	}
}

	 