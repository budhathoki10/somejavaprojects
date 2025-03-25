
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class index extends  JFrame implements ActionListener{

    JMenuItem one;
    JMenu two;
    JMenuItem three;
    JMenuItem four;
    JMenuItem five;
    JMenuItem help;
    JMenuItem exit;
    JMenu file;
    JMenu other;
  
    
    index(){
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JMenuBar menubar= new JMenuBar();
        this.setJMenuBar(menubar);

         file = new JMenu("file");
        other= new JMenu("other");

        menubar.add(file);
        menubar.add(other);

     help =new JMenuItem("help");
     exit= new JMenuItem("exit");

     other.add(help);
     
     other.add(exit);


         one= new JMenuItem("save");
         two= new JMenu("save as");
         three= new JMenuItem("print");

         four= new JMenuItem("pdf");
         five= new JMenuItem("jpg");

        file.add(one);
        file.add(two);
        file.add(three);

        two.add(four);
        two.add(five);

        one.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        help.addActionListener(this);
        exit.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==one){
            JOptionPane.showMessageDialog(null, "sucessfully saved you file","save",JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==three){
            JOptionPane.showMessageDialog(null, "sucessfully print","print",JOptionPane.PLAIN_MESSAGE);
        }
        
        else  if(e.getSource()==help){
            JOptionPane.showMessageDialog(null, "please message me on instagram","help",JOptionPane.PLAIN_MESSAGE);
        }
         else if(e.getSource()==exit){
           System.exit(0);
        }


        else if(e.getSource()==four){
            JOptionPane.showMessageDialog(null, "sucessfully saved your file in pdf","save",JOptionPane.PLAIN_MESSAGE);
        }
        else if(e.getSource()==five){
            JOptionPane.showMessageDialog(null, "sucessfully saved you file in jpg","save",JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    
}