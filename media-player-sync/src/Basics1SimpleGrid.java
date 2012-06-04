import javax.swing.*;
import net.java.dev.designgridlayout.*;

public class Basics1SimpleGrid 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Example 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel top = new JPanel();              
        DesignGridLayout layout = new DesignGridLayout(top);

        // You can add components one line at a time (not advised)
        IRow row = layout.row().grid();
        row.add(button());
        row.add(button());

        // Or using method chaining
        layout.row().grid().add(button()).add(button());

        // Or, even better, using variable arguments
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