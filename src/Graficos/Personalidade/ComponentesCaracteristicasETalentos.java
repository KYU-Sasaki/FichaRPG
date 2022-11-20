package Graficos.Personalidade;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class ComponentesCaracteristicasETalentos {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel caracteristicasETalentos;

    JTextArea caracteristicas;
    JScrollPane barraCaracteristicas;

    public ComponentesCaracteristicasETalentos(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.caracteristicasETalentos = paginaFicha.getPersonalidade();

        caracteristicas();
    }

    public void caracteristicas(){
        caracteristicas = new JTextArea();
        caracteristicas.setText("Características");
        caracteristicas.setPreferredSize(new Dimension(300, 350));
        caracteristicas.setMaximumSize(new Dimension(300, 350));
        caracteristicas.setMinimumSize(new Dimension(300, 350));
        caracteristicas.setEditable(true);
        caracteristicas.setLineWrap(true);
        caracteristicas.setWrapStyleWord(true);

        barraCaracteristicas = new JScrollPane(caracteristicas, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraCaracteristicas.setPreferredSize(new Dimension(300, 350));
        barraCaracteristicas.setMaximumSize(new Dimension(300, 350));
        barraCaracteristicas.setMinimumSize(new Dimension(300, 350));

        gridBagConstraints.insets = new Insets(30, 0,50,0);
        gridBagConstraints.gridy = 4;
        caracteristicasETalentos.getjPanel().add(barraCaracteristicas, gridBagConstraints);

    }
}
