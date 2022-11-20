package CriacaoDaFicha.Antecedentes;

import CriacaoDaFicha.ApoiadorDaClasse.Antecedente;
import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;

import static java.lang.Integer.parseInt;

public class Acolito implements Antecedente {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;

    public Acolito(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
    }

    @Override
    public void updateBolinhas() {
        paginaFicha.getComponentesPericias().getRadioAcrobacia().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioArcanismo().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioAtletismo().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioAtuacao().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioBlefar().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioFurtividade().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioHistoria().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioIntimidacao().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioIntuicao().setSelected(true);
        paginaFicha.getComponentesPericias().getRadioInvestigacao().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioLidarComAnimais().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioMedicina().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioNatureza().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioPercepcao().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioPersuasao().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioPrestidigitacao().setSelected(false);
        paginaFicha.getComponentesPericias().getRadioReligiao().setSelected(true);
        paginaFicha.getComponentesPericias().getRadioSobrevivencia().setSelected(false);
    }

    @Override
    public void ferramentas() {

    }

    @Override
    public void idiomas() {

    }

    @Override
    public void equipamentos() {
        String equipamentos = paginaFicha.getComponentesEquipamentos().getEquipamento().getText();

        if (equipamentos.length() == 0){
            paginaFicha.getComponentesEquipamentos().getEquipamento().setText("Um símbolo sagrado (um presente dado quando você entrou no templo)\n" +
                    "Um livro de preces ou uma conta de orações\n" + "5 varetas de incenso\n" + "Vestimentas\n" + "Um conjunto de roupas comuns");
        }else if (equipamentos == ""){

        }else{
            paginaFicha.getComponentesEquipamentos().getEquipamento().setText(equipamentos + "\nUm símbolo sagrado (um presente dado quando você entrou no templo)\n" +
                    "Um livro de preces ou uma conta de orações\n" + "5 varetas de incenso\n" + "Vestimentas\n" + "Um conjunto de roupas comuns");
        }

    }

    @Override
    public void riqueza() {
        String caixaGold = paginaFicha.getComponentesEquipamentos().getpOuro().getjTextField().getText();

        if (caixaGold.isBlank()){
            paginaFicha.getComponentesEquipamentos().getpOuro().getjTextField().setText("15");
        }else{
            int gold = parseInt(caixaGold);
            int valorAjustado = gold + 15;
            paginaFicha.getComponentesEquipamentos().getpOuro().getjTextField().setText("" + valorAjustado);
        }
    }
}
