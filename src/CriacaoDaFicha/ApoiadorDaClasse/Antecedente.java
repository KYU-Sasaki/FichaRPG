package CriacaoDaFicha.ApoiadorDaClasse;

public interface Antecedente {

    default String getName(){
        return this.getClass().getSimpleName();
    }

    void updateBolinhas();
    void ferramentas();
    void idiomas();
    void equipamentos();
    void riqueza();
}
