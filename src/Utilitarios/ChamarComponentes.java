package Utilitarios;

import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.*;

import javax.print.attribute.standard.JobName;
import javax.swing.*;
import java.awt.*;

public class ChamarComponentes {
    private final GerenteClasses gerenteClasses;
    private final Janela janelas = new Janela(null);

    public ChamarComponentes(GerenteClasses gerenteClasses){
        this.gerenteClasses = gerenteClasses;
    }

    public Janela chamarJanela(String texto, LayoutManager manager){
        Janela janela = new Janela(texto);
        janela.setUndecorated();
        janela.setExtendedState(janela.getTELA_CHEIA());
        janela.setDefaultCloseOperation(janela.getFECHAR());
        janela.setLayout(manager);
        return janela;
    }

    public Painel chamarPainel(Janela janela,int width, int height,LayoutManager manager){
        Painel painel = new Painel(janela.getjFrame());
        painel.setLayout(manager);
        painel.setDimension(width, height);
        janela.getjFrame().add(painel.getjPanel());
        return painel;
    }

    public Painel chamarPainelParaCaixa(CaixaDeDialogo caixaDeDialogo,int width, int height,LayoutManager manager){
        Painel painel = new Painel(caixaDeDialogo.getjDialog());
        painel.setLayout(manager);
        painel.setDimension(width, height);
        caixaDeDialogo.getjDialog().add(painel.getjPanel());
        return painel;
    }

    public TextoFixo chamarTexto(Painel painel, String texto, int width, int height){
        TextoFixo textoFixo = new TextoFixo(painel.getjPanel(), texto);
        textoFixo.setDimension(width, height);
        painel.getjPanel().add(textoFixo.getJLabel());
        return textoFixo;
    }

    public CaixaDeTexto chamarCaixaDeTexto(Painel painel, int width, int height){
        CaixaDeTexto caixaDeTexto = new CaixaDeTexto(painel.getjPanel());
        caixaDeTexto.setDimension(width, height);
        painel.getjPanel().add(caixaDeTexto.getjTextField());
        return caixaDeTexto;
    }

    public CaixaSenha chamarCaixaSenha(Painel painel, int width, int height) {
        CaixaSenha caixaSenha = new CaixaSenha(painel.getjPanel());
        caixaSenha.setDimension(width, height);
        painel.getjPanel().add(caixaSenha.getjPasswordField());
        return caixaSenha;
    }

    public Botao chamarBotao(Painel painel, String text, int width, int height){
        Botao botao = new Botao(painel.getjPanel(), text);
        botao.setDimension(width, height);
        painel.getjPanel().add(botao.getBotao());
        return botao;
    }

    public Selecao chamarSelecao(Painel painel, int width, int height){
        Selecao selecao = new Selecao(painel.getjPanel());
        selecao.setDimension(width, height);
        selecao.setSelectionItem(null);
        painel.getjPanel().add(selecao.getJComboBox());
        return selecao;
    }

    public Bolinha chamarBolinha(Painel painel,String text, boolean selected, int width, int height, boolean enable){
        Bolinha bolinha = new Bolinha(painel.getjPanel(),text, selected);
        bolinha.setDimension(width, height);
        bolinha.setEnable(enable);
        painel.getjPanel().add(bolinha.getjRadioButton());
        return bolinha;
    }

    public CaixaDeDialogo chamarCaixaDeDialogo(Janela janela, LayoutManager manager, int width, int height){
        CaixaDeDialogo caixaDeDialogo = new CaixaDeDialogo(janelas.getjFrame());
        caixaDeDialogo.setPreferredSize(width, height);
        caixaDeDialogo.setLocationRelativeTo();
        caixaDeDialogo.setLayout(manager);
        caixaDeDialogo.setVisible();
        return caixaDeDialogo;
    }

    public Janela getJanela() {
        return janelas;
    }
}
