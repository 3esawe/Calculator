// Student : Omar Ali Bani-Issa
//ID : 20175703


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyCalc  extends JFrame implements ActionListener{

    JFrame f;

    static JTextField t;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmulti,bsub,badd,bdec,beq,bdel,bclr , bpw,bfic,broot;

    static double a=0,b=0,result=0;

    static int operator=0;


   public MyCalc() {
       f = new JFrame("My Calc");
       t = new JTextField();
       broot = new JButton("sqrt(x)");
       bpw = new JButton("x^x");
       bfic = new JButton("x!");
       b1 = new JButton("1");
       b2 = new JButton("2");
       b3 = new JButton("3");
       b4 = new JButton("4");
       b5 = new JButton("5");
       b6 = new JButton("6");
       b7 = new JButton("7");
       b9 = new JButton("9");
       b8 = new JButton("8");
       b0 = new JButton("0");
       bdiv = new JButton("/");
       bmulti = new JButton("*");
       bsub=new JButton("-");
       badd=new JButton("+");
       bdec=new JButton(".");
       beq=new JButton("=");
       bdel=new JButton("Delete");
       bclr=new JButton("Clear");
        t.setBounds(30,10,280,80);
       b7.setBounds(40,100,50,40);

       b8.setBounds(110,100,50,40);

       b9.setBounds(180,100,50,40);

       bdiv.setBounds(250,100,50,40);

       b4.setBounds(40,170,50,40);

       b5.setBounds(110,170,50,40);

       b6.setBounds(180,170,50,40);

       bmulti.setBounds(250,170,50,40);

       b1.setBounds(40,240,50,40);

       b2.setBounds(110,240,50,40);

       b3.setBounds(180,240,50,40);

       bsub.setBounds(250,240,50,40);

       bdec.setBounds(40,310,50,40);

       b0.setBounds(110,310,50,40);

       beq.setBounds(180,310,50,40);

       badd.setBounds(250,310,50,40);

       bpw.setBounds(40,380,55,40);

       bclr.setBounds(40,450,80,40);

       bdel.setBounds(120,450,80,40);

       bfic.setBounds(110,380,55,40);

       broot.setBounds(180,380,80,40);

       f.add(t);

       f.add(broot);

       f.add(bfic);

       f.add(b7);

       f.add(bpw);

       f.add(b8);

       f.add(b9);

       f.add(bdiv);

       f.add(b4);

       f.add(b5);

       f.add(b6);

       f.add(bmulti);

       f.add(b1);

       f.add(b2);

       f.add(b3);

       f.add(bsub);

       f.add(bdec);

       f.add(b0);

       f.add(beq);

       f.add(badd);

       f.add(bdel);

       f.add(bclr);

       f.setLayout(null);

       f.setVisible(true);

       f.setSize(350,550);

       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       f.setResizable(false);

       broot.addActionListener(this);

       bpw.addActionListener(this);

       bfic.addActionListener(this);

       b1.addActionListener(this);

       b2.addActionListener(this);

       b3.addActionListener(this);

       b4.addActionListener(this);

       b5.addActionListener(this);

       b6.addActionListener(this);

       b7.addActionListener(this);

       b8.addActionListener(this);

       b9.addActionListener(this);

       b0.addActionListener(this);

       badd.addActionListener(this);

       bdiv.addActionListener(this);

       bmulti.addActionListener(this);

       bsub.addActionListener(this);

       bdec.addActionListener(this);

       beq.addActionListener(this);

       bdel.addActionListener(this);

       bclr.addActionListener(this);
   }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(b1))

            t.setText(t.getText().concat("1"));

        if(e.getSource().equals(b2))

            t.setText(t.getText().concat("2"));

        if(e.getSource().equals(b3))

            t.setText(t.getText().concat("3"));

        if(e.getSource().equals(b4))

            t.setText(t.getText().concat("4"));

        if(e.getSource().equals(b5))

            t.setText(t.getText().concat("5"));

        if(e.getSource().equals(b6))

            t.setText(t.getText().concat("6"));

        if(e.getSource().equals(b7))

            t.setText(t.getText().concat("7"));

        if(e.getSource().equals(b8))

            t.setText(t.getText().concat("8"));

        if(e.getSource().equals(b9))

            t.setText(t.getText().concat("9"));

        if(e.getSource().equals(b0))

            t.setText(t.getText().concat("0"));

        if(e.getSource().equals(bdec))

            t.setText(t.getText().concat("."));

        if (e.getSource().equals(broot)){
            a=Double.parseDouble(t.getText());
            a = root(a);
            t.setText(""+a);
        }
        if(e.getSource().equals(bfic))
        {

            a=Double.parseDouble(t.getText());
            a =fictorials(a);

            t.setText(""+a);
        }
        if(e.getSource().equals(badd))

        {

            a=Double.parseDouble(t.getText());
            System.out.println(a);

            operator=1;

            t.setText("");

        }

        if(e.getSource().equals(bsub))

        {

            a=Double.parseDouble(t.getText());

            operator=2;

            t.setText("");

        }

        if(e.getSource().equals(bmulti))

        {

            a=Double.parseDouble(t.getText());

            operator=3;

            t.setText("");

        }

        if(e.getSource().equals(bdiv))

        {

            a=Double.parseDouble(t.getText());

            operator=4;

            t.setText("");

        }

        if(e.getSource().equals(bpw))

        {

            a=Double.parseDouble(t.getText());

            operator=5;

            t.setText("");

        }
        if(e.getSource().equals(beq))

        {

            b=Double.parseDouble(t.getText());
            System.out.println(b);
            switch(operator)

            {

                case 1: result=a+b;

                    break;

                case 2: result=a-b;

                    break;

                case 3: result=a*b;

                    break;

                case 4: result=a/b;

                    break;
                case 5 :
                    result = Math.pow(a,b);
                    break;


                default: result=0;

            }

            t.setText(""+result);


        }

        if(e.getSource().equals(bclr))

            t.setText("");

        if(e.getSource().equals(bdel))

        {

            String s=t.getText();

            t.setText("");

            for(int i=0;i<s.length()-1;i++)

                t.setText(t.getText()+s.charAt(i));

        }
    }
    private double fictorials (double n){
       if (n ==1){
           return  1;
       }
       else {
           return n * fictorials(n-1);
       }
    }
    private double root (double a ){
       return Math.sqrt(a);
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}
