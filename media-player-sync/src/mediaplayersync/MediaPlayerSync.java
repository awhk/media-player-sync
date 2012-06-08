package mediaplayersync;

import javax.swing.*;

import net.java.dev.designgridlayout.*;

public class MediaPlayerSync {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Example 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel top = new JPanel();              
        DesignGridLayout layout = new DesignGridLayout(top);
        
        layout.row().grid().add(button(), button());

        frame.add(top);
        frame.pack();
        frame.setVisible(true);

	}
	
	public static JButton button()
    {
        return new JButton("Button");
    }

}
