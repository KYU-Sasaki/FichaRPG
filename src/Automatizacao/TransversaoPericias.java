package Automatizacao;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Graficos.PainelValores.ComponentesValoresDeHabilidade;
import Utilitarios.Componentes.TextoFixo;

public class TransversaoPericias {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;

    public TransversaoPericias(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
    }

    public void updatePericias(){
        TextoFixo acrobacia = paginaFicha.getComponentesPericias().getAcrobacia();
        TextoFixo arcanismo = paginaFicha.getComponentesPericias().getArcanismo();
        TextoFixo atletismo = paginaFicha.getComponentesPericias().getAtletismo();
        TextoFixo atuacao = paginaFicha.getComponentesPericias().getAtuacao();
        TextoFixo blefar = paginaFicha.getComponentesPericias().getBlefar();
        TextoFixo furtividade = paginaFicha.getComponentesPericias().getFurtividade();
        TextoFixo historia = paginaFicha.getComponentesPericias().getHistoria();
        TextoFixo intimidacao = paginaFicha.getComponentesPericias().getIntimidacao();
        TextoFixo intuicao = paginaFicha.getComponentesPericias().getIntuicao();
        TextoFixo investigacao = paginaFicha.getComponentesPericias().getInvestigacao();
        TextoFixo lidarComAnimais = paginaFicha.getComponentesPericias().getLidarComAnimais();
        TextoFixo medicina = paginaFicha.getComponentesPericias().getMedicina();
        TextoFixo natureza = paginaFicha.getComponentesPericias().getNatureza();
        TextoFixo percepcao = paginaFicha.getComponentesPericias().getPercepcao();
        TextoFixo persuasao = paginaFicha.getComponentesPericias().getPersuasao();
        TextoFixo prestidigitacao = paginaFicha.getComponentesPericias().getPrestidigitacao();
        TextoFixo religiao = paginaFicha.getComponentesPericias().getReligiao();
        TextoFixo sobrevivencia = paginaFicha.getComponentesPericias().getSobrevivencia();

        ComponentesValoresDeHabilidade componentesValoresDeHabilidade = paginaFicha.getComponentesValoresDeHabilidade();

        int levelForca = componentesValoresDeHabilidade.realocarLevelForca(componentesValoresDeHabilidade.getForcaInt());
        int levelDestreza = componentesValoresDeHabilidade.realocarLevelDestreza(componentesValoresDeHabilidade.getDestrezaInt());
        int levelInteligencia = componentesValoresDeHabilidade.realocarLevelInteligencia(componentesValoresDeHabilidade.getInteligenciaInt());
        int levelSabedoria = componentesValoresDeHabilidade.realocarLevelSabedoria(componentesValoresDeHabilidade.getSabedoriaInt());
        int levelCarisma = componentesValoresDeHabilidade.realocarLevelCarisma(componentesValoresDeHabilidade.getCarismaInt());

        int bonusDeProficiencia = paginaFicha.getComponentesCabecalho().getBonusDeProficiencia();

        acrobacia.setText("" + (levelDestreza + (paginaFicha.getComponentesPericias().getRadioAcrobacia().isSelected() ? bonusDeProficiencia : 0)));
        arcanismo.setText("" + (levelInteligencia + (paginaFicha.getComponentesPericias().getRadioArcanismo().isSelected() ? bonusDeProficiencia : 0)));
        atletismo.setText("" + (levelForca + (paginaFicha.getComponentesPericias().getRadioAtletismo().isSelected() ? bonusDeProficiencia : 0)));
        atuacao.setText("" + (levelCarisma + (paginaFicha.getComponentesPericias().getRadioAtuacao().isSelected() ? bonusDeProficiencia : 0)));
        blefar.setText("" + (levelCarisma + (paginaFicha.getComponentesPericias().getRadioBlefar().isSelected() ? bonusDeProficiencia : 0)));
        furtividade.setText("" + (levelDestreza + (paginaFicha.getComponentesPericias().getRadioFurtividade().isSelected() ? bonusDeProficiencia : 0)));
        historia.setText("" + (levelInteligencia + (paginaFicha.getComponentesPericias().getRadioHistoria().isSelected() ? bonusDeProficiencia : 0)));
        intimidacao.setText("" + (levelCarisma + (paginaFicha.getComponentesPericias().getRadioIntimidacao().isSelected() ? bonusDeProficiencia : 0)));
        intuicao.setText("" + (levelSabedoria + (paginaFicha.getComponentesPericias().getRadioIntuicao().isSelected() ? bonusDeProficiencia : 0)));
        investigacao.setText("" + (levelInteligencia + (paginaFicha.getComponentesPericias().getRadioInvestigacao().isSelected() ? bonusDeProficiencia : 0)));
        lidarComAnimais.setText("" + (levelSabedoria + (paginaFicha.getComponentesPericias().getRadioLidarComAnimais().isSelected() ? bonusDeProficiencia : 0)));
        medicina.setText("" + (levelSabedoria + (paginaFicha.getComponentesPericias().getRadioMedicina().isSelected() ? bonusDeProficiencia : 0)));
        natureza.setText("" + (levelInteligencia + (paginaFicha.getComponentesPericias().getRadioNatureza().isSelected() ? bonusDeProficiencia : 0)));
        percepcao.setText("" + (levelSabedoria + (paginaFicha.getComponentesPericias().getRadioPercepcao().isSelected() ? bonusDeProficiencia : 0)));
        persuasao.setText("" + (levelCarisma + (paginaFicha.getComponentesPericias().getRadioPersuasao().isSelected() ? bonusDeProficiencia : 0)));
        prestidigitacao.setText("" + (levelDestreza + (paginaFicha.getComponentesPericias().getRadioPrestidigitacao().isSelected() ? bonusDeProficiencia : 0)));
        religiao.setText("" + (levelInteligencia + (paginaFicha.getComponentesPericias().getRadioReligiao().isSelected() ? bonusDeProficiencia : 0)));
        sobrevivencia.setText("" + (levelSabedoria + (paginaFicha.getComponentesPericias().getRadioSobrevivencia().isSelected() ? bonusDeProficiencia : 0)));
    }
}
