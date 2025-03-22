import java.awt.*;
import java.awt.event.*;



public class divisionGUI{
    public static void main(String[] args) {
        Frame F = new Frame("DIVISION CALCULATOR");
        F.setSize(400,400);
        F.setLayout(new FlowLayout());

        Label L1 = new Label("Enter Number 1");
        TextField TF1 = new TextField(10);
        
        Label L2 = new Label("Enter Number 1");
        TextField TF2 = new TextField(10);

        Button B = new Button("Divide!");

        Label L3 = new Label("Result: ");

        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    double n1 = Double.parseDouble(TF1.getText());
                    double n2 = Double.parseDouble(TF2.getText());

                    if(n2 == 0){
                        L3.setText("Can't Divide Number By Zero!");
                    }else{
                        L3.setText("Result: "+ n1/n2);
                    }
                } catch (NumberFormatException exp) {
                    L3.setText("Internal Error!");
                    System.out.println("Error "+ exp);
                }
            }
        });

        F.add(L1);
        F.add(TF1);
        F.add(L2);
        F.add(TF2);
        F.add(B);
        F.add(L3);

        F.setVisible(true);

    }
}