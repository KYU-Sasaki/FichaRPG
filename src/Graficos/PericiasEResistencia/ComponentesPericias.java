package Graficos.PericiasEResistencia;

import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import Folhas.PaginaFicha;
import Folhas.PaginaMenu;
import GerenciadorDeClasses.GerenteClasses;
import Graficos.Aviso;
import Utilitarios.Componentes.Bolinha;
import Utilitarios.Componentes.Painel;
import Utilitarios.Componentes.TextoFixo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ComponentesPericias {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private PaginaMenu paginaMenu;
    private GridBagConstraints gridBagConstraints;
    private Painel pericias;
    private TextoFixo mensagemEquipamentos;
    private Aviso aviso;

    private Bolinha radioAcrobacia;
    private Bolinha radioArcanismo;
    private Bolinha radioAtletismo;
    private Bolinha radioAtuacao;
    private Bolinha radioBlefar;
    private Bolinha radioFurtividade;
    private Bolinha radioHistoria;
    private Bolinha radioIntimidacao;
    private Bolinha radioIntuicao;
    private Bolinha radioInvestigacao;
    private Bolinha radioLidarComAnimais;
    private Bolinha radioMedicina;
    private Bolinha radioNatureza;
    private Bolinha radioPercepcao;
    private Bolinha radioPersuasao;
    private Bolinha radioPrestidigitacao;
    private Bolinha radioReligiao;
    private Bolinha radioSobrevivencia;

    private TextoFixo acrobacia;
    private TextoFixo arcanismo;
    private TextoFixo atletismo;
    private TextoFixo atuacao;
    private TextoFixo blefar;
    private TextoFixo furtividade;
    private TextoFixo historia;
    private TextoFixo intimidacao;
    private TextoFixo intuicao;
    private TextoFixo investigacao;
    private TextoFixo lidarComAnimais;
    private TextoFixo medicina;
    private TextoFixo natureza;
    private TextoFixo percepcao;
    private TextoFixo persuasao;
    private TextoFixo prestidigitacao;
    private TextoFixo religiao;
    private TextoFixo sobrevivencia;

    private List<Bolinha> items = new ArrayList<>();

    public ComponentesPericias(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.pericias = paginaFicha.getPericias();
        bolinha();
        textosFixo();
    }

    public void bolinha(){
        gridBagConstraints.gridx = 2;

        gridBagConstraints.gridy = 7;
        radioAcrobacia = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Acrobacia", false, 134, 20, true);
        items.add(radioAcrobacia);
        pericias.getjPanel().add(radioAcrobacia.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 8;
        radioArcanismo = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Arcanismo", false, 134, 20, true);
        items.add(radioArcanismo);
        pericias.getjPanel().add(radioArcanismo.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 9;
        radioAtletismo = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Atletismo", false, 134, 20, true);
        items.add(radioAtletismo);
        pericias.getjPanel().add(radioAtletismo.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 10;
        radioAtuacao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Atuação", false, 134, 20, true);
        items.add(radioAtuacao);
        pericias.getjPanel().add(radioAtuacao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 11;
        radioBlefar = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Blefar", false, 134, 20, true);
        items.add(radioBlefar);
        pericias.getjPanel().add(radioBlefar.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 12;
        radioFurtividade = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Furtividade", false, 134, 20, true);
        items.add(radioFurtividade);
        pericias.getjPanel().add(radioFurtividade.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 13;
        radioHistoria = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Historia", false, 134, 20, true);
        items.add(radioHistoria);
        pericias.getjPanel().add(radioHistoria.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 14;
        radioIntimidacao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Intimidação", false, 134, 20, true);
        items.add(radioIntimidacao);
        pericias.getjPanel().add(radioIntimidacao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 15;
        radioIntuicao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Intuição", false, 134, 20, true);
        items.add(radioIntuicao);
        pericias.getjPanel().add(radioIntuicao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 16;
        radioInvestigacao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Investigação", false, 134, 20, true);
        items.add(radioInvestigacao);
        pericias.getjPanel().add(radioInvestigacao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 17;
        radioLidarComAnimais = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Lidar com Animais", false, 134, 20, true);
        items.add(radioLidarComAnimais);
        pericias.getjPanel().add(radioLidarComAnimais.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 18;
        radioMedicina = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Medicina", false, 134, 20, true);
        items.add(radioMedicina);
        pericias.getjPanel().add(radioMedicina.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 19;
        radioNatureza = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Natureza", false, 134, 20, true);
        items.add(radioNatureza);
        pericias.getjPanel().add(radioNatureza.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 20;
        radioPercepcao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Percepção", false, 134, 20, true);
        items.add(radioPercepcao);
        pericias.getjPanel().add(radioPercepcao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 21;
        radioPersuasao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Persuasão", false, 134, 20, true);
        items.add(radioPersuasao);
        pericias.getjPanel().add(radioPersuasao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 22;
        radioPrestidigitacao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Prestidigitação", false, 134, 20, true);
        items.add(radioPrestidigitacao);
        pericias.getjPanel().add(radioPrestidigitacao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 23;
        radioReligiao = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Religião", false, 134, 20, true);
        items.add(radioReligiao);
        pericias.getjPanel().add(radioReligiao.getjRadioButton(), gridBagConstraints);

        gridBagConstraints.gridy = 24;
        radioSobrevivencia = gerenteClasses.getChamarComponentes().chamarBolinha(pericias, "Sobrevivência", false, 134, 20, true);
        items.add(radioSobrevivencia);
        pericias.getjPanel().add(radioSobrevivencia.getjRadioButton(), gridBagConstraints);

        items.forEach(radio -> radio.addActionListener(action -> {
            Classe classe = paginaFicha.getClasse();
            int maxRadio = quantidadeMaximaRadio();
            if (maxRadio > classe.getPericiasMaximas()) {
                radio.setSelected(false);

                if (aviso == null || !aviso.getAviso().getjDialog().isVisible()){

                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = 0;
                    gridBagConstraints.insets = new Insets(0 , 0, 50, 0);
                    aviso = new Aviso(gerenteClasses, paginaFicha);
                    mensagemEquipamentos = gerenteClasses.getChamarComponentes().chamarTexto(aviso.getPainel(),"Você selecionou o máximo de perícias", 243, 25);
                    aviso.getPainel().getjPanel().add(mensagemEquipamentos.getJLabel(), gridBagConstraints);
                    aviso.getAviso().getjDialog().setVisible(true);

                }else{
                    paginaFicha.getJanela().getjFrame().remove(aviso.getAviso().getjDialog());
                    aviso = null;

                }
                return;
            }
            paginaFicha.getTransversaoPericias().updatePericias();
        }));
    }

    public void textosFixo(){
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        gridBagConstraints.gridx = 1;

        gridBagConstraints.gridy = 7;
        acrobacia = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(acrobacia.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 8;
        arcanismo = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(arcanismo.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 9;
        atletismo = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(atletismo.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 10;
        atuacao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(atuacao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 11;
        blefar = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(blefar.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 12;
        furtividade = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(furtividade.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 13;
        historia = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(historia.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 14;
        intimidacao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(intimidacao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 15;
        intuicao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(intuicao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 16;
        investigacao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(investigacao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 17;
        lidarComAnimais = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(lidarComAnimais.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 18;
        medicina = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(medicina.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 19;
        natureza = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(natureza.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 20;
        percepcao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(percepcao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 21;
        persuasao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(persuasao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 22;
        prestidigitacao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(prestidigitacao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 23;
        religiao = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(religiao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 24;
        sobrevivencia = gerenteClasses.getChamarComponentes().chamarTexto(pericias, "0", 15, 15);
        pericias.getjPanel().add(sobrevivencia.getJLabel(), gridBagConstraints);
    }

    public int quantidadeMaximaRadio(){
        int i = 0;
        for (Bolinha item : items) {
            if(item.isSelected()){
                i++;
            }
        }
        return i;
    }

    public Bolinha getRadioAcrobacia() {
        return radioAcrobacia;
    }

    public Bolinha getRadioArcanismo() {
        return radioArcanismo;
    }

    public Bolinha getRadioAtletismo() {
        return radioAtletismo;
    }

    public Bolinha getRadioAtuacao() {
        return radioAtuacao;
    }

    public Bolinha getRadioBlefar() {
        return radioBlefar;
    }

    public Bolinha getRadioFurtividade() {
        return radioFurtividade;
    }

    public Bolinha getRadioHistoria() {
        return radioHistoria;
    }

    public Bolinha getRadioIntimidacao() {
        return radioIntimidacao;
    }

    public Bolinha getRadioIntuicao() {
        return radioIntuicao;
    }

    public Bolinha getRadioInvestigacao() {
        return radioInvestigacao;
    }

    public Bolinha getRadioLidarComAnimais() {
        return radioLidarComAnimais;
    }

    public Bolinha getRadioMedicina() {
        return radioMedicina;
    }

    public Bolinha getRadioNatureza() {
        return radioNatureza;
    }

    public Bolinha getRadioPercepcao() {
        return radioPercepcao;
    }

    public Bolinha getRadioPersuasao() {
        return radioPersuasao;
    }

    public Bolinha getRadioPrestidigitacao() {
        return radioPrestidigitacao;
    }

    public Bolinha getRadioReligiao() {
        return radioReligiao;
    }

    public Bolinha getRadioSobrevivencia() {
        return radioSobrevivencia;
    }

    public TextoFixo getAcrobacia() {
        return acrobacia;
    }

    public TextoFixo getArcanismo() {
        return arcanismo;
    }

    public TextoFixo getAtletismo() {
        return atletismo;
    }

    public TextoFixo getAtuacao() {
        return atuacao;
    }

    public TextoFixo getBlefar() {
        return blefar;
    }

    public TextoFixo getFurtividade() {
        return furtividade;
    }

    public TextoFixo getHistoria() {
        return historia;
    }

    public TextoFixo getIntimidacao() {
        return intimidacao;
    }

    public TextoFixo getIntuicao() {
        return intuicao;
    }

    public TextoFixo getInvestigacao() {
        return investigacao;
    }

    public TextoFixo getLidarComAnimais() {
        return lidarComAnimais;
    }

    public TextoFixo getMedicina() {
        return medicina;
    }

    public TextoFixo getNatureza() {
        return natureza;
    }

    public TextoFixo getPercepcao() {
        return percepcao;
    }

    public TextoFixo getPersuasao() {
        return persuasao;
    }

    public TextoFixo getPrestidigitacao() {
        return prestidigitacao;
    }

    public TextoFixo getReligiao() {
        return religiao;
    }

    public TextoFixo getSobrevivencia() {
        return sobrevivencia;
    }

    public List<Bolinha> getItems() {
        return items;
    }


}
