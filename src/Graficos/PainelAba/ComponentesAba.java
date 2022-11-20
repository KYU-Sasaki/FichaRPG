package Graficos.PainelAba;

import Folhas.PaginaFicha;
import Folhas.PaginaLogin;
import Folhas.PaginaMenu;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Botao;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class ComponentesAba {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private PaginaLogin paginaLogin;
    private Painel aba;
    private Painel cabecalho;
    private Painel chat;
    private Painel valoresDeHabilidade;
    private Painel pericias;
    private Painel idiomas;
    private Painel status;
    private Painel personalidade;

    /// COMPONENTES DO MENU ///
    private Botao voltar;
    private Botao sair;
    private Botao opcoes;

    /// TOOLKIT & DIMENSION ///
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension dimension = tk.getScreenSize();

    public ComponentesAba(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.aba = paginaFicha.getAba();
        this.cabecalho = paginaFicha.getCabecalho();
        this.chat = paginaFicha.getChat();
        this.valoresDeHabilidade = paginaFicha.getValoresDeHabilidade();
        this.pericias = paginaFicha.getPericias();
        this.idiomas = paginaFicha.getIdiomas();
        this.status = paginaFicha.getStatus();
        this.personalidade = paginaFicha.getPersonalidade();
        this.gridBagConstraints = new GridBagConstraints();
        componentes();
    }

    public void componentes(){
        gridBagConstraints.insets = new Insets(0, 5, 0, 5);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        voltar = gerenteClasses.getChamarComponentes().chamarBotao(aba, "Voltar", 146, 38);
        voltar.setCliques(action -> {
            aba.getjPanel().setVisible(false);
            cabecalho.getjPanel().setVisible(false);
            chat.getjPanel().setVisible(false);
            valoresDeHabilidade.getjPanel().setVisible(false);
            pericias.getjPanel().setVisible(false);
            idiomas.getjPanel().setVisible(false);
            status.getjPanel().setVisible(false);
            personalidade.getjPanel().setVisible(false);
            gerenteClasses.getPaginaLogin().getPaginaMenu().getPainel().getjPanel().setVisible(true);
        });
        aba.getjPanel().add(voltar.getBotao(), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        sair = gerenteClasses.getChamarComponentes().chamarBotao(aba, "Sair", 146, 38);
        sair.setCliques(action -> {
            System.exit(0);
        });
        aba.getjPanel().add(sair.getBotao(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0, dimension.width - 458, 0, 5);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        opcoes = gerenteClasses.getChamarComponentes().chamarBotao(aba, "Opções", 146, 38);
        opcoes.setCliques(action -> {
            JOptionPane.showMessageDialog(null, "Ainda em desenvolvimento");
        });
        aba.getjPanel().add(sair.getBotao(), gridBagConstraints);
    }
}
