package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton loginButton, signUpButton, clearButton;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
        setSize(800,480);


        //To apply ATM logo on Frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg")); //Use Image icon
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //Set image scale
        ImageIcon i3 = new ImageIcon(i2); //Image must be Wrapped into ImageIcon to add it on Frame
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        //For Heading  use text in JLabel
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Onward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Rale way", Font.BOLD, 28));
        cardNo.setBounds(120, 150, 150, 30);
        add(cardNo);

        //To create single line input field use JTextField :-
        //JTextField is a lightweight component that allows the editing of a single line of text.
        cardTextField = new JTextField();
        cardTextField.setFont(new Font("Arial", Font.BOLD, 12));
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);


        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Railway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        //To create single line input field use JTextField :-
        //JTextField is a lightweight component that allows the editing of a single line of text.
        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Arial", Font.BOLD, 12));
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);

        //To add Buttons use JButton
        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(300, 300, 100, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(450, 300, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);


        signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(300, 350, 250, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);

        //To set Frame Background color
        getContentPane().setBackground(Color.WHITE);
        setLocation(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clearButton){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == loginButton){
            Conn conn = new Conn();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();
            String query = "select * from login where cardNumber = '"+cardNumber+"' and pinNumber = '"+pinNumber+"' ";

            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number and Pin");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
        else if(ae.getSource() == signUpButton){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
        else {

        }
    }

    public static void main(String[] args) {
        new Login();


    }
}
