import java.awt.*;
import java.awt.event.*;

class Age extends Frame implements ActionListener
{
	Label l,l1,l2,l3,ln,lm,l4,l5,l6;
	TextField t1,t2,t3,t4,t5,t6,t,x,y;
	Button b;
	public Age()
	{
		setLayout(null);

		l = new Label("AGE CALCULATOR");
		ln = new Label("BIRTH");
		l1 = new Label("Date");
		l2 = new Label("Month");
		l3 = new Label("Year");

		lm = new Label("PRESENT");
		l4 = new Label("Date");
		l5 = new Label("Month");
		l6 = new Label("Year");

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();

		t4 = new TextField();
		t5 = new TextField();
		t6 = new TextField();
		t = new TextField();
		x = new TextField();
		y = new TextField();

		b = new Button("CALCULATE");

		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(ln);
		add(lm);
		add(l4);
		add(l5);
		add(l6);

		add(t1);
		add(t2);
		add(t3);

		add(t4);
		add(t5);
		add(t6);

		add(t);
		add(x);
		add(y);
		add(b);

		l.setBounds(235,50,120,20);
		ln.setBounds(100,100,100,30);
		l1.setBounds(55,140,50,20);
		l2.setBounds(55,180,50,20);
		l3.setBounds(55,220,50,20);

		lm.setBounds(375,100,100,30);
		l4.setBounds(330,140,100,30);
		l5.setBounds(330,180,100,30);
		l6.setBounds(330,220,100,30);

		t1.setBounds(140,140,100,20);
		t2.setBounds(140,180,100,20);
		t3.setBounds(140,220,100,20);
		t4.setBounds(440,140,100,20);
		t5.setBounds(440,180,100,20);
		t6.setBounds(440,220,100,20);

		b.setBounds(440,280,100,20);
		x.setBounds(130,320,80,20);
		y.setBounds(285,320,80,20);
		t.setBounds(440,320,80,20);


		l.setForeground(Color.green);
		ln.setForeground(Color.green);
		l1.setForeground(Color.green);
		l2.setForeground(Color.green);
		l3.setForeground(Color.green);
		lm.setForeground(Color.green);
		l4.setForeground(Color.green);
		l5.setForeground(Color.green);
		l6.setForeground(Color.green);

		b.addActionListener(this);
		setBackground(Color.DARK_GRAY);

		addWindowListener(new WindowAdapter()
		{


			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}

		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		int i,j,k,p,q,r,a,c,d;
		if(ae.getSource()==b){

			i = Integer.parseInt(t3.getText());
			j = Integer.parseInt(t6.getText());
			k = j-i;
			t.setText(k+" Years");
			p = Integer.parseInt(t2.getText());
			q = Integer.parseInt(t5.getText());
			
			if(q>=p)
			{
				r = q-p;
				y.setText(r+" Months");
			}
			else
			{
				r = q+12-p;

				k--;
				y.setText(r+ " Months");
				t.setText(k+" Years");

			}
			a = Integer.parseInt(t1.getText());
			c = Integer.parseInt(t4.getText());
			if(c>=a){
				d = c-a;
				x.setText(d+" Days");
			}
			else
			{
				d = (c+30)-a;
				r--;
				x.setText(d+" Days");
				y.setText(r+" Months");
				t.setText(k+" Years");
			}
		
		}

	}

	public static void main(String args[])
	{

		Age a = new Age();
		a.setSize(600,400);
		a.setVisible(true);
	}
}
