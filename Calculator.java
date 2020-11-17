import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
	TextField  t1, t2;
	Label l1;
	Button b1, b2, b3;
	Calculator() {
		t1 = new TextField();
		t1.setBounds(100, 50, 80, 20);
		t2 = new TextField();
		t2.setBounds(100, 100, 80, 20);
		b1 = new Button("+");
		b1.setBounds(80, 220, 30, 30);
		b2 = new Button("-");
		b2.setBounds(130, 220, 30, 30);
		b3 = new Button("*");
		b3.setBounds(170, 220, 30, 30);
		l1 = new Label("");
		l1.setBounds(100, 120, 85, 20);
		add(b1);
		add(b2);
		add(b3);
		add(t1);
		add(t2);
		add(l1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int a, b, c;
		if(e.getSource() == b1) {
			a = Integer.parseInt(t1.getText().trim());
			b = Integer.parseInt(t2.getText().trim());
			c = a + b;
			l1.setText(Integer.toString(c));
		}
		else if(e.getSource() == b2) {
			a = Integer.parseInt(t1.getText().trim());
			b = Integer.parseInt(t2.getText().trim());
			c = a - b;
			l1.setText(Integer.toString(c));
		}
		else if(e.getSource() == b1) {
			a = Integer.parseInt(t1.getText().trim());
			b = Integer.parseInt(t2.getText().trim());
			c = a * b;
			l1.setText(Integer.toString(c));
		}
		else {
			t1.setText(null);
			t2.setText(null);
			l1.setText(null);
		}
		
	}
	public static void main(String args[]) {
		Calculator a = new Calculator();
	}
}
