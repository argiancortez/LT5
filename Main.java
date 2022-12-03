import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class Main extends Compute{

    public static void main(String[] args) {

        JFrame frame = new JFrame("Abstraction");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2, 2, 1, 1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Calculate");

        panelTitle.setBounds(10, 10, 370, 40);
        panelOne.setBounds(10, 60, 370, 80);
        panelTwo.setBounds(10, 200, 370, 40);

        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        panelTitle.setBackground(Color.LIGHT_GRAY);
        panelOne.setBackground(Color.LIGHT_GRAY);
        panelTwo.setBackground(Color.LIGHT_GRAY);

        JLabel labelOne, labelTwo, labelTitle;

        final JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(70,20));
        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(70,20));

        labelTitle = new JLabel("Damage Calculator:", JLabel.CENTER);
        labelOne = new JLabel("Your Raw Damage?");
        labelTwo = new JLabel("Your Weapon Damage?");

        labelTitle.setForeground(Color.BLACK);
        tFieldOne.setBackground(Color.DARK_GRAY);
        tFieldTwo.setBackground(Color.DARK_GRAY);
        tFieldOne.setForeground(Color.LIGHT_GRAY);
        tFieldTwo.setForeground(Color.LIGHT_GRAY);

        labelTitle.setBounds(10,10,90,20);
        labelOne.setBounds(10,10,90,20);
        tFieldOne.setBounds(5, 5, 100, 100);
        labelTwo.setBounds(10,10,90,20);
        tFieldTwo.setBounds(5, 5, 100, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(10,10,90,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeAge(tFieldOne.getText(),tFieldTwo.getText());
                displayMessage(String.valueOf(result));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}



abstract class Methods {
    public void displayMessage(){
        System.out.println("Your damage");
    }
}

