package com.noon.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_3;
	
	
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 618);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/com/noon/icon/frame_up.png")));
		lblNewLabel.setBounds(-6, 0, 367, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SignUp.class.getResource("/com/noon/icon/frame_down.png")));
		lblNewLabel_1.setBounds(-6, 569, 367, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmployeeNo = new JLabel("사원번호");
		lblEmployeeNo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmployeeNo.setBounds(25, 97, 61, 16);
		contentPane.add(lblEmployeeNo);
		
		textField = new JTextField();
		textField.setBounds(25, 114, 220, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		// 이미지 줄이기 메소드
		ImageIcon icon = new ImageIcon((SignUp.class.getResource("/com/noon/icon/signin.png")));
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(101, 44, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(changeImg));
		lblNewLabel_2.setBounds(124, 504, 101, 44);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		ImageIcon icon1 = new ImageIcon((SignUp.class.getResource("/com/noon/icon/certify.png")));
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(61, 30, Image.SCALE_SMOOTH);
		lblNewLabel_3.setIcon(new ImageIcon(changeImg1));
		lblNewLabel_3.setBounds(263, 114, 61, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblEmployeeNo_1 = new JLabel("이름");
		lblEmployeeNo_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmployeeNo_1.setBounds(25, 158, 61, 16);
		contentPane.add(lblEmployeeNo_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(25, 175, 299, 35);
		contentPane.add(textField_1);
		
		JLabel lblEmployeeNo_1_1 = new JLabel("ID");
		lblEmployeeNo_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmployeeNo_1_1.setBounds(25, 222, 61, 16);
		contentPane.add(lblEmployeeNo_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(25, 239, 299, 35);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("이미 존재하거나, 탈퇴한 아이디 입니다.");
		lblNewLabel_4.setForeground(new Color(255, 52, 32));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(25, 269, 299, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblEmployeeNo_1_1_1 = new JLabel("PW");
		lblEmployeeNo_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmployeeNo_1_1_1.setBounds(25, 295, 61, 16);
		contentPane.add(lblEmployeeNo_1_1_1);
		
		JLabel lblEmployeeNo_1_1_2 = new JLabel("PW 확인");
		lblEmployeeNo_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmployeeNo_1_1_2.setBounds(25, 348, 61, 16);
		contentPane.add(lblEmployeeNo_1_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(25, 312, 299, 35);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(25, 366, 299, 35);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("비밀번호가 일치하지 않습니다.");
		lblNewLabel_4_1.setForeground(new Color(255, 52, 32));
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(25, 397, 299, 21);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblEmployeeNo_2 = new JLabel("사원번호");
		lblEmployeeNo_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmployeeNo_2.setBounds(25, 421, 61, 16);
		contentPane.add(lblEmployeeNo_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(25, 438, 220, 35);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(changeImg1));
		lblNewLabel_3_1.setBounds(263, 438, 61, 30);
		contentPane.add(lblNewLabel_3_1);
		
	}
	
}

/*
 * 이미지 줄이는 방법
 * ImageIcon icon = new ImageIcon((SignUp.class.getResource("/com/noon/icon/signin.png")));
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(101, 44, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(changeImg));
*/