package Graficos.PainelValores;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.Painel;
import Utilitarios.Componentes.TextoFixo;

import java.awt.*;

public class ComponentesValoresDeHabilidade {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel valoresDeHabilidade;

    private TextoFixo nomeFor;
    private TextoFixo nomeDes;
    private TextoFixo nomeCon;
    private TextoFixo nomeInt;
    private TextoFixo nomeSab;
    private TextoFixo nomeCar;

    private TextoFixo forca;
    private TextoFixo destreza;
    private TextoFixo constituicao;
    private TextoFixo inteligencia;
    private TextoFixo sabedoria;
    private TextoFixo carisma;

    private TextoFixo forcaAdaptada;
    private TextoFixo destrezaAdaptada;
    private TextoFixo constituicaoAdaptada;
    private TextoFixo inteligenciaAdaptada;
    private TextoFixo sabedoriaAdaptada;
    private TextoFixo carismaAdaptada;
    private TextoFixo vazio;

    public ComponentesValoresDeHabilidade(GerenteClasses gerenteClasses, PaginaFicha paginagerenteClasses){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginagerenteClasses;
        this.gridBagConstraints = new GridBagConstraints();
        this.valoresDeHabilidade = paginaFicha.getValoresDeHabilidade();
        caixaDeTexto();
        realocarLevel();
    }

    public void caixaDeTexto(){
        /// Força ///
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        nomeFor = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "For", 30, 25);
        valoresDeHabilidade.getjPanel().add(nomeFor.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 3;
        forcaAdaptada = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "0", 30, 15);
        valoresDeHabilidade.getjPanel().add(forcaAdaptada.getJLabel(), gridBagConstraints);

