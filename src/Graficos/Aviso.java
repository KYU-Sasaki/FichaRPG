package Graficos;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.CapturaDeTela;
import Utilitarios.Componentes.Botao;
import Utilitarios.Componentes.CaixaDeDialogo;
import Utilitarios.Componentes.Painel;
import Utilitarios.Componentes.TextoFixo;

import javax.swing.*;
import java.awt.*;

public class Aviso {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel painel;
    private CaixaDeDialogo aviso;
    private Botao ok;
    private CapturaDeTela capturaDeTela;
    private TextoFixo imagem;

    public Aviso(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.capturaDeTela = new CapturaDeTela(gerenteClasses, paginaFicha);
        janela();
    }

    public void janela(){
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        capturaDeTela.print();

        aviso = gerenteClasses.getChamarComponentes().chamarCaixaDeDialogo(paginaFicha.getJanela(), new GridBagLayout(), 400, 300);
        painel = gerenteClasses.getChamarComponentes().chamarPainelParaCaixa(aviso, 400, 300, new GridBagLayout());
        paginaFicha.retirarComponentes();

        imagem = gerenteClasses.getChamarComponentes().chamarTexto(paginaFicha.getTrava(), "image", paginaFicha.getDimension().width, paginaFicha.getDimension().height);
        imagem.getJLabel().setIcon(new ImageIcon("C:\\Users\\gu_ss\\Desktop\\Teste\\image"));

        paginaFicha.getTrava().getjPanel().add(imagem.getJLabel());
        paginaFicha.getTrava().getjPanel().setVisible(true);
        ok = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Ok", 50, 25);
        ok.setCliques(a ->{
            aviso.getjDialog().setVisible(false);
            paginaFicha.getTrava().getjPanel().setVisible(false);
            paginaFicha.colocarComponentes();
            paginaFicha.getJanela().getjFrame().remove(aviso.getjDialog());
        });
        painel.getjPanel().add(ok.getBotao(), gridBagConstraints);
        aviso.getjDialog().setModal(true);
        aviso.getjDialog().setVisible(true);
    }

    public CaixaDeDialogo getAviso() {
        return aviso;
    }

    public Painel getPainel() {
        return painel;
    }
}
