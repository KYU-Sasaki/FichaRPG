package Folhas;

import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Botao;
import Utilitarios.Componentes.CaixaDeDialogo;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class PaginaMenu {
    /// OUTRAS CLASSES ///
    private final GerenteClasses gerenteClasses;
    private GridBagConstraints gridBagConstraints;
    private PaginaFicha paginaFicha;

    /// PÁGINAS ///
    private Painel painel;

    /// BOTÕES ///
    private Botao botaoFicha;
    private Botao botaoOpcoes;
    private Botao botaoSair;

    private CaixaDeDialogo teste;

    public PaginaMenu(GerenteClasses gerenteClasses){
        this.gerenteClasses = gerenteClasses;
        this.gridBagConstraints = new GridBagConstraints();
        componentes();
        componentesDoPainel();
    }

    public void componentes(){
        painel = gerenteClasses.getChamarComponentes().chamarPainel(gerenteClasses.getPaginaLogin().getJanela(), 400, 400, new GridBagLayout());
    }

    public void componentesDoPainel(){
        botaoFicha();
        botaoOpcoes();
        botaoSair();
    }

    public void botaoFicha(){
        gridBagConstraints.insets = new Insets(30,-9,0, 0);
        gridBagConstraints.gridy = 0;
        botaoFicha = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Ficha", 300, 40);
        botaoFicha.setCliques(action -> {
            painel.getjPanel().setVisible(false);
            paginaFicha = new PaginaFicha(gerenteClasses);
        });
        painel.getjPanel().add(botaoFicha.getBotao(), gridBagConstraints);
    }

    public void botaoOpcoes(){
        gridBagConstraints.gridy = 1;
        botaoOpcoes = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Opções", 300, 40);
        botaoOpcoes.setCliques(action -> {
            JOptionPane.showMessageDialog(null, "Ainda em desenvolvimento");
        });
        painel.getjPanel().add(botaoOpcoes.getBotao(), gridBagConstraints);
    }

    public void botaoSair(){
        gridBagConstraints.gridy = 2;
        botaoSair = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Sair", 300, 40);
        botaoSair.setCliques(action -> {
            System.exit(0);
        });
        painel.getjPanel().add(botaoSair.getBotao(), gridBagConstraints);
    }

    public PaginaFicha getPaginaFicha() {
        return paginaFicha;
    }

    public Painel getPainel() {
        return painel;
    }
}
