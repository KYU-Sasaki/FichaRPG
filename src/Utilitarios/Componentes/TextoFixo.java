package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;

public class TextoFixo {
    private JLabel jLabel;
    private JPanel jPanel;
    private JDialog jDialog;

    public TextoFixo(JPanel jPanel, String text){
        this.jLabel = new JLabel(text);
        this.jPanel = jPanel;
    }

    public void setDimension(int width, int height){
        this.jLabel.setPreferredSize(new Dimension(width,height));
        this.jLabel.setMaximumSize(new Dimension(width,height));
        this.jLabel.setMinimumSize(new Dimension(width,height));
    }

    public void setFont(Font font){
        this.jLabel.setFont(font);
    }

    public void setText(String texto){
        this.jLabel.setText(texto);
    }

    public JLabel getJLabel() {
        return jLabel;
    }
}
