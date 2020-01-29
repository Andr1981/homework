package homework8_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyNewWindow extends JFrame {
    private JButton button = new JButton("Нажать");
    private JTextField input = new JTextField("", 5);
    private JTextField input1 = new JTextField("", 5);
    private JLabel label = new JLabel("Введите Имя:");
    private JLabel label1 = new JLabel("Введите Фамилию:");
    private JRadioButton radio1 = new JRadioButton("Пол мужской");
    private JRadioButton radio2 = new JRadioButton("Пол женский");
    private JCheckBox check = new JCheckBox("Потвердить", false);

    public MyNewWindow() {
        super("Full Name control");
        this.setBounds(500,100,500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,2,2,2));
        container.add(label);
        container.add(input);
        container.add(label1);
        container.add(input1);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);

        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Ваши данные\n";
            message += "Ваше имя : " + input.getText() + "\n";
            message += "Ваше фамилия : " + input1.getText() + "\n";
            message += (radio1.isSelected()?"Пол: мужской":"Пол: женский")
                    + " \n";
            message += "Подтверждение : " + ((check.isSelected())
                    ?"Подтверждено":"Не подтверждено");
            JOptionPane.showMessageDialog(null,
                    message,
                    "Full Name control Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        MyNewWindow app = new MyNewWindow();
        app.setVisible(true);
    }
}


