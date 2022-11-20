package CriacaoDaFicha.ApoiadorDaClasse;

public interface Classe {

    default String getName() {
        return this.getClass().getSimpleName();
    }

    void armas();
    void armaMarcial();
    void armaSimples();
    void dadosDeVida();
    void funcaoEquipamentos();
    void idiomasEProficiencias();
    void itemDaClasse();
    void magia();
    void pacote();
    void updateBolinhas();
    void updateTransversoes();
    void vida();
    void armaduraPadrão();
    void iniciativa();
    void percepcaoPassiva();
    void ataquesEMagias();
    void level(int level);
    void atualizarVida(int criarVida);


    int armadura();
    int getVida();
    int getForca();
    int getDestreza();
    int getConstituicao();
    int getInteligencia();
    int getSabedoria();
    int getCarisma();
    int getPericiasMaximas();
}
