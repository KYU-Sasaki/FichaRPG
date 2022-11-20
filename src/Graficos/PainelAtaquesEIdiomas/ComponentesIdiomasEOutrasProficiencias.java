package Graficos.PainelAtaquesEIdiomas;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.CaixaDeTexto;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class ComponentesIdiomasEOutrasProficiencias {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel idiomasEOutrasProficiencias;

    private CaixaDeTexto percepcaoPassiva;

    JTextArea idiomasEProficiencias;
    JScrollPane barraIdiomasEProficiencias;

    public ComponentesIdiomasEOutrasProficiencias(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.idiomasEOutrasProficiencias = paginaFicha.getIdiomas();

        caixaDeTextoJTextField();
        caixaDeTextoJTextArea();
    }

    public void caixaDeTextoJTextField(){
        gridBagConstraints.insets = new Insets(0,0,-10,0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        percepcaoPassiva = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(idiomasEOutrasProficiencias, 30, 25);
        percepcaoPassiva.getjTextField().setText("Per");
        idiomasEOutrasProficiencias.getjPanel().add(percepcaoPassiva.getjTextField(), gridBagConstraints);

    }

    public void caixaDeTextoJTextArea(){
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        idiomasEProficiencias = new JTextArea();
        idiomasEProficiencias.setPreferredSize(new Dimension( 220, 200));
        idiomasEProficiencias.setMaximumSize(new Dimension( 220, 200));
        idiomasEProficiencias.setMinimumSize(new Dimension( 220, 200));
        idiomasEProficiencias.setEditable(true);
        idiomasEProficiencias.setLineWrap(true);
        idiomasEProficiencias.setWrapStyleWord(true);

        barraIdiomasEProficiencias = new JScrollPane(idiomasEProficiencias, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraIdiomasEProficiencias.setPreferredSize(new Dimension( 220, 200));
        barraIdiomasEProficiencias.setMaximumSize(new Dimension( 220, 200));
        barraIdiomasEProficiencias.setMinimumSize(new Dimension( 220, 200));
        idiomasEOutrasProficiencias.getjPanel().add(barraIdiomasEProficiencias, gridBagConstraints);
    }

    public JTextArea getIdiomasEProficiencias() {
        return idiomasEProficiencias;
    }

    public CaixaDeTexto getPercepcaoPassiva() {
        return percepcaoPassiva;
    }
}
