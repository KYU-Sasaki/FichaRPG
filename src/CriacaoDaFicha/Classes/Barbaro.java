package CriacaoDaFicha.Classes;

import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Graficos.PainelValores.ComponentesValoresDeHabilidade;
import Utilitarios.Componentes.CaixaDeTexto;
import Utilitarios.Componentes.TextoFixo;

import javax.swing.*;

public class Barbaro implements Classe {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private ComponentesValoresDeHabilidade componentesValoresDeHabilidade;

    private TextoFixo forca;
    private TextoFixo destreza;
    private TextoFixo constituicao;
    private TextoFixo inteligencia;
    private TextoFixo sabedoria;
    private TextoFixo carisma;

    public Barbaro(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.componentesValoresDeHabilidade = paginaFicha.getComponentesValoresDeHabilidade();
    }

    @Override
    public void armas() {

    }

    @Override
    public void armaMarcial() {

    }

    @Override
    public void armaSimples() {

    }

    @Override
    public void dadosDeVida() {
        CaixaDeTexto total = paginaFicha.getComponentesStatus().getTotal();
        CaixaDeTexto dadosDeVida = paginaFicha.getComponentesStatus().getDadosDeVida();

        total.getjTextField().setText("");
        total.getjTextField().setText("D12");

        dadosDeVida.getjTextField().setText("");
        dadosDeVida.getjTextField().setText("D12");
    }

    @Override
    public void funcaoEquipamentos() {

    }

    @Override
    public void idiomasEProficiencias() {
        JTextArea idiomasEProficiencias = paginaFicha.getComponentesIdiomasEOutrasProficiencias().getIdiomasEProficiencias();
        idiomasEProficiencias.setText("");
        idiomasEProficiencias.setText("ARMADURAS: Armaduras leves, armaduras médias e escudos \n" +
                "ARMAS: Armas simples, armas marciais");
    }

    @Override
    public void itemDaClasse() {

    }

    @Override
    public void magia() {

    }

    @Override
    public void pacote() {

    }

    @Override
    public void updateBolinhas() {
        paginaFicha.getComponentesTesteDeResistencia().getRadioForca().setSelected(true);
        paginaFicha.getComponentesTesteDeResistencia().getRadioDestreza().setSelected(false);
        paginaFicha.getComponentesTesteDeResistencia().getRadioConstituicao().setSelected(true);
        paginaFicha.getComponentesTesteDeResistencia().getRadioInteligencia().setSelected(false);
        paginaFicha.getComponentesTesteDeResistencia().getRadioSabedoria().setSelected(false);
        paginaFicha.getComponentesTesteDeResistencia().getRadioCarisma().setSelected(false);

        paginaFicha.getComponentesPericias().getItems().forEach(bolinha -> bolinha.setSelected(false));

        paginaFicha.getComponentesPericias().getRadioAcrobacia().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioArcanismo().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioAtletismo().setEnable(true);
        paginaFicha.getComponentesPericias().getRadioAtuacao().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioBlefar().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioFurtividade().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioHistoria().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioIntimidacao().setEnable(true);
        paginaFicha.getComponentesPericias().getRadioIntuicao().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioInvestigacao().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioLidarComAnimais().setEnable(true);
        paginaFicha.getComponentesPericias().getRadioMedicina().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioNatureza().setEnable(true);
        paginaFicha.getComponentesPericias().getRadioPercepcao().setEnable(true);
        paginaFicha.getComponentesPericias().getRadioPersuasao().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioPrestidigitacao().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioReligiao().setEnable(false);
        paginaFicha.getComponentesPericias().getRadioSobrevivencia().setEnable(true);

        paginaFicha.getTransversaoPericias().updatePericias();
    }

