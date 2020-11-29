import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterButtonApp implements ActionListener {
    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;

    public void GUI()  {
        frame = new JFrame();
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        label = new JLabel(("Number of clicks: 0"));

        //TODO: Make the 'Reset' button reset the number of clicks when pressed.
        JButton resetButton = new JButton( "Reset");
        resetButton.addActionListener(this);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(2,1));
        panel.add(button);
        panel.add(resetButton);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click Counter App");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClickCounterButtonApp().GUI();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}