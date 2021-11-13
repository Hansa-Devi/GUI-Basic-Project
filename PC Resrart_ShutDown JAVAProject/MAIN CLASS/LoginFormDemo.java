import javax.swing.* ;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame implements ActionListener
{
Container c;
JLabel lb1=new JLabel("Username");
JLabel lb2=new JLabel("Password");
JTextField user_tf=new JTextField();
JPasswordField pass_pf=new JPasswordField();
JButton btn=new JButton("LOGIN");
 
LoginForm()
  {
c=this.getContentPane();
c.setLayout(null);

Font font=new Font ("Times New Roman",Font.BOLD,22);
ImageIcon icon=new ImageIcon("C:\\Buddy\\images.png");
JLabel login=new JLabel(icon);
ImageIcon icon2=new ImageIcon("C:\\Buddy\\USER.jpg");
JLabel frame=new JLabel(icon2);
ImageIcon icon3=new ImageIcon("C:\\Buddy\\loginRed.jpg");
JLabel logsign=new JLabel(icon3);

lb1.setBounds(75,220,120,35);
lb2.setBounds(75,300,120,35);
user_tf.setBounds(220,220,180,35);
pass_pf.setBounds(220,300,180,35);
btn.setBounds(200,380,150,35);
login.setBounds(200,30,180,150);
frame.setBounds(0,0,600,600);
logsign.setBounds(350,400,220,200);

lb1.setFont(font);
lb2.setFont(font);
user_tf.setFont(font);
pass_pf.setFont(font);
btn.setFont(font);

btn.addActionListener(this);

c.add(lb1);
c.add(lb2);
c.add(user_tf);
c.add(pass_pf);
c.add(btn);
c.add(login);
c.add(frame);
c.add(logsign);
}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==btn)
{
  String username=user_tf.getText();
  String password=pass_pf.getText();
if(username.equals("Hansa Devi")&&password.equals("1998"))

{
    Shut_Restart sr=new Shut_Restart();
  }
 else{
        JOptionPane.showMessageDialog(this,"Please enter valid Username and Password");
           }

   }
      }


}
class LoginFormDemo{
public static void main(String agr[])
{
  LoginForm f=new LoginForm();
  f.setVisible(true);
  f.setTitle("Please Enter Your Login Details");
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.setBounds(350,100,600,600);
  
}
}