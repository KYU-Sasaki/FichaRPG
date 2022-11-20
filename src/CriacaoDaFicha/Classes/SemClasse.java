package CriacaoDaFicha.Classes;

import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Graficos.Aviso;
import Utilitarios.Componentes.CaixaDeDialogo;
import Utilitarios.Componentes.Painel;
import Utilitarios.Componentes.TextoFixo;

import java.awt.*;

public class SemClasse implements Classe {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Aviso aviso;
    private Painel chat;
    private TextoFixo mensagemEquipamentos;

    public SemClasse(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
//        this.componentesValoresDeHabilidade = paginaFicha.getComponentesValoresDeHabilidade();
        this.chat = paginaFicha.getChat();
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

    }

    @Override
    public void funcaoEquipamentos() {
        if (aviso == null || !aviso.getAviso().getjDialog().isVisible()){

            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.insets = new Insets(0 , 0, 50, 0);
            aviso = new Aviso(gerenteClasses, paginaFicha);
            mensagemEquipamentos = gerenteClasses.getChamarComponentes().chamarTexto(aviso.getPainel(),"Você deve selecionar uma classe primeiro", 243, 25);
            aviso.getPainel().getjPanel().add(mensagemEquipamentos.getJLabel(), gridBagConstraints);
            aviso.getAviso().getjDialog().setVisible(true);

        }else {

            paginaFicha.getJanela().getjFrame().remove(aviso.getAviso().getjDialog());
            aviso = null;

        }
    }

    @Override
    public void idiomasEProficiencias() {

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

    }

    @Override
    public void updateTransversoes() {

    }

    @Override
    public void vida() {

    }

    @Override
    public void armaduraPadrão() {

    }

    @Override
    public void iniciativa() {

    }

    @Override
    public void percepcaoPassiva() {

    }

    @Override
    public void ataquesEMagias() {

    }

    @Override
    public void level(int level) {

    }

    @Override
    public void atualizarVida(int criarVida) {

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
        return 0;
    }

    @Override
    public int getDestreza() {
        return 0;
    }

    @Override
    public int getConstituicao() {
        return 0;
    }

    @Override
    public int getInteligencia() {
        return 0;
    }

    @Override
    public int getSabedoria() {
        return 0;
    }

    @Override
    public int getCarisma() {
        return 0;
    }

    @Override
    public int getPericiasMaximas() {
        return 0;
    }
}
