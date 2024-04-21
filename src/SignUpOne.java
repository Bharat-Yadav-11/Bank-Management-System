package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class SignUpOne extends JFrame implements ActionListener {
    public static long random;
    JTextField nameTextField, fNameTextField, dobTextField, emailTextField, addressTextField, pinCodeTextField, cityTextField, stateTextField;
    JButton next;
    JRadioButton male, female, others, married, unmarried;
    SignUpOne(){
        //To set Background color
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formNo = new JLabel("APPLICATION FORM NO. "+ random);
        formNo.setFont(new Font("Arial", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Arial", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);


        JLabel fName = new JLabel("Father's Name:");
        fName.setFont(new Font("Arial", Font.BOLD, 22));
        fName.setBounds(100, 190, 200, 30);
        add(fName);
        fNameTextField = new JTextField();
        fNameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        fNameTextField.setBounds(300, 190, 400, 30);
        add(fNameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Arial", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Arial", Font.BOLD, 14));
        dobTextField.setBounds(300, 240, 400, 30);
        add(dobTextField);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        others = new JRadioButton("Others");
        others.setBounds(600, 290, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);


        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Arial", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);


        JLabel martial = new JLabel("Martial Status:");
        martial.setFont(new Font("Arial", Font.BOLD, 22));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        ButtonGroup martialGroup = new ButtonGroup();
        martialGroup.add(married);
        martialGroup.add(unmarried);


        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);


        JLabel city = new JLabel("City:");
        city.setFont(new Font("Arial", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);


        JLabel state = new JLabel("State:");
        state.setFont(new Font("Arial", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);


        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Arial", Font.BOLD, 22));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinCodeTextField.setBounds(300, 590, 400, 30);
        add(pinCodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        setVisible(true);
        setSize(850, 800);
        setLocation(350,10);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SignUpOne());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = ""+ random;
        String name = nameTextField.getText();
        String fName = fNameTextField.getText();
        String dob = dobTextField.getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else {
            gender = "Others";
        }
        String email = emailTextField.getText();
        String martial = null;
        if(married.isSelected()) {
            martial = "Married";
        } else {
            martial = "Unmarried";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pinCode = pinCodeTextField. getText();
        String state = stateTextField.getText();

        try {
            if (name.isEmpty() || fName.isEmpty() || dob.isEmpty() || email.isEmpty() || address.isEmpty() || city.isEmpty() || pinCode.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values( '"+formNo+"', '"+name+"', '"+fName+"', '"+dob+"', '"+gender+"', '"+email+"', '"+martial+"', '"+address+"', '"+city+"', '"+pinCode+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formNo).setVisible(true);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }



}
