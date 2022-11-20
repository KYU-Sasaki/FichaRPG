package Graficos.PericiasEResistencia;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Bolinha;
import Utilitarios.Componentes.Painel;
import Utilitarios.Componentes.TextoFixo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ComponentesTesteDeResistencia {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel testeDeResistencia;

    private Bolinha radioForca;
    private Bolinha radioDestreza;
    private Bolinha radioConstituicao;
    private Bolinha radioInteligencia;
    private Bolinha radioSabedoria;
    private Bolinha radioCarisma;

    private TextoFixo forca;
    private TextoFixo destreza;
    private TextoFixo constituicao;
    private TextoFixo inteligencia;
    private TextoFixo sabedoria;
    private TextoFixo carisma;

    private List<Bolinha> items = new ArrayList<>();

    public ComponentesTesteDeResistencia(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.testeDeResistencia = paginaFicha.getPericias();
        bolinha();
        textosFixos();
    }

    public void textosFixos(){
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        forca = gerenteClasses.getChamarComponentes().chamarTexto(testeDeResistencia, "0", 15, 15);
        testeDeResistencia.getjPanel().add(forca.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 1;
        destreza = gerenteClasses.getChamarComponentes().chamarTexto(testeDeResistencia, "0", 15, 15);
        testeDeResistencia.getjPanel().add(destreza.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 2;
        constituicao = gerenteClasses.getChamarComponentes().chamarTexto(testeDeResistencia, "0", 15, 15);
        testeDeResistencia.getjPanel().add(constituicao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 3;
        inteligencia = gerenteClasses.getChamarComponentes().chamarTexto(testeDeResistencia, "0", 15, 15);
        testeDeResistencia.getjPanel().add(inteligencia.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 4;
        sabedoria = gerenteClasses.getChamarComponentes().chamarTexto(testeDeResistencia, "0", 15, 15);
        testeDeResistencia.getjPanel().add(sabedoria.getJLabel(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0,0,50, 0);
        gridBagConstraints.gridy = 5;
        carisma = gerenteClasses.getChamarComponentes().chamarTexto(testeDeResistencia, "0", 15, 15);
        testeDeResistencia.getjPanel().add(carisma.getJLabel(), gridBagConstraints);
    }

    public void bolinha(){
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        items.add(radioForca = gerenteClasses.getChamarComponentes().chamarBolinha(testeDeResistencia, "Força", false, 134, 20, true));
        testeDeResistencia.getjPanel().add(radioForca.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 1;
        items.add(radioDestreza = gerenteClasses.getChamarComponentes().chamarBolinha(testeDeResistencia,"Destreza",false, 134, 20, true));
        testeDeResistencia.getjPanel().add(radioDestreza.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 2;
        items.add(radioConstituicao = gerenteClasses.getChamarComponentes().chamarBolinha(testeDeResistencia,"Constituição",false, 134, 20, true));
        testeDeResistencia.getjPanel().add(radioConstituicao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 3;
        items.add(radioInteligencia = gerenteClasses.getChamarComponentes().chamarBolinha(testeDeResistencia,"Inteligência",false, 134, 20, true));
        testeDeResistencia.getjPanel().add(radioInteligencia.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 4;
        items.add(radioSabedoria = gerenteClasses.getChamarComponentes().chamarBolinha(testeDeResistencia,"Sabedoria",false, 134, 20, true));
        testeDeResistencia.getjPanel().add(radioSabedoria.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(0,0,50, 0);
        gridBagConstraints.gridy = 5;
        items.add(radioCarisma = gerenteClasses.getChamarComponentes().chamarBolinha(testeDeResistencia,"Carisma",false, 134, 20, true));
        testeDeResistencia.getjPanel().add(radioCarisma.getjRadioButton(), gridBagConstraints);
    }

    public Bolinha getRadioForca() {

        return radioForca;
    }

    public Bolinha getRadioDestreza() {
        return radioDestreza;
    }

    public Bolinha getRadioConstituicao() {
        return radioConstituicao;
    }

    public Bolinha getRadioInteligencia() {
        return radioInteligencia;
    }

    public Bolinha getRadioSabedoria() {
        return radioSabedoria;
    }

    public Bolinha getRadioCarisma() {
        return radioCarisma;
    }

    public TextoFixo getForca() {
        return forca;
    }

    public TextoFixo getDestreza() {
        return destreza;
    }

    public TextoFixo getConstituicao() {
        return constituicao;
    }

    public TextoFixo getInteligencia() {
        return inteligencia;
    }

    public TextoFixo getSabedoria() {
        return sabedoria;
    }

    public TextoFixo getCarisma() {
        return carisma;
    }



}
