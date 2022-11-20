package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;

public class CaixaDeDialogo {
    private JDialog jDialog;
    private JFrame jFrame;

    public CaixaDeDialogo(JFrame jFrame){
        this.jDialog = new JDialog();
        this.jFrame = jFrame;
    }

    public void setLayout(LayoutManager manager){
        this.jDialog.setLayout(manager);
    }

    public void setPreferredSize(int width, int height){
        this.jDialog.setPreferredSize(new Dimension(width, height));
        this.jDialog.setMinimumSize(new Dimension(width, height));
        this.jDialog.setMaximumSize(new Dimension(width, height));
    }

    public void setVisible(){
        this.jDialog.setVisible(true);
    }

    public void setLocationRelativeTo(){
        this.jDialog.setLocationRelativeTo(null);
    }

    public JDialog getjDialog() {
        return jDialog;
    }
}
