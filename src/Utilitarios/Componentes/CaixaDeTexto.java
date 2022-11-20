package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CaixaDeTexto {
    private JTextField jTextField;
    private JPanel jpanel;

    public CaixaDeTexto(JPanel jpanel){
        this.jTextField = new JTextField();
        this.jpanel = jpanel;
    }

    public void setDimension(int width, int height){
        this.jTextField.setPreferredSize(new Dimension(width, height));
        this.jTextField.setMinimumSize(new Dimension(width, height));
        this.jTextField.setMaximumSize(new Dimension(width, height));
    }

    public void actionListener(ActionListener listener){
        jTextField.addActionListener(listener);
    }

    public JTextField getjTextField() {
        return jTextField;
    }
}
