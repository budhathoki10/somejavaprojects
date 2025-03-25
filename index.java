
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class index extends JFrame{
JProgressBar bar;
index(){
    this.setSize(1000,500);
    this.setVisible(true);
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    bar= new JProgressBar();
    bar.setBounds(0, 0, 1000, 50);
    this.add(bar);
    bar.setStringPainted(true);
    bar.setBackground(Color.GREEN);
    flow();
   
}

public void flow(){
    int count=0;
    while(count<=100){
        try {
            bar.setValue(count);
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        count+=20;
    }
}
}