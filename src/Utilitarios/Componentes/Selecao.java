package Utilitarios.Componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class Selecao <E>{
    private JComboBox jComboBox;
    private JPanel jPanel;

    public Selecao(JPanel jPanel){
        jComboBox = new JComboBox();
    }

    public void setDimension(int width, int height){
        jComboBox.setPreferredSize(new Dimension(width, height));
        jComboBox.setMaximumSize(new Dimension(width, height));
        jComboBox.setMinimumSize(new Dimension(width, height));
    }

    public void addItem(E item){
        jComboBox.addItem(item);
    }

    public void setSelectionItem(Object object){
        jComboBox.setSelectedItem(object);
    }

    public void addItemListener(ItemListener l){
        jComboBox.addItemListener(l);
    }

    public JComboBox<E> getJComboBox(){
        return jComboBox;
    }
}
