
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
public class Main extends JFrame implements ActionListener
{
	
	static double a=0,b=0,result=0;
	static int operator=0;
	boolean chcecks = false;
        
	private static final long serialVersionUID = 1L;    
	static Main okienko;    
	static JTextField t = new JTextField();
    static JButton b1 = new JButton("1");
    static JButton b2 = new JButton("2");
    static JButton b3 = new JButton("3");
    static JButton b4 = new JButton("4");
    static JButton b5 = new JButton("5");
    static JButton b6 = new JButton("6");
    static JButton b7 = new JButton("7");
    static JButton b8 = new JButton("8");
    static JButton b9 = new JButton("9");
    static JButton b0 = new JButton("0");
    static JButton bdiv = new JButton("/");
    static JButton bmul = new JButton("*");
    static JButton beq = new JButton("=");
    static JButton badd = new JButton("+");
    static JButton bsub = new JButton("-");
    static JButton bclr = new JButton("C");
    static JButton bdec = new JButton(".");
    static JButton bdel = new JButton("<-");
    public Main()
    {
    
    	try {
            
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
       
    }
    catch (ClassNotFoundException e) {
       
    }
    catch (InstantiationException e) {
       
    }
    catch (IllegalAccessException e) {
       
    }
    	    setSize(250,375);
            setTitle("Kalkulator By Dawid Ploch");
            setVisible(true);
            setResizable(false);
            setLayout(null);            
            t.setEditable(false);
            t.setBounds(15, 10, 200, 50);
            add(t);
            b1.setBounds(70, 270, 45, 45);
            b1.addActionListener(this);
            add(b1);
            b2.setBounds(120, 270, 45, 45);
            b2.addActionListener(this);
            add(b2);
            b3.setBounds(170, 270, 45, 45);
            b3.addActionListener(this);
            add(b3);
            b4.setBounds(70, 220, 45, 45);
            b4.addActionListener(this);
            add(b4);
            b5.setBounds(120, 220, 45, 45);
            b5.addActionListener(this);
            add(b5);
            b6.setBounds(170, 220, 45, 45);
            b6.addActionListener(this);
            add(b6);
            b7.setBounds(70, 170, 45, 45);
            b7.addActionListener(this);
            add(b7);
            b8.setBounds(120, 170, 45, 45);
            b8.addActionListener(this);
            add(b8);
            b9.setBounds(170, 170, 45, 45);
            b9.addActionListener(this);
            add(b9);
            b0.setBounds(20, 270, 45, 45);
            b0.addActionListener(this);
            add(b0);
            beq.setBounds(20, 220, 45, 45);
            beq.addActionListener(this);
            add(beq);
            badd.setBounds(20, 170, 45, 45);
            badd.addActionListener(this);
            add(badd);
            bsub.setBounds(20, 120, 45, 45);
            bsub.addActionListener(this);
            add(bsub);
            bmul.setBounds(120, 120, 45, 45);
            bmul.addActionListener(this);
            add(bmul);
            bdiv.setBounds(70, 120, 45, 45);
            bdiv.addActionListener(this);
            add(bdiv);
            bclr.setBounds(170, 120, 45, 45);
            bclr.addActionListener(this);
            add(bclr);
            bdel.setBounds(170, 70, 45, 45);
            bdel.addActionListener(this);
            add(bdel);
            bdec.setBounds(120, 70, 45, 45);
            bdec.addActionListener(this);
            add(bdec);
            setVisible(true);
        
    }
  
    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));
		
		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==b0)
			t.setText(t.getText().concat("0"));
		
		if(e.getSource()==bdec)
			t.setText(t.getText().concat("."));
		
		if(e.getSource()==badd)
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		} 
		
		if(e.getSource()==bsub)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}
		
		if(e.getSource()==bmul)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}
		
		if(e.getSource()==bdiv)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}
		
		if(e.getSource()==beq)
		{
			b=Double.parseDouble(t.getText());
		
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
		
				default: result=0;
			}
		
			t.setText(""+result);
		}
		
		if(e.getSource()==bclr)
			t.setText("");
		
		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}		
	}
 
	public static void main(String...s)
	{
    	okienko = new Main();
    	okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}