    @Override
    public void updateTransversoes() {
        componentesValoresDeHabilidade.realocarLevelForca(componentesValoresDeHabilidade.getForcaInt());
        componentesValoresDeHabilidade.realocarLevelConstituicao(componentesValoresDeHabilidade.getConstituicaoInt());

        forca = paginaFicha.getComponentesTesteDeResistencia().getForca();
        destreza = paginaFicha.getComponentesTesteDeResistencia().getDestreza();
        constituicao = paginaFicha.getComponentesTesteDeResistencia().getConstituicao();
        inteligencia = paginaFicha.getComponentesTesteDeResistencia().getInteligencia();
        sabedoria = paginaFicha.getComponentesTesteDeResistencia().getSabedoria();
        carisma = paginaFicha.getComponentesTesteDeResistencia().getCarisma();

        forca.setText("" + getForca());

        destreza.setText("" + getDestreza());

        constituicao.setText("" + getConstituicao());

        inteligencia.setText("" + getInteligencia());

        sabedoria.setText("" + getSabedoria());

        carisma.setText("" + getCarisma());
    }

    @Override
    public void vida() {
        paginaFicha.getComponentesStatus().getVida().getjTextField().setText(
                (getVida() + componentesValoresDeHabilidade.getConstituicaoInt()) + "");

        paginaFicha.getComponentesStatus().getVidaTemporaria().getjTextField().setText(
                (getVida() + componentesValoresDeHabilidade.getConstituicaoInt()) + "");
    }

    @Override
    public void armaduraPadrão() {
        paginaFicha.getComponentesStatus().getArmadura().getjTextField().setText("");

        paginaFicha.getComponentesStatus().getArmadura().getjTextField().setText(((armadura() + getDestreza()) + getConstituicao()) + "");
    }

    @Override
    public void iniciativa() {
        paginaFicha.getComponentesStatus().getIniciativa().getjTextField().setText("");

        paginaFicha.getComponentesStatus().getIniciativa().getjTextField().setText((getDestreza() + ""));
    }

    @Override
    public void percepcaoPassiva() {
        paginaFicha.getComponentesIdiomasEOutrasProficiencias().getPercepcaoPassiva().getjTextField().setText((getSabedoria() + ""));
    }

    @Override
    public void ataquesEMagias() {

    }

    @Override
    public void level(int level) {

    }

    @Override
    public void atualizarVida(int criarVida) {
        int vida = Integer.parseInt(paginaFicha.getComponentesStatus().getVida().getjTextField().getText());
        int vidaTemporaria = Integer.parseInt(paginaFicha.getComponentesStatus().getVidaTemporaria().getjTextField().getText());
        int constituicaoAdaptada = Integer.parseInt(componentesValoresDeHabilidade.getConstituicaoAdaptada().getJLabel().getText());

        int vidaAtualizada = vida + criarVida + constituicaoAdaptada;
        int vidaTemporariaAtualizada = vidaTemporaria + criarVida + constituicaoAdaptada;

        paginaFicha.getComponentesStatus().getVida().getjTextField().setText(vidaAtualizada + "");
        paginaFicha.getComponentesStatus().getVidaTemporaria().getjTextField().setText(vidaTemporariaAtualizada + "");
    }

    @Override
    public int armadura() {
        return 0;
    }

    @Override
    public int getVida() {
        return 0;
    }

    @Override
    public int getForca() {
        int bonusDeProficiencia = paginaFicha.getComponentesCabecalho().getBonusDeProficiencia();
        return componentesValoresDeHabilidade.realocarLevelForca(componentesValoresDeHabilidade.getForcaInt() + bonusDeProficiencia);
    }

    @Override
    public int getDestreza() {
        return componentesValoresDeHabilidade.realocarLevelDestreza(componentesValoresDeHabilidade.getDestrezaInt());
    }

    @Override
    public int getConstituicao() {
        int bonusDeProficiencia = paginaFicha.getComponentesCabecalho().getBonusDeProficiencia();
        return componentesValoresDeHabilidade.realocarLevelConstituicao(componentesValoresDeHabilidade.getConstituicaoInt() + bonusDeProficiencia);
    }

    @Override
    public int getInteligencia() {
        return componentesValoresDeHabilidade.realocarLevelInteligencia(componentesValoresDeHabilidade.getInteligenciaInt());
    }

    @Override
    public int getSabedoria() {
        return componentesValoresDeHabilidade.realocarLevelSabedoria(componentesValoresDeHabilidade.getSabedoriaInt());
    }

    @Override
    public int getCarisma() {
        return componentesValoresDeHabilidade.realocarLevelCarisma(componentesValoresDeHabilidade.getCarismaInt());
    }

    @Override
    public int getPericiasMaximas() {
        return 2;
    }
}
