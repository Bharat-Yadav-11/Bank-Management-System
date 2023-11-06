import javax.swing.*;
import java.awt.*;
import java.util.*;
//import com.LoedLer.calender.JDateChoser;

public class SignUpOne extends JFrame {
    JTextField nameTextField, fNameTextField, dobTextField, genderTextField, emailTextField;
    JTextField  addressTextField, pinCodeTextField, cityTextField, stateTextField;
    SignUpOne(){
        //To set Background color
        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formNo = new JLabel("APPLICATION FORM NO. "+ random);
        formNo.setFont(new Font("Rale way", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);

        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Rale way", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Rale way", Font.BOLD, 22));
        name.setBounds(100, 140, 100, 30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        nameTextField.setBounds(350, 140, 400, 30);
        add(nameTextField);


        JLabel fName = new JLabel("Father's Name:");
        fName.setFont(new Font("Rale way", Font.BOLD, 22));
        fName.setBounds(100, 190, 200, 30);
        add(fName);
        fNameTextField = new JTextField();
        fNameTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        fNameTextField.setBounds(350, 190, 400, 30);
        add(fNameTextField);


        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Rale way", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);


        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Rale way", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);


        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Rale way", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        emailTextField.setBounds(350, 340, 400, 30);
        add(emailTextField);


        JLabel martial = new JLabel("Martial Status:");
        martial.setFont(new Font("Rale way", Font.BOLD, 22));
        martial.setBounds(100, 390, 200, 30);
        add(martial);


        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Rale way", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        addressTextField.setBounds(350, 440, 400, 30);
        add(addressTextField);


        JLabel city = new JLabel("City:");
        city.setFont(new Font("Rale way", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        cityTextField.setBounds(350, 490, 400, 30);
        add(cityTextField);


        JLabel state = new JLabel("State:");
        state.setFont(new Font("Rale way", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        stateTextField.setBounds(350, 540, 400, 30);
        add(stateTextField);


        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Rale way", Font.BOLD, 22));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Rale way", Font.BOLD, 14));
        pinCodeTextField.setBounds(350, 590, 400, 30);
        add(pinCodeTextField);




    }
    public static void main(String[] args) {
        new SignUpOne();





    }
}
