package GerenciadorDeClasses;

import CriacaoDaFicha.Antecedentes.Acolito;
import CriacaoDaFicha.Antecedentes.ArtesaoDeGuilda;
import CriacaoDaFicha.Antecedentes.SemAntecedente;
import CriacaoDaFicha.ApoiadorDaClasse.Antecedente;
import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import CriacaoDaFicha.Classes.Barbaro;
import CriacaoDaFicha.Classes.SemClasse;
import Folhas.PaginaFicha;

public class Gerente {
    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;

    public Gerente(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
    }

    public Classe getClasse(String nome){
        switch (nome) {

            case "Bárbaro":


                return new Barbaro(gerenteClasses, paginaFicha);

//            case "Bardo":
//                return new Bardo(ficha);
//
//            case "Bruxo":
//                return new Bruxo(ficha);
//
//            case "Clérigo":
//                return new Clerigo(ficha);
//
//            case "Druida":
//                return new Druida(ficha);
//
//            case "Feiticeiro":
//                return new Feiticeiro(ficha);
//
//            case "Guerreiro":
//                return new Guerreiro(ficha);
//
//            case "Ladino":
//                return new Ladino(ficha);
//
//            case "Mago":
//                return new Mago(ficha);
//
//            case "Monge":
//                return new Monge(ficha);
//
//            case "Paladino":
//                return new Paladino(ficha);
//
//            case "Patrulheiro":
//                return new Patrulheiro(ficha);

            default:
                return new SemClasse(gerenteClasses, paginaFicha);
        }
    }

    public Antecedente getAntecedente(String nome){
        switch (nome){

            case "Acólito":
                return new Acolito(gerenteClasses, paginaFicha);

            case "Artesão de Guilda":
                return new ArtesaoDeGuilda(gerenteClasses, paginaFicha);

            default:
                return new SemAntecedente(gerenteClasses, paginaFicha);
        }
    }
}
