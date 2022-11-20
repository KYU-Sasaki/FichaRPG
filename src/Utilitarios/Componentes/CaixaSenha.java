package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CaixaSenha {
    private JPasswordField jPasswordField;
    private JPanel jPanel;

    public CaixaSenha(JPanel jPanel){
        this.jPasswordField = new JPasswordField();
        this.jPanel = jPanel;
    }

    public void setDimension(int width, int height){
        this.jPasswordField.setPreferredSize(new Dimension(width, height));
        this.jPasswordField.setMaximumSize(new Dimension(width, height));
        this.jPasswordField.setMinimumSize(new Dimension(width, height));
    }

    public void actionListener(ActionListener actionListener){
        this.jPasswordField.addActionListener(actionListener);
    }

    public JPasswordField getjPasswordField() {
        return jPasswordField;
    }
}
