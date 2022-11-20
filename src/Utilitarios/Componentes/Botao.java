package Utilitarios.Componentes;

import Utilitarios.Cliques.Cliques;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botao implements ActionListener {
    private JPanel panel;
    private JDialog jDialog;
    private String text;
    private JButton botao;
    private Cliques cliques;

    public Botao(JPanel panel, String text){
        this.panel = panel;
        this.text = text;
        botao = new JButton(text);
        botao.addActionListener(this);
    }

    public Botao(JDialog jDialog, String text){
        this.jDialog = jDialog;
        this.text = text;
        botao = new JButton(text);
        botao.addActionListener(this);
    }

    public void setDimension(int width, int height){
        botao.setPreferredSize(new Dimension(width, height));
        botao.setMinimumSize(new Dimension(width, height));
        botao.setMaximumSize(new Dimension(width, height));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (cliques != null){
            cliques.run(e);
        }
    }

    public void setCliques(Cliques cliques){
        this.cliques = cliques;
    }

    /// GETS E SETS ///


    public JButton getBotao() {
        return botao;
    }

    public void setBotao(JButton botao) {
        this.botao = botao;
    }
}
