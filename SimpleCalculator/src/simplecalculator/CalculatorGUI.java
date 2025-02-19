package simplecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {

    JButton button1 = new JButton("Сложение");
    JButton button2 = new JButton("Вычитание");
    JButton button3 = new JButton("Деление");
    JButton button4 = new JButton("Умножение");
    JButton button5 = new JButton("Возведение в степень");
    JTextField a = new JTextField("", 10);
    JTextField b = new JTextField("", 10);
    JLabel result = new JLabel("");

    public CalculatorGUI() {
        JPanel bestPnl = (JPanel)getContentPane();
        bestPnl.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(700, 500);
        setVisible(true);
        setLayout(new GridLayout(3, 2));

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(a);
        add(b);
        add(result);


        button1.addActionListener(new Event1());
        button2.addActionListener(new Event2());
        button3.addActionListener(new Event3());
        button4.addActionListener(new Event4());
        button5.addActionListener(new Event5());
    }

    private class Event1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            var calc = new Calculator();
            result.setText(String.valueOf(calc.add(Integer.parseInt(a.getText()), Integer.parseInt(b.getText()))));
        }
    }

    private class Event2 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(5);
        }
        
    }

    private class Event3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(5);
        }
    }

    private class Event4 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(5);
        }
        }
    

    private class Event5 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(5);
        }
        }
    
}
