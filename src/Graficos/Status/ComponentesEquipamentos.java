package Graficos.Status;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.Gerente;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Botao;
import Utilitarios.Componentes.CaixaDeTexto;
import Utilitarios.Componentes.Painel;

import javax.swing.*;
import java.awt.*;

public class ComponentesEquipamentos {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel equipamentos;

    private CaixaDeTexto pCobre;
    private CaixaDeTexto pPrata;
    private CaixaDeTexto pElectrum;
    private CaixaDeTexto pOuro;
    private CaixaDeTexto pPlatina;

    private Botao botaoDeEquipamentos;

    JTextArea equipamento;
    JScrollPane barraEquipamento;

    public ComponentesEquipamentos(GerenteClasses gerenteClassese, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClassese;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.equipamentos = paginaFicha.getStatus();

        caixasDeTextoJTextField();
        botaoDeEquipamentos();
        caixaDeTextoJTextArea();
    }

    public void caixasDeTextoJTextField(){

        gridBagConstraints.insets = new Insets(0, -225, 60,0);
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        pCobre = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(equipamentos, 50, 25);
        equipamentos.getjPanel().add(pCobre.getjTextField(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0, -190, 60,0);
        gridBagConstraints.gridx = 1;
        pPrata = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(equipamentos, 50, 25);
        equipamentos.getjPanel().add(pPrata.getjTextField(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0, -155, 60,0);
        gridBagConstraints.gridx = 2;
        pElectrum = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(equipamentos, 50, 25);
        equipamentos.getjPanel().add(pElectrum.getjTextField(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0, -170, 60,0);
        gridBagConstraints.gridx = 3;
        pOuro = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(equipamentos, 50, 25);
        equipamentos.getjPanel().add(pOuro.getjTextField(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0, -50, 60,0);
        gridBagConstraints.gridx = 4;
        pPlatina = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(equipamentos, 50, 25);
        equipamentos.getjPanel().add(pPlatina.getjTextField(), gridBagConstraints);

    }

    public void botaoDeEquipamentos(){

        gridBagConstraints.insets = new Insets(0, 15, 0,0);
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;

        botaoDeEquipamentos = gerenteClasses.getChamarComponentes().chamarBotao(equipamentos, "Equip", 65, 65);
        botaoDeEquipamentos.setCliques(a -> {

            getEquipamento().setText("");
            paginaFicha.getClasse().funcaoEquipamentos();
        });
        equipamentos.getjPanel().add(botaoDeEquipamentos.getBotao(), gridBagConstraints);

    }

    public void caixaDeTextoJTextArea(){

        gridBagConstraints.insets = new Insets(25, 0, 5,-15);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        equipamento = new JTextArea();
        equipamento.setPreferredSize(new Dimension(290, 280));
        equipamento.setMaximumSize(new Dimension(290, 280));
        equipamento.setMinimumSize(new Dimension(290, 280));
        equipamento.setEditable(true);
        equipamento.setLineWrap(true);
        equipamento.setWrapStyleWord(true);

        barraEquipamento = new JScrollPane(equipamento, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barraEquipamento.setPreferredSize(new Dimension(290, 280));
        barraEquipamento.setMaximumSize(new Dimension(290, 280));
        barraEquipamento.setMinimumSize(new Dimension(290, 280));
        equipamentos.getjPanel().add(barraEquipamento, gridBagConstraints);

    }

    public JTextArea getEquipamento() {
        return equipamento;
    }

    public CaixaDeTexto getpCobre() {
        return pCobre;
    }

    public CaixaDeTexto getpPrata() {
        return pPrata;
    }

    public CaixaDeTexto getpElectrum() {
        return pElectrum;
    }

    public CaixaDeTexto getpOuro() {
        return pOuro;
    }

    public CaixaDeTexto getpPlatina() {
        return pPlatina;
    }
}
