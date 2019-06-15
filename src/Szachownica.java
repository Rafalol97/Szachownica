import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Szachownica extends JPanel {
    private int rozmiar=8;
    private int pola[][];
    int przelicznikX;
    int przelicznikY;
    public Szachownica() {

        pola = new int[rozmiar][rozmiar];
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        przelicznikX=(getWidth()-10)/rozmiar;
        przelicznikY=(getHeight()-10)/rozmiar;

        boolean kolor=false;
        for(int i=0;i<rozmiar;i++){
            for(int j=0;j<rozmiar;j++){
                if(kolor){
                    g.setColor(Color.red);
                }
                else{
                    g.setColor(Color.white);
                }
                kolor=!kolor;
                g.fillRect(i*przelicznikX,j*przelicznikY,przelicznikX,przelicznikY);
            }
            kolor=!kolor;
        }


    }

}