package view;

import model.Result;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static final JLabel label = new JLabel(new Result().showResult());

    private static final JPanel panel = new JPanel();

    public Window() {
        super("疑验丁真");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
