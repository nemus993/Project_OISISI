package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JTextArea;

public class JavaEventListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Pritisnuto je dugme u :"+new Date(arg0.getWhen()));
		
		
		JTextArea tekst= new JTextArea("Duty cycle is defined as the maximum number of pages per month of imaged output. This value provides a shitload of information for our lovely printer companies as HP. Usualy users are really anoyed by this so called monthly checks. Thats why users write angry letters to HP every day...");
	
	}


}
