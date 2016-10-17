import javax.swing.JFrame;

public class MainFrame extends JFrame
{
    MainFrame()
    {
        super("Assignment 4");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        setSize(1000, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}