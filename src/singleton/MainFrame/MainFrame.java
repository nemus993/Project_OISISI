package singleton.MainFrame;

import gui.MenuBar;
import gui.MyInternalFrame;
import gui.ToolBar;
import gui.ToolBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;




public class MainFrame extends JFrame {
	
	private static JDesktopPane panel;
	private static MainFrame instance = null;
	Color bg_color = new Color(80,80,80);
	
	private MainFrame () {
		
	MenuBar menu=new MenuBar();
        this.setJMenuBar(menu);
        
    ToolBar toolbar=new ToolBar();
        this.add(toolbar, BorderLayout.NORTH);
        
    ToolBox toolbox1=new ToolBox();
        this.add(toolbox1, BorderLayout.EAST);
        
    JPanel bot=new JPanel();
    bot.setPreferredSize(new Dimension(30,30));
    BoxLayout box= new BoxLayout(bot, MAXIMIZED_HORIZ);
	bot.setLayout(box);
    
    JPanel bot1=new JPanel();
    bot1.setBorder(BorderFactory.createLoweredBevelBorder());
    JLabel lbl1=new JLabel("Position: ");
    bot1.add(lbl1);
    JPanel bot2=new JPanel();
    bot2.setBorder(BorderFactory.createLoweredBevelBorder());
    JLabel lbl2=new JLabel("Graph Editor");
    bot2.add(lbl2);
    JPanel bot3=new JPanel();
    bot3.setBorder(BorderFactory.createLoweredBevelBorder());
    JLabel lbl3=new JLabel("Graph Editor");
    bot3.add(lbl3);
    JPanel bot4=new JPanel();
    bot4.setBorder(BorderFactory.createLoweredBevelBorder());
    JLabel lbl4=new JLabel("Graph Editor");
    bot4.add(lbl4);
    JPanel bot5=new JPanel();
    bot5.setBorder(BorderFactory.createLoweredBevelBorder());
    JLabel lbl5=new JLabel("Graph Editor");
    bot5.add(lbl5);
    
    	bot.add(bot1);
    	bot.add(bot2);
    	bot.add(bot3);
    	bot.add(bot4);
    	bot.add(bot5);
    	
    add(bot,BorderLayout.SOUTH);
 //------------------------Kreiranje Panela za unutrasnje frejmove--------------------------------------------------//
    	panel=new JDesktopPane();
    	panel.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    	panel.setBackground(bg_color);
    	add(panel, BorderLayout.CENTER);	
    	
	}
	
	public void createInternalFrame() {
		final MyInternalFrame fr=new MyInternalFrame();
		fr.setBackground(new Color(220,220,220));
		panel.add(fr);
		fr.addInternalFrameListener(new InternalFrameListener(){

			@Override
			public void internalFrameActivated(InternalFrameEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void internalFrameClosed(InternalFrameEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void internalFrameClosing(InternalFrameEvent arg0) {
				
				int OptionResult=JOptionPane.showInternalConfirmDialog(MainFrame.getInstance().getDesktop(), "Would you like to save your project?", "Project", JOptionPane.YES_NO_CANCEL_OPTION);
				if(OptionResult== JOptionPane.CANCEL_OPTION){
					fr.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				}
				else{
					fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				}
			}

			@Override
			public void internalFrameDeactivated(InternalFrameEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void internalFrameDeiconified(InternalFrameEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void internalFrameIconified(InternalFrameEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void internalFrameOpened(InternalFrameEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		try{
			fr.setSelected(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public JDesktopPane getDesktop(){
		return panel;
	}
	
// ----------- Singleton obrazac ------------//		
	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
			instance.initialise();
		}
		
		return instance;
	}
	
	public void initialise() {
		Toolkit tools = Toolkit.getDefaultToolkit();
		Dimension screenSize = tools.getScreenSize();
		
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenWidth/2, screenHeight/2);		//sets the screen dimensions
		getContentPane().setBackground(bg_color);		//sets the backgorund color
		setLocationRelativeTo(null);		//sets the locaion
		setBackground(bg_color);
		//Setting Icon
		
		Image icon = tools.getImage("images/BrozEditorIcon.png");
		setIconImage(icon);
		
		setTitle("Broz Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}    
       

}
