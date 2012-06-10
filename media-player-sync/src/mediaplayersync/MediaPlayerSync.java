package mediaplayersync;

import javax.swing.*;

import net.java.dev.designgridlayout.*;

import java.awt.Font;

public class MediaPlayerSync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Media Player Sync");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel top = new JPanel();
		DesignGridLayout layout = new DesignGridLayout(top);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}

		JMenuBar menubar = new JMenuBar();
		JMenu filemenu = new JMenu("File");
		filemenu.add(new JSeparator());
		JMenu editmenu = new JMenu("Edit");
		editmenu.add(new JSeparator());
		JMenuItem fileItemClose = new JMenuItem("Close");
		JMenuItem editItemPrefs = new JMenuItem("Preferences");
		JMenuItem editItemAbout = new JMenuItem("About");
		editItemAbout.add(new JSeparator());
		filemenu.add(fileItemClose);
		editmenu.add(editItemPrefs);
		editmenu.add(editItemAbout);
		menubar.add(filemenu);
		menubar.add(editmenu);
		frame.setJMenuBar(menubar);

		layout.row().center().add(new JButton("Connect"));
		
		JLabel incomingConn = new JLabel("Currently listening for incoming connections.");
		//Create font.  
		//Font Name : Default label font  
		//Font Style : Italic  
		//Font Size : Default label font size  
		Font incomingConnFont=new Font(incomingConn.getFont().getName(),Font.ITALIC,incomingConn.getFont().getSize());
		incomingConn.setFont(incomingConnFont); 
		layout.row().grid(incomingConn).add(new JButton("Stop"));

		frame.add(top);
		frame.pack();
		frame.setVisible(true);

	}
}
