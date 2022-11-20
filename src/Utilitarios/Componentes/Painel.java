package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;

public class Painel {
    private JPanel jPanel;
    private JFrame jFrame;
    private JDialog jDialog;

    public Painel(JFrame jFrame){
        this.jPanel = new JPanel();
        this.jFrame = jFrame;
    }

    public Painel(JDialog jDialog){
        this.jPanel = new JPanel();
        this.jDialog = jDialog;
    }

    public void setLayout(LayoutManager manager){
        this.jPanel.setLayout(manager);
    }

    public void setDimension(int width, int height){
        this.jPanel.setPreferredSize(new Dimension(width, height));
        this.jPanel.setMaximumSize(new Dimension(width, height));
        this.jPanel.setMinimumSize(new Dimension(width, height));
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
