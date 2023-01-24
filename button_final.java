import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class button implements ActionListener{
    TextField t = new TextField("Welcome");
    JButton b1=new JButton("Display");
    JButton b2=new JButton("Reset");
    button(){
        JFrame f = new JFrame("Button Display");
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(t);f.add(b1);f.add(b2);
        f.setSize(600,600);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
            t.setText("Hello");
        else
            t.setText(" ");
    }
    public static void main(String[] args) {
        new button();
    }
}