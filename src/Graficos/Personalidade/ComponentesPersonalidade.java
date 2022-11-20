package Graficos.Personalidade;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class ComponentesPersonalidade {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel personalidade;

    JTextArea tracosDePersonalidade;
    JTextArea ideais;
    JTextArea ligacoes;
    JTextArea defeitos;

    JScrollPane barraTracosDePersonalidade;
    JScrollPane barraIdeais;
    JScrollPane barraLigacoes;
    JScrollPane barraDefeitos;

    public ComponentesPersonalidade(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.personalidade = paginaFicha.getPersonalidade();

        tracosDePersonalidade();
        ideais();
        ligacoes();
        defeitos();
    }

    public void tracosDePersonalidade(){

        tracosDePersonalidade = new JTextArea();
        tracosDePersonalidade.setPreferredSize(new Dimension(300, 50));
        tracosDePersonalidade.setMaximumSize(new Dimension(300, 50));
        tracosDePersonalidade.setMinimumSize(new Dimension(300, 50));
        tracosDePersonalidade.setEditable(true);
        tracosDePersonalidade.setLineWrap(true);
        tracosDePersonalidade.setWrapStyleWord(true);

        barraTracosDePersonalidade = new JScrollPane(tracosDePersonalidade, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraTracosDePersonalidade.setPreferredSize(new Dimension(293, 49));
        barraTracosDePersonalidade.setMaximumSize(new Dimension(293, 49));
        barraTracosDePersonalidade.setMinimumSize(new Dimension(293, 49));

        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints.gridy = 0;
        personalidade.getjPanel().add(barraTracosDePersonalidade, gridBagConstraints);

    }

    public void ideais(){

        ideais = new JTextArea();
        ideais.setPreferredSize(new Dimension(300, 50));
        ideais.setMaximumSize(new Dimension(300, 50));
        ideais.setMinimumSize(new Dimension(300, 50));
        ideais.setEditable(true);
        ideais.setLineWrap(true);
        ideais.setWrapStyleWord(true);

        barraIdeais = new JScrollPane(ideais, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraIdeais.setPreferredSize(new Dimension(293, 49));
        barraIdeais.setMaximumSize(new Dimension(293, 49));
        barraIdeais.setMinimumSize(new Dimension(293, 49));

        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints.gridy = 1;
        personalidade.getjPanel().add(barraIdeais, gridBagConstraints);

    }

    public void ligacoes(){

        ligacoes = new JTextArea();
        ligacoes.setPreferredSize(new Dimension(300,50));
        ligacoes.setMinimumSize(new Dimension(300,50));
        ligacoes.setMaximumSize(new Dimension(300,50));
        ligacoes.setEditable(true);
        ligacoes.setLineWrap(true);
        ligacoes.setWrapStyleWord(true);

        barraLigacoes = new JScrollPane(ligacoes, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraLigacoes.setPreferredSize(new Dimension(293, 49));
        barraLigacoes.setMaximumSize(new Dimension(293, 49));
        barraLigacoes.setMinimumSize(new Dimension(293, 49));

        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints.gridy = 2;
        personalidade.getjPanel().add(barraLigacoes, gridBagConstraints);

    }

    public void defeitos(){

        defeitos = new JTextArea();
        defeitos.setPreferredSize(new Dimension(300, 50));
        defeitos.setMaximumSize(new Dimension(300, 50));
        defeitos.setMinimumSize(new Dimension(300, 50));
        defeitos.setEditable(true);
        defeitos.setLineWrap(true);
        defeitos.setWrapStyleWord(true);

        barraDefeitos = new JScrollPane(defeitos, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraDefeitos.setPreferredSize(new Dimension(293, 49));
        barraDefeitos.setMaximumSize(new Dimension(293, 49));
        barraDefeitos.setMinimumSize(new Dimension(293, 49));

        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        gridBagConstraints.gridy = 3;
        personalidade.getjPanel().add(barraDefeitos, gridBagConstraints);

    }

}
