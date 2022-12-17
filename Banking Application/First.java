import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

public class First extends JFrame {
	private JPanel contentPane;
	private JLabel res;
	private ImageIcon i;
	JLabel l2, l3, l4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public First() {

		setTitle("IDEAL BANK");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		i = new ImageIcon("xyz.png");
		l3 = new JLabel(i);
		add(l3);
		l3.setBounds(100, 100, 690, 268);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(320, 470);
		contentPane.add(res);

		JLabel lblNewLabel = new JLabel("WELCOME TO IDEAL BANK");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(180, 20, 600, 70);
        contentPane.add(lblNewLabel);

		//JLabel lblNewwLabel = new JLabel("JAVA MINIPROJECT");
       // lblNewwLabel.setForeground(Color.BLACK);
        //lblNewwLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        //lblNewwLabel.setBounds(650, 500, 600, 70);
        //contentPane.add(lblNewwLabel);

		JButton b1 = new JButton("REGISTER HERE");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// creating one object
				Collect gh = new Collect();
				gh.setVisible(true);
				res.setText("Heading towards Registration Page..");
			}
		});
		b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b1.setSize(200, 50);
		b1.setLocation(350, 400);
		contentPane.add(b1);

	}
}
