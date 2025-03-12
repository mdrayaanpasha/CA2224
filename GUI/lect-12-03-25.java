import java.awt.*;

class MyFrame extends Frame {
    public MyFrame() {
        super("My Frame");
        setSize(300, 200);
        setLayout(null); // Needed for setBounds()

        Button B = new Button("Click Me");
        B.setBounds(100, 100, 80, 30);
        B.setBackground(Color.BLUE);    // Button color
        B.setForeground(Color.WHITE);   // Text color

        add(B);

        TextField Tf = new TextField("Type Here");
        Tf.setBounds(100, 50, 100, 30);
        Tf.setBackground(Color.YELLOW); // TextField background
        Tf.setForeground(Color.BLACK);  // TextField text color

        add(Tf);

        setBackground(Color.LIGHT_GRAY); // Frame background
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
