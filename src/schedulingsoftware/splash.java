package schedulingsoftware;
//import SchedulingSoftware.dashboard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class splash {
    public static void main(String[] args){
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=600; i+=10, x+=7){
            f1.setLocation(700 - ((i+x)/2), 380 - (i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
        
    }
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("schedulingsoftware/icons/Splash1.gif"));
        Image i1 = c1.getImage().getScaledInstance(1050, 680,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
       
        JLabel l1 = new JLabel(i2);
        add(l1, BorderLayout.CENTER);
        
        setUndecorated(true);
        
        t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            dashboard l = new dashboard();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
}
}
}
