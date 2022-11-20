package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;

public class Janela {
    private JFrame jFrame;
    private int TELA_CHEIA = JFrame.MAXIMIZED_BOTH;
    private int FECHAR = JFrame.EXIT_ON_CLOSE;

    public Janela(String texto){
        this.jFrame = new JFrame(texto);
    }

    public void setExtendedState(int tamanho){
        this.jFrame.setExtendedState(tamanho);
    }

    public void setUndecorated(){
        this.jFrame.setUndecorated(true);
    }

    public void setDefaultCloseOperation(int fechar){
        this.jFrame.setDefaultCloseOperation(fechar);
    }

    public void setVisible(){
        this.jFrame.setVisible(true);
    }

    public void setLayout(LayoutManager manager){
        this.jFrame.setLayout(manager);
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public int getTELA_CHEIA() {
        return TELA_CHEIA;
    }

    public int getFECHAR() {
        return FECHAR;
    }
}
