import javax.swing.*;
// import java.awt.*;
class MyAPI {
public static void main(String[] args) {
	JFrame jf = new JFrame("Text Field...");
	jf.setSize(800, 600);
	// jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    // HIDE_ON_CLOSE
	// jf.setContentPane().setBackground(Color.CYAN);

	// jf.resizable(false);
	JTextField t = new JTextField();
	t.setBounds(50, 100, 200, 50);
	jf.add(t);

	JPasswordField p = new JPasswordField("$");
	p.setBounds(50, 150, 200, 50);
	jf.add(p);

	JButton b = new JButton("Submit");
	b.setBounds(50, 200, 200, 50);
	jf.add(b);

	jf.setLayout(null);

	jf.setVisible(true);
	}
}