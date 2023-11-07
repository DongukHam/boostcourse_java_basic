package javaFlowControl;

import javax.swing.JOptionPane;

public class AuthApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "hdw8607";
		String inputId = JOptionPane.showInputDialog("Please Enter your ID");
		
		String password ="dktlskdy1!";
		String inputPassword = JOptionPane.showInputDialog("Password");
		
		System.out.println("Hi");
		
		if(inputId.equals(id) && inputPassword.equals(password)) {
			System.out.println("Hello Master!");
		} else {
			System.out.println("Please check your id & password");
		}
		
	}

}
