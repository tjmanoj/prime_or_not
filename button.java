import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class button implements ActionListener{
    TextField TF = new TextField("          ");
    button(){
        String[] s={"Java","Pyhton","C"};
        JFrame frame = new JFrame("Button");
        JButton btn[] = new JButton[3];
        frame.add(TF);
        for(int i=0;i<2;i++){
            btn[i] = new JButton(s[i]);
            btn[i].addActionListener(this);
            frame.add(btn[i]);
        }
        frame.setSize(600,100);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        TF.setText("Button Pressed");
}
public static void main(String[] args){
    new button();
}
}