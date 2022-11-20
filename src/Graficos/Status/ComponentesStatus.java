package Graficos.Status;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Bolinha;
import Utilitarios.Componentes.CaixaDeTexto;
import Utilitarios.Componentes.Painel;

import java.awt.*;

public class ComponentesStatus {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel status;

    private CaixaDeTexto armadura;
    private CaixaDeTexto iniciativa;
    private CaixaDeTexto deslocamento;
    private CaixaDeTexto vida;
    private CaixaDeTexto vidaTemporaria;
    private CaixaDeTexto total;
    private CaixaDeTexto dadosDeVida;

    private Bolinha radioSucessoUm;
    private Bolinha radioSucessoDois;
    private Bolinha radioSucessoTres;
    private Bolinha radioFracassoUm;
    private Bolinha radioFracassoDois;
    private Bolinha radioFracassoTres;

    public ComponentesStatus(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.status = paginaFicha.getStatus();
        caixaDeTextoJTextField();
        bolinha();
    }

    public void caixaDeTextoJTextField(){

        gridBagConstraints.insets = new Insets(25,15, 0, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        armadura = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status, 70, 60);
        status.getjPanel().add(armadura.getjTextField(), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        iniciativa = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status, 70, 60);
        status.getjPanel().add(iniciativa.getjTextField(), gridBagConstraints);

        gridBagConstraints.gridx = 2;
        deslocamento = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status, 120, 60);
        status.getjPanel().add(deslocamento.getjTextField(), gridBagConstraints);

        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        vida = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status, 205, 25);
        status.getjPanel().add(vida.getjTextField(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(10,15, 0, 0);
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        vidaTemporaria = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status,290, 60);
        status.getjPanel().add(vidaTemporaria.getjTextField(), gridBagConstraints);

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.insets = new Insets(25,65, 0, 0);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        total = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status, 70, 25);
        status.getjPanel().add(total.getjTextField(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(10,15, 0, 0);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        dadosDeVida = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(status,120, 60);
        status.getjPanel().add(dadosDeVida.getjTextField(), gridBagConstraints);

    }

    public void bolinha(){

        gridBagConstraints.insets = new Insets(25,0, 0, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        radioSucessoUm = gerenteClasses.getChamarComponentes().chamarBolinha(status,"",false, 20, 20, true);
        status.getjPanel().add(radioSucessoUm.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(25,-130, 0, 0);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        radioSucessoDois = gerenteClasses.getChamarComponentes().chamarBolinha(status,"", false, 20, 20, true);
        status.getjPanel().add(radioSucessoDois.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(25,-310, 0, 0);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        radioSucessoTres = gerenteClasses.getChamarComponentes().chamarBolinha(status,"", false, 20, 20, true);
        status.getjPanel().add(radioSucessoTres.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(15,0, 0, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        radioFracassoUm = gerenteClasses.getChamarComponentes().chamarBolinha(status,"", false, 20, 20, true);
        status.getjPanel().add(radioFracassoUm.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(15,-130, 0, 0);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        radioFracassoDois = gerenteClasses.getChamarComponentes().chamarBolinha(status,"", false, 20, 20, true);
        status.getjPanel().add(radioFracassoDois.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.insets = new Insets(15,-310, 0, 0);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        radioFracassoTres = gerenteClasses.getChamarComponentes().chamarBolinha(status,"", false, 20, 20, true);
        status.getjPanel().add(radioFracassoTres.getjRadioButton(), gridBagConstraints);
    }

    public CaixaDeTexto getTotal() {
        return total;
    }

    public CaixaDeTexto getDadosDeVida() {
        return dadosDeVida;
    }

    public CaixaDeTexto getVida() {
        return vida;
    }

    public CaixaDeTexto getVidaTemporaria() {
        return vidaTemporaria;
    }

    public CaixaDeTexto getArmadura() {
        return armadura;
    }

    public CaixaDeTexto getIniciativa() {
        return iniciativa;
    }

    public CaixaDeTexto getDeslocamento() {
        return deslocamento;
    }
}
