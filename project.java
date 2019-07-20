import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class gui extends JFrame implements ActionListener
 {  
  JLabel ln, lr,lr1,lr2;
 JTextField t2;
  JButton b,b1;
 
public gui ()
{
	t2=new JTextField(20);
	ln=new JLabel();
	lr=new JLabel();
	lr1=new JLabel();
	lr2=new JLabel();
	 
	 
	//l1=new JLabel();
	b=new JButton("Enter");
	//add(t1);
	add(lr);
	lr.setText("enter number of runner");
	add(t2);
	//add(t1);
	add(ln);
	//add(l1);
	add(b);
	b1=new JButton("Timer");
	b.addActionListener(this);
	 
	setVisible(true);
	setSize(400,800);
	//setLayout(new GridLayout(3,3));
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 
public void actionPerformed(ActionEvent e)
{
 
 
 
 
        String str=t2.getText();
       // int n,c=2;
       
 
 	//setLayout(null);
       if(!str.equals(""))
       {
     
            ln.setText("enter name of runners and time taken");
 
        int num=Integer.parseInt(str);
 
 
 
       final JTextField name[]=new JTextField[num];
       final  JTextField time[]=new JTextField[num];
         
 
        JLabel n[]=new JLabel[num];
         JLabel t[]=new JLabel[num];
       
 
       
       
       for(int i=0;i<name.length;i++)
        {
          
          n[i]=new JLabel();
          
	   //setLayout(null);
	   n[i].setBounds(50,100,50,20);	
	   add(n[i]);
	  
           n[i].setText("name");
	   
          name[i]=new JTextField(10);
 	//setLayout(null);
        name[i].setBounds(120,100,100,20);
	add(name[i]);
           
          t[i]=new JLabel();
 	    //setLayout(null);
         
           t[i].setText("time");
 	   t[i].setBounds(50,130,50,20);
            add(t[i]);
          time[i]=new JTextField(10);
		//setLayout(null);
		time[i].setBounds(120,130,100,20);
 		add(time[i]);
 			  
        //  tc=t1[i];
        //  add(tc);
         // name[i]=tc.getText();
       
         
         
 
       //  time[i]=Integer.parseInt(tc.getText());
         
         
       }
        add(b1);
        b1.addActionListener(new ActionListener()
{

public void actionPerformed(ActionEvent e)
{
 
 
 int lesstime=Integer.parseInt(time[0].getText()) , winner=0, runner=0,winnertime,
winnerindex, runnertime,runnerindex,check ;
 
        int x = 0,a;
 
for(int i=0;i<time.length;i++)
        {
            check=Integer.parseInt(time[i].getText());
 
            if(check < lesstime)
            {
                lesstime = check;
                x = i;
            }
 
 
        }
        winnertime=lesstime;
winnerindex=x;  
 
if(winnerindex==time.length-1)
{
  lesstime=Integer.parseInt(time[0].getText());
  a=0;
}
 
else
{
  lesstime=Integer.parseInt(time[winnerindex+1].getText());
 
  a=winnerindex+1;
 
}
 
       
        for(int i=0;i<time.length;i++)
        {
 
            check=Integer.parseInt(time[i].getText());
 
 
            if(check<lesstime && check>winnertime)
            {
   
                lesstime =check;
                 a=i;
            }
        }
        runnertime=lesstime;
runnerindex=a;
 
add(lr1);
 
lr1.setText(" winner is   "+name[winnerindex].getText()+"  time taken is   "+winnertime);
 
add(lr2);
 
lr2.setText("runner is    "+name[runnerindex].getText()+"   time taken is  "+runnertime);
 
 }});
}
}
  public static void main(String[] args)
  {
    gui g= new gui();

   
 }
}

