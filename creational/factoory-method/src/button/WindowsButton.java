package button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsButton implements Button{
    JPanel jPanel = new JPanel();
    JFrame jFrame = new JFrame();
    JButton button;

    @Override
    public void render() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(jPanel);
        jPanel.add(label);
        onClick();
        jPanel.add(button);

        jFrame.setSize(320, 200);
        jFrame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(_ -> {
            jFrame.setVisible(false);
            System.exit(0);
        });
    }
}
