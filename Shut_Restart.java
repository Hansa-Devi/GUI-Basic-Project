
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Shut_Restart {

Shut_Restart() {


JFrame frame = new JFrame("Try it!");
JButton b1 = new JButton("ShutDown");
JButton b2 = new JButton("Restrat");
JButton b3 = new JButton("Cancel");
JLabel label = new JLabel("Turn off computer");
JLabel l2 = new JLabel("ShutDown");
JLabel l3 = new JLabel("Restart");
//JLabel lb1;
Font font=new Font ("Times New Roman",Font.BOLD,22);
Font ft=new Font ("Arial",Font.PLAIN,18);



ImageIcon icon1=new ImageIcon("C:\\Buddy\\shutdown.jpg");
b1.setIcon(icon1);
ImageIcon icon2=new ImageIcon("C:\\Buddy\\restart.jpg");
b2.setIcon(icon2);
//ImageIcon icon3=new ImageIcon("C:\\Buddy\\background.jpg");
//lb1=new JLabel(icon3);


b1.setBounds(130, 180, 80, 80);
b2.setBounds(250, 180, 80, 80);
b3.setBounds(350, 350, 100, 40);
b3.setFont(ft);
b3.setBackground(Color.WHITE);
label.setBounds(18, 18, 200, 50);
label.setFont(font);
label.setForeground(Color.WHITE);
//lb1.setBounds(0,0,500,500);
l2.setBounds(125,265,90,30);
l3.setBounds(260,265,80,30);
l2.setFont(ft);
l3.setFont(ft);
l2.setForeground(Color.WHITE);
l3.setForeground(Color.WHITE);
b3.addActionListener(new ActionListener(){
 @Override
    public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b3)
{
   System.exit(0);
   }
}
});


b2.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        Runtime.getRuntime().exec("shutdown -r -t 0");  
        }
        catch(Exception ex) {

        }
    }
});

b1.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        Runtime.getRuntime().exec("shutdown -s -t 0"); 
        }
        catch(Exception ex) {
            
        } 
    }
});


frame.setContentPane(new JLabel(new ImageIcon("C:\\Buddy\\background.jpg")));
frame.add(b1);
frame.add(b2);
frame.add(b3);
frame.add(label);
//frame.add(lb1);
frame.add(l2);
frame.add(l3);
frame.setLayout(null);
frame.setVisible(true);
frame.setSize(500,500);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
new Shut_Restart();
}


}