        /// Destreza ///
        gridBagConstraints.gridy = 4;
        nomeDes = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "Des", 30, 25);
        valoresDeHabilidade.getjPanel().add(nomeDes.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 7;
        destrezaAdaptada = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "0", 30, 15);
        valoresDeHabilidade.getjPanel().add(destrezaAdaptada.getJLabel(), gridBagConstraints);

        /// Constituição ///
        gridBagConstraints.gridy = 8;
        nomeCon = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "Con", 30, 25);
        valoresDeHabilidade.getjPanel().add(nomeCon.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 11;
        constituicaoAdaptada = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "0", 30, 15);
        valoresDeHabilidade.getjPanel().add(constituicaoAdaptada.getJLabel(), gridBagConstraints);

        /// Inteligência ///
        gridBagConstraints.gridy = 12;
        nomeInt = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "Int", 30,25);
        valoresDeHabilidade.getjPanel().add(nomeInt.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 15;
        inteligenciaAdaptada = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "0", 30, 15);
        valoresDeHabilidade.getjPanel().add(inteligenciaAdaptada.getJLabel(), gridBagConstraints);

        /// Sabedoria ///
        gridBagConstraints.gridy = 16;
        nomeSab = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "Sab", 30, 25);
        valoresDeHabilidade.getjPanel().add(nomeSab.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 19;
        sabedoriaAdaptada = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "0", 30, 15);
        valoresDeHabilidade.getjPanel().add(sabedoriaAdaptada.getJLabel(), gridBagConstraints);

        /// Carisma ///
        gridBagConstraints.gridy = 20;
        nomeCar = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "Car", 30, 25);
        valoresDeHabilidade.getjPanel().add(nomeCar.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 23;
        carismaAdaptada = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "0", 30, 15);
        valoresDeHabilidade.getjPanel().add(carismaAdaptada.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 24;
        vazio = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "", 30, 15);
        valoresDeHabilidade.getjPanel().add(vazio.getJLabel(), gridBagConstraints);

        /// Valores de habilidade sem conversão ///

        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridy = 1;
        forca = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "10", 70, 45);
        forca.setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        valoresDeHabilidade.getjPanel().add(forca.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 5;
        destreza = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "10", 70, 45);
        destreza.setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        valoresDeHabilidade.getjPanel().add(destreza.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 9;
        constituicao = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "10", 70, 45);
        constituicao.setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        valoresDeHabilidade.getjPanel().add(constituicao.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 13;
        inteligencia = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "10", 70, 45);
        inteligencia.setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        valoresDeHabilidade.getjPanel().add(inteligencia.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 17;
        sabedoria = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "10", 70, 45);
        sabedoria.setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        valoresDeHabilidade.getjPanel().add(sabedoria.getJLabel(), gridBagConstraints);

        gridBagConstraints.gridy = 21;
        carisma = gerenteClasses.getChamarComponentes().chamarTexto(valoresDeHabilidade, "10", 70, 45);
        carisma.setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        valoresDeHabilidade.getjPanel().add(carisma.getJLabel(), gridBagConstraints);
    }

    public void realocarLevel(){
        realocarLevelForca(Integer.parseInt(forca.getJLabel().getText()));
        realocarLevelDestreza(Integer.parseInt(destreza.getJLabel().getText()));
        realocarLevelConstituicao(Integer.parseInt(constituicao.getJLabel().getText()));
        realocarLevelInteligencia(Integer.parseInt(inteligencia.getJLabel().getText()));
        realocarLevelSabedoria(Integer.parseInt(sabedoria.getJLabel().getText()));
        realocarLevelCarisma(Integer.parseInt(carisma.getJLabel().getText()));
    }

    public int realocarLevelForca(int levelForca) {

        String levelTextForca = String.valueOf(levelForca);

        forca.setText(levelTextForca);

        if (levelTextForca.length() == 2) {

            /// Modificar localização ///

        } else {

            /// Modificar localização ///

        }

        int valor = - 5;

        switch (levelForca) {

            case 2:
            case 3:
                valor = -4;
                break;

            case 4:
            case 5:
                valor = -3;
                break;

            case 6:
            case 7:
                valor = -2;
                break;

            case 8:
            case 9:
                valor = -1;
                break;

            case 10:
            case 11:
                valor = 0;
                break;

            case 12:
            case 13:
                valor = 1;
                break;

            case 14:
            case 15:
                valor = 2;
                break;

            case 16:
            case 17:
                valor = 3;
                break;

            case 18:
            case 19:
                valor = 4;
                break;

            case 20:
            case 21:
                valor = 5;
                break;

            case 22:
            case 23:
                valor = 6;
                break;

            case 24:
            case 25:
                valor = 7;
                break;

            case 26:
            case 27:
                valor = 8;
                break;

            case 28:
            case 29:
                valor = 9;
                break;

            case 30:
                valor = 10;
                break;
        }

        forcaAdaptada.setText("" + (valor));

        if (forcaAdaptada.getJLabel().getText().length() == 1) {

            /// Modificar localização ///

        }else if (forcaAdaptada.getJLabel().getText().length() == 2) {

            /// Modificar localização ///
        }
        return valor;
    }


    public int realocarLevelDestreza(int levelDestreza) {
        String levelTextDestreza = String.valueOf(levelDestreza);
        destreza.setText(levelTextDestreza);

        if (levelTextDestreza.length() == 2) {
            /// Modificar localização ///
        } else {
            /// Modificar localização ///
        }


        int valor = -5;

        switch (levelDestreza){

            case 2:
            case 3:
                valor = -4;
                break;
            case 4:
            case 5:
                valor = -3;
                break;

            case 6:
            case 7:
                valor = -2;
                break;

            case 8:
            case 9:
                valor = -1;
                break;

            case 10:
            case 11:
                valor = 0;
                break;

            case 12:
            case 13:
                valor = 1;
                break;

            case 14:
            case 15:
                valor = 2;
                break;

            case 16:
            case 17:
                valor = 3;
                break;

            case 18:
            case 19:
                valor = 4;
                break;

            case 20:
            case 21:
                valor = 5;
                break;

            case 22:
            case 23:
                valor = 6;
                break;

            case 24:
            case 25:
                valor = 7;
                break;

            case 26:
            case 27:
                valor = 8;
                break;

            case 28:
            case 29:
                valor = 9;
                break;

            case 30:
                valor = 10;
                break;
        }

        destrezaAdaptada.setText("" + (valor));
        if (destrezaAdaptada.getJLabel().getText().length() == 1) {
            /// Modificar localização ///
        }else if (destrezaAdaptada.getJLabel().getText().length() == 2) {
            /// Modificar localização ///
        }
        return valor;
    }

    public int realocarLevelConstituicao(int levelConstituicao) {
        String levelTextConstituicao = String.valueOf(levelConstituicao);
        constituicao.setText(levelTextConstituicao);

        if (levelTextConstituicao.length() == 2) {
            /// Modificar localização ///
        } else {
            /// Modificar localização ///
        }

        int valor = -5;

        switch (levelConstituicao){

            case 2:
            case 3:
                valor = -4;
                break;
            case 4:
            case 5:
                valor = -3;
                break;

            case 6:
            case 7:
                valor = -2;
                break;

            case 8:
            case 9:
                valor = -1;
                break;

            case 10:
            case 11:
                valor = 0;
                break;

            case 12:
            case 13:
                valor = 1;
                break;

            case 14:
            case 15:
                valor = 2;
                break;

            case 16:
            case 17:
                valor = 3;
                break;

            case 18:
            case 19:
                valor = 4;
                break;

            case 20:
            case 21:
                valor = 5;
                break;

            case 22:
            case 23:
                valor = 6;
                break;

            case 24:
            case 25:
                valor = 7;
                break;

            case 26:
            case 27:
                valor = 8;
                break;

            case 28:
            case 29:
                valor = 9;
                break;

            case 30:
                valor = 10;
                break;
        }

        constituicaoAdaptada.setText("" + (valor));
        if (constituicaoAdaptada.getJLabel().getText().length() == 1) {
            /// Modificar localização ///
        }else if (constituicaoAdaptada.getJLabel().getText().length() == 2) {
            /// Modificar localização ///
        }
        return valor;
    }

    public int realocarLevelInteligencia(int levelInteligencia) {

        String levelTextInteligencia = String.valueOf(levelInteligencia);
        inteligencia.setText(levelTextInteligencia);
        if (levelTextInteligencia.length() == 2) {
            /// Modificar localização ///
        } else {
            /// Modificar localização ///
        }

        int valor = -5;

        switch (levelInteligencia){

            case 2:
            case 3:
                valor = -4;
                break;
            case 4:
            case 5:
                valor = -3;
                break;

            case 6:
            case 7:
                valor = -2;
                break;

            case 8:
            case 9:
                valor = -1;
                break;

            case 10:
            case 11:
                valor = 0;
                break;

            case 12:
            case 13:
                valor = 1;
                break;

            case 14:
            case 15:
                valor = 2;
                break;

            case 16:
            case 17:
                valor = 3;
                break;

            case 18:
            case 19:
                valor = 4;
                break;

            case 20:
            case 21:
                valor = 5;
                break;

            case 22:
            case 23:
                valor = 6;
                break;

            case 24:
            case 25:
                valor = 7;
                break;

            case 26:
            case 27:
                valor = 8;
                break;

            case 28:
            case 29:
                valor = 9;
                break;

            case 30:
                valor = 10;
                break;
        }

        inteligenciaAdaptada.setText("" + (valor));
        if (inteligenciaAdaptada.getJLabel().getText().length() == 1) {
            /// Modificar localização ///
        }else if (inteligenciaAdaptada.getJLabel().getText().length() == 2) {
            /// Modificar localização ///
        }
        return valor;
    }

    public int realocarLevelSabedoria(int levelSabedoria) {

        String levelTextSabedoria = String.valueOf(levelSabedoria);
        sabedoria.setText(levelTextSabedoria);
        if (levelTextSabedoria.length() == 2) {

            /// Modificar localização ///

        } else {
            /// Modificar localização ///
        }
        int valor = -5;

        switch (levelSabedoria){

            case 2:
            case 3:
                valor = -4;
                break;
            case 4:
            case 5:
                valor = -3;
                break;

            case 6:
            case 7:
                valor = -2;
                break;

            case 8:
            case 9:
                valor = -1;
                break;

            case 10:
            case 11:
                valor = 0;
                break;

            case 12:
            case 13:
                valor = 1;
                break;

            case 14:
            case 15:
                valor = 2;
                break;

            case 16:
            case 17:
                valor = 3;
                break;

            case 18:
            case 19:
                valor = 4;
                break;

            case 20:
            case 21:
                valor = 5;
                break;

            case 22:
            case 23:
                valor = 6;
                break;

            case 24:
            case 25:
                valor = 7;
                break;

            case 26:
            case 27:
                valor = 8;
                break;

            case 28:
            case 29:
                valor = 9;
                break;

            case 30:
                valor = 10;
                break;
        }

        sabedoriaAdaptada.setText("" + valor);
        if (sabedoriaAdaptada.getJLabel().getText().length() == 1) {
            /// Modificar localização ///
        }else if (sabedoriaAdaptada.getJLabel().getText().length() == 2) {
            /// Modificar localização ///
        }
        return valor;
    }

    public int realocarLevelCarisma(int levelCarisma) {

        String levelTextCarisma = String.valueOf(levelCarisma);
        carisma.setText(levelTextCarisma);
        if (levelTextCarisma.length() == 2) {

            /// Modificar localização ///
        } else {

            /// Modificar localização ///
        }
        int valor = -5;

        switch (levelCarisma){

            case 2:
            case 3:
                valor = -4;
                break;
            case 4:
            case 5:
                valor = -3;
                break;

            case 6:
            case 7:
                valor = -2;
                break;

            case 8:
            case 9:
                valor = -1;
                break;

            case 10:
            case 11:
                valor = 0;
                break;

            case 12:
            case 13:
                valor = 1;
                break;

            case 14:
            case 15:
                valor = 2;
                break;

            case 16:
            case 17:
                valor = 3;
                break;

            case 18:
            case 19:
                valor = 4;
                break;

            case 20:
            case 21:
                valor = 5;
                break;

            case 22:
            case 23:
                valor = 6;
                break;

            case 24:
            case 25:
                valor = 7;
                break;

            case 26:
            case 27:
                valor = 8;
                break;

            case 28:
            case 29:
                valor = 9;
                break;

            case 30:
                valor = 10;
                break;
        }

        carismaAdaptada.setText("" + (valor));
        if (carismaAdaptada.getJLabel().getText().length() == 1) {
            /// Modificar localização ///
        }else if (carismaAdaptada.getJLabel().getText().length() == 2){
            /// Modificar localização ///
        }
        return valor;
    }

    /// GETS & SETS ///

    public int getForcaInt() {
        return Integer.parseInt(forca.getJLabel().getText());
    }

    public int getDestrezaInt() {
        return Integer.parseInt(destreza.getJLabel().getText());
    }

    public int getConstituicaoInt() {return Integer.parseInt(constituicao.getJLabel().getText());}

    public int getInteligenciaInt() {
        return Integer.parseInt(inteligencia.getJLabel().getText());
    }

    public int getSabedoriaInt() {
        return Integer.parseInt(sabedoria.getJLabel().getText());
    }

    public int getCarismaInt() {
        return Integer.parseInt(carisma.getJLabel().getText());
    }

    public GerenteClasses getGerenteClasses() {
        return gerenteClasses;
    }

    public Painel getValoresDeHabilidade() {
        return valoresDeHabilidade;
    }

    public TextoFixo getForca() {
        return forca;
    }

    public TextoFixo getDestreza() {
        return destreza;
    }

    public TextoFixo getConstituicao() {
        return constituicao;
    }

    public TextoFixo getInteligencia() {
        return inteligencia;
    }

    public TextoFixo getSabedoria() {
        return sabedoria;
    }

    public TextoFixo getCarisma() {
        return carisma;
    }

    public TextoFixo getConstituicaoAdaptada() {
        return constituicaoAdaptada;
    }
}
