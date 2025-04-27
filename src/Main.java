import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JFrame {
    private JLabel surfaceAreaLabel;
    private JLabel volumeLabel;

    public Main(int sideA, int sideB, int sideC) {
        Rectangle rectangle = new Rectangle(sideA, sideB, sideC);

        setTitle("Téglatest Kalkulátor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("Felszín:"));
        surfaceAreaLabel = new JLabel(rectangle.surfaceArea() + "");
        add(surfaceAreaLabel);

        add(new JLabel("Térfogat:"));
        volumeLabel = new JLabel(rectangle.volume() + "");
        add(volumeLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Main main = new Main(a, b, c);
    }
}