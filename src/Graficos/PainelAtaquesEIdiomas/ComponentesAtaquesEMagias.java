package Graficos.PainelAtaquesEIdiomas;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class ComponentesAtaquesEMagias {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private Painel ataquesEMagias;
    private GridBagConstraints gridBagConstraints;

    JTextArea ataquesEMagiasText;
    JScrollPane barraAtaquesEMagias;

    public ComponentesAtaquesEMagias(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.gridBagConstraints = new GridBagConstraints();
        this.paginaFicha = paginaFicha;
        this.ataquesEMagias = paginaFicha.getIdiomas();
        caixaDeTexto();
    }

    public void caixaDeTexto(){

        int width = ataquesEMagias.getjPanel().getPreferredSize().width;

        gridBagConstraints.insets = new Insets(25, 0, -10,-15);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 10;
        ataquesEMagiasText = new JTextArea();
        ataquesEMagiasText.setText("Ataques e Magias");
        ataquesEMagiasText.setPreferredSize(new Dimension(220, 200));
        ataquesEMagiasText.setMaximumSize(new Dimension(220, 200));
        ataquesEMagiasText.setMinimumSize(new Dimension(220, 200));
        ataquesEMagiasText.setEditable(true);
        ataquesEMagiasText.setLineWrap(true);
        ataquesEMagiasText.setWrapStyleWord(true);

        barraAtaquesEMagias = new JScrollPane(ataquesEMagiasText, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraAtaquesEMagias.setPreferredSize(new Dimension(220, 200));
        barraAtaquesEMagias.setMaximumSize(new Dimension(220, 200));
        barraAtaquesEMagias.setMinimumSize(new Dimension(220, 200));
        ataquesEMagias.getjPanel().add(barraAtaquesEMagias, gridBagConstraints);
    }
}
