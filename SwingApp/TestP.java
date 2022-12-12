package SwingApp;

import javax.swing.*;
public class TestP {

    TestP(){
        JFrame jfrm = new JFrame("Simple Swing App");

        //Give the frame an initial size
        jfrm.setSize(275,100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("Swing emans powerful GUIs.");
        //Add the label to the content pane.
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestP();
            }
        });
    }
}
