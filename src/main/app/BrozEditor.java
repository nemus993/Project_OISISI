package main.app;


import singleton.MainFrame.MainFrame;

public class BrozEditor {
	public static void main(String[] args) {
		
		MainFrame main = MainFrame.getInstance();
		
		
		main.setVisible(true);
		main.setLocationRelativeTo(null);
	}
}