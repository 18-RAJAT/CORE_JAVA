package JAVA_SWING_PRACTICE;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class Mouse_handle extends JFrame {
    JButton mouseButton = new JButton("No Mouse Movement Yet!");

    public Mouse_handle() {
        super("Mouse Event");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.getContentPane().add(mouseButton);
        // Add a MouseListener to the JButton
        mouseButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                mouseButton.setText("Mouse has entered!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseButton.setText("Mouse has exited!");
            }
        });
    }

    public static void main(String[] args) {
        Mouse_handle frame = new Mouse_handle();
        frame.pack();
        frame.setVisible(true);
    }
}