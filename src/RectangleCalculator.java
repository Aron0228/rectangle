import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleCalculator extends JFrame {
    private JTextField sideAField;
    private JTextField sideBField;
    private JTextField sideCField;
    private JLabel surfaceAreaLabel;
    private JLabel volumeLabel;

    public RectangleCalculator() {
        setTitle("Téglatest Kalkulátor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(new GridLayout(7, 2));

        add(new JLabel("Oldal A:"), 0, 0);
        sideAField = new JTextField();
        add(sideAField);

        add(new JLabel("Oldal B:"));
        sideBField = new JTextField();
        add(sideBField);

        add(new JLabel("Oldal C:"));
        sideCField = new JTextField();
        add(sideCField);

        JButton calculateButton = new JButton("Számítás");
        add(calculateButton);
        add(new JLabel());

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        add(new JLabel("Felszín:"));
        surfaceAreaLabel = new JLabel("-");
        add(surfaceAreaLabel);

        add(new JLabel("Térfogat:"));
        volumeLabel = new JLabel("-");
        add(volumeLabel);

        setVisible(true);
    }

    private void calculate() {
        try {
            int a = Integer.parseInt(sideAField.getText());
            int b = Integer.parseInt(sideBField.getText());
            int c = Integer.parseInt(sideCField.getText());

            Rectangle rectangle = new Rectangle(a, b, c);

            surfaceAreaLabel.setText(" " + rectangle.surfaceArea());
            volumeLabel.setText(" " + rectangle.volume());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Kérlek érvényes számokat adj meg!", "Hiba", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new RectangleCalculator();
    }
}
