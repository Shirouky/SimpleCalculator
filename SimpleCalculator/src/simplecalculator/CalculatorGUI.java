package simplecalculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {

    JLabel label = new JLabel("Calculator");
    JButton button1 = new JButton("Add");
    JButton button2 = new JButton("Substract");
    JButton button3 = new JButton("Multiply");
    JButton button4 = new JButton("Divide");
    JButton button5 = new JButton("Power");
    JTextField a = new JTextField("", 10);
    JTextField b = new JTextField("", 10);
    JLabel resultLabel = new JLabel("Result: ");
    JLabel result = new JLabel("");
    
    

    public CalculatorGUI() {
        JPanel bestPnl = (JPanel)getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        float t = 35, m = 20;
        label.setFont(label.getFont().deriveFont(t));
        result.setFont(label.getFont().deriveFont(m));
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(a);
        add(b);
        add(result);
        add(resultLabel);
        add(label);
        
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(label)
                                .addComponent(button1)
                                .addComponent(button2)
                                .addComponent(button3)
                                .addComponent(button4)
                                .addComponent(button5))
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(a)
                                .addComponent(b)
                                .addComponent(resultLabel)
                                .addComponent(result))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(label)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button1)
                                .addComponent(a))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button2)
                                .addComponent(b))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button3)
                                .addComponent(resultLabel))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(button4)
                                .addComponent(result))
                        .addComponent(button5));
        
        button1.addActionListener(new Event1());
        button2.addActionListener(new Event2());
        button3.addActionListener(new Event3());
        button4.addActionListener(new Event4());
        button5.addActionListener(new Event5());
        
        pack();
        setVisible(true);
    }

    private class Event1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            var calc = new Calculator();
            result.setText(String.valueOf(calc.add(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));
        }
    }

    private class Event2 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            var calc = new Calculator();
            result.setText(String.valueOf(calc.substract(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));
        }
        
    }

    private class Event3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            var calc = new Calculator();
            result.setText(String.valueOf(calc.multiply(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));
        }
    }

    private class Event4 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
        try {
            var calc = new Calculator();
            result.setText(String.valueOf(calc.divide(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));
        }
        catch (ArithmeticException ex) {
                    result.setText("Error: Invalid input for divide calculation.");
        }
        }
    }
    

    private class Event5 implements ActionListener {
    @Override
        public void actionPerformed(ActionEvent e) {
            try {
            var calc = new Calculator();
            result.setText(String.valueOf(calc.power(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()))));
            }
        catch (ArithmeticException ex) {
                    result.setText("Error: Invalid input for power calculation.");
        }
        }
    }
    
}
