
import java.awt.Dimension;

        import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorldSwing");
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(604,620);
                frame.getContentPane().setPreferredSize(new Dimension(600, 600));
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);

                //Wyswietla komponent
                Szachownica szachownica = new Szachownica();
                szachownica.setBounds(0,0,600,600);
                frame.add(szachownica);
                frame.setVisible(true);
            }});
    }

}
