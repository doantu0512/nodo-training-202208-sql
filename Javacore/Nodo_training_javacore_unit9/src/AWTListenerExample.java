import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface WindowClosing extends WindowListener{
    public default void windowOpened(WindowEvent e){}
    public default void windowlconified(WindowEvent e){}
    public default void windowDeiconified(WindowEvent e){}
    public default void windowActivate(WindowEvent e){}
    public default void windowDeactivated(WindowEvent e){}
    public default void windowClosed(WindowEvent e){}
}

public class AWTListenerExample {
    public static void main(String[] args) {
        vd1();
        }
    public static void vd1() {
        Frame screen = new Frame();
        Button button= new Button("Ấn");
        screen.add(button);
        screen.setSize(400,500);
        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        screen.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Welcome",
                        "Java sample", JOptionPane.INFORMATION_MESSAGE);

            }

        });
    }

    public static void vd2() {
        Frame screen = new Frame();
        Button button = new Button("Ấn");
        screen.add(button);
        screen.setSize(400, 500);
        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        screen.setVisible(true);
        button.addActionListener(e ->
                JOptionPane.showMessageDialog(null, "Info box:Welcome to java by Example",
                        "Java sample", JOptionPane.INFORMATION_MESSAGE));

            }
    }




