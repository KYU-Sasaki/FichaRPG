package CriacaoDaFicha.Antecedentes;

import CriacaoDaFicha.ApoiadorDaClasse.Antecedente;
import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;

public class SemAntecedente implements Antecedente {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;

    public SemAntecedente(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;

    }
    @Override
    public void updateBolinhas() {

    }

    @Override
    public void ferramentas() {

    }

    @Override
    public void idiomas() {

    }

    @Override
    public void equipamentos() {

    }

    @Override
    public void riqueza() {

    }
}
