package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Bolinha {
    private JRadioButton jRadioButton;
    private JPanel jPanel;

    public Bolinha(JPanel jPanel, String text, boolean selected){
        this.jRadioButton = new JRadioButton(text, selected);
        this.jPanel = jPanel;
        this.jRadioButton.setText(text);
    }

    public void setDimension(int width, int height){
        this.jRadioButton.setPreferredSize(new Dimension(width, height));
        this.jRadioButton.setMaximumSize(new Dimension(width, height));
        this.jRadioButton.setMinimumSize(new Dimension(width, height));
    }

    public void setSelected(boolean bool){
        this.jRadioButton.setSelected(bool);
    }

    public boolean isSelected(){
        return  this.jRadioButton.isSelected();
    }

    public void setEnable(boolean bool){
        this.jRadioButton.setEnabled(bool);
    }

    public void addActionListener(ActionListener actionListener){
        this.jRadioButton.addActionListener(actionListener);
    }

    public JRadioButton getjRadioButton() {
        return jRadioButton;
    }
}
