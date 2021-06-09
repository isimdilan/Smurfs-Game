import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JTextField;

public class Start extends JFrame {

	private JPanel contentPane;
	ButtonGroup Secimler=new ButtonGroup();
	private JTextField secim;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel gozluklu = new JLabel("New label");
		
		gozluklu.setIcon(new ImageIcon(Start.class.getResource("/images/gozluklu2.png")));
		gozluklu.setBounds(428, 197, 210, 305);
		contentPane.add(gozluklu);
		
		JLabel tembel = new JLabel("");
		tembel.setIcon(new ImageIcon(Start.class.getResource("/images/tembel2.png")));
		tembel.setBounds(749, 197, 210, 305);
		contentPane.add(tembel);
		

		secim = new JTextField();
		secim.setFont(new Font("Tekton Pro Ext", Font.ITALIC, 18));
		secim.setBounds(631, 591, 139, 33);
		contentPane.add(secim);
		secim.setColumns(10);
		
	
		JButton start = new JButton("BAŞLA");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String secimString=secim.getText();
				try {
					Smurfs smurfs=new Smurfs(secimString);
					smurfs.setVisible(true);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		start.setForeground(Color.BLACK);
		start.setBackground(new Color(199,67,87));
		start.setFont(new Font("TR Impact", Font.PLAIN, 21));
		start.setBounds(635, 674, 139, 33);
		contentPane.add(start);
		JLabel arkaplan = new JLabel("");
		arkaplan.setIcon(new ImageIcon(Start.class.getResource("/images/SmurfsVillage.png")));
		arkaplan.setBounds(0, 0, 1366, 768);
		contentPane.add(arkaplan);
		
		
		
		
		
		
		
		
		
	}
}
