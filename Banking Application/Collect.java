import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;


public class Collect extends JFrame {

    private JPanel contentPane;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JPasswordField t5;
    private JLabel res;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Collect frame = new Collect();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
	 * Create the frame.
	 */
	public Collect() {

		setTitle("Registration Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);


		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Registration");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(350, 10, 253, 70);
        contentPane.add(lblNewLabel);

        JLabel lblNLabel = new JLabel("Already have an account? Login here");
        lblNLabel.setForeground(Color.BLACK);
        lblNLabel.setFont(new Font("Arial", Font.PLAIN, 17));
        lblNLabel.setSize(350, 200);
		lblNLabel.setLocation(290, 350);
        contentPane.add(lblNLabel);
		
		JLabel l1 = new JLabel("Name");
		l1.setFont(new Font("Arial", Font.PLAIN, 20));
		l1.setSize(100, 20);
		l1.setLocation(250, 100);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Mobile");
		l2.setFont(new Font("Arial", Font.PLAIN, 20));
		l2.setSize(100, 20);
		l2.setLocation(250, 150);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Email ID");
		l3.setFont(new Font("Arial", Font.PLAIN, 20));
		l3.setSize(100, 20);
		l3.setLocation(250, 200);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Username");
		l4.setFont(new Font("Arial", Font.PLAIN, 20));
		l4.setSize(100, 20);
		l4.setLocation(250, 250);
		contentPane.add(l4);

		JLabel l5 = new JLabel("Password");
		l5.setFont(new Font("Arial", Font.PLAIN, 20));
		l5.setSize(100, 20);
		l5.setLocation(250, 300);
		contentPane.add(l5);
		
		t1 = new JTextField();
		t1.setSize(250, 30);
		t1.setLocation(400, 100);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setSize(250, 30);
		t2.setLocation(400, 150);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setSize(250 ,30);
		t3.setLocation(400, 200);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setSize(250, 30);
		t4.setLocation(400, 250);
		contentPane.add(t4);
		t4.setColumns(10);

		t5 = new JPasswordField();
		t5.setSize(250, 30);
		t5.setLocation(400, 300);
		contentPane.add(t5);
		t5.setColumns(10);

		
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String mobile=t2.getText();
				String emailid=t3.getText();
				String username=t4.getText();
				String password=t5.getText();
				// creating one object 
				my_update obj=new my_update();
				obj.my_db_update(name, mobile, emailid, username, password);
			
                UserLogin ah = new UserLogin();  
                ah.setVisible(true);
				}
		});
		b1.setFont(new Font("Arial", Font.PLAIN, 20));
		b1.setSize(100, 30);
		
		b1.setLocation(300, 380);
		contentPane.add(b1);

		JButton b2 = new JButton("Reset");
		b2.addActionListener(new ActionListener()
         {
			public void actionPerformed(ActionEvent e) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			res.setText("");
				}
			});
			b2.setFont(new Font("Arial", Font.PLAIN, 20));
		b2.setSize(100, 30);
		
		b2.setLocation(450, 380);
		contentPane.add(b2);
       
        JButton b3 = new JButton("Login");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin bc = new UserLogin();  
                bc.setVisible(true);
                res.setText("Heading towards Login Page..");
				}
		});
		b3.setFont(new Font("Arial", Font.PLAIN, 20));
		b3.setSize(100, 30);
		b3.setLocation(380, 480);
		contentPane.add(b3);
	}
}
