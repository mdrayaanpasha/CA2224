import java.awt.*;
import java.awt.event.*;




public class SimpleGUI {
    public static void main(String[] args) {
        Frame F = new Frame("AWT EXAMPLE");
        F.setSize(300,300);
        F.setLayout(new FlowLayout());

        Label L = new Label("Click the button");

        Button B =  new Button("Click Me!");

        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                F.dispose();
            }
        });
        F.add(L);
        F.add(B);

        F.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                F.dispose();
            }
        });


        F.setVisible(true);
    }
}
