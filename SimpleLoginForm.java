
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SimpleLoginForm extends JFrame implements ActionListener{
    
    JTextField id;
    JLabel ids;

    JLabel passwords;
    JTextField password;

    JButton button;

    JLabel label;
    JOptionPane pane;


    SimpleLoginForm(){

        this.setVisible(true);
        this.setSize(800,800);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ids= new JLabel("enter your id ");
        ids.setBounds(50,100,100,30);
        id= new JTextField();
        id.setBounds(160,100,150,20);
        id.setBackground(Color.lightGray);


        passwords= new JLabel("enter your password ");
        passwords.setBounds(20,150,130,30);
        
        password= new JTextField();
        password.setBounds(160,160,150,20);
        password.setBackground(Color.lightGray);
     
        this.add(id);
        this.add(ids);
        
        this.add(passwords);
        this.add(password);

        button= new JButton("click me");
        button.setBounds(160,200,100,20);
        button.setFocusable(false);
        button.addActionListener(this);
        this.add(button);

        label= new JLabel("result: ");
        label.setBounds(160,250,500,20);
        this.add(label);


      


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
       {
        System.out.println(id.getText());
        System.out.println(password.getText());
        if(id.getText().equals("kushal") && password.getText().equals("9863")){
            label.setText("login sucessfully ");
            JOptionPane.showMessageDialog(null,"login sucessfully","login",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
        else{
            label.setText("incorrect id, password");
            JOptionPane.showMessageDialog(null,"incorrect id password","login",JOptionPane.ERROR_MESSAGE);
        }
       }
    }
    
}