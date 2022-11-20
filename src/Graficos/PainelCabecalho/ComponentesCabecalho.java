package Graficos.PainelCabecalho;

import CriacaoDaFicha.ApoiadorDaClasse.Antecedente;
import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import GerenciadorDeClasses.VerificarNumero;
import Utilitarios.Componentes.*;

import java.awt.*;

public class ComponentesCabecalho {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel cabecalho;
    private Painel inspiracao;

    /// CAIXA DE TEXTO ///
    private CaixaDeTexto nomeDoPersonagem;
    private CaixaDeTexto nomeDoJogador;
    private CaixaDeTexto experiencia;

    /// BOTÃO ///
    private Botao botaoInspiracao;

    /// SELECAO ///
    private Selecao classes;
    private Selecao antecedentes;
    private Selecao racas;
    private Selecao tendencias;

    /// TEXTO FIXO ///
    private TextoFixo nivel;
    private TextoFixo bonusDeProficiencia;

    /// STRING ///
    private String classeSelecionada;
    private String antecedenteSelecionado;
    private String racaSelecionada;


    public ComponentesCabecalho(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.cabecalho = paginaFicha.getCabecalho();
        this.inspiracao = paginaFicha.getIdiomas();
        this.gridBagConstraints = new GridBagConstraints();
        nomeDoPersonagem();
        classes();
        nivel();
        antecedentes();
        racas();
        tendencias();
        experiencia();
        bonusDeProficiencia();
        inspiracao();
        nomeDoJogador();
    }

    public void nomeDoPersonagem(){
        nomeDoPersonagem = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(cabecalho, 380, 25);
        nomeDoPersonagem.getjTextField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
        nomeDoPersonagem.actionListener(action -> {
            if (nomeDoPersonagem.getjTextField().getText().length() >= 15){
                nomeDoPersonagem.getjTextField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 30));
            }else if (nomeDoPersonagem.getjTextField().getText().length() <= 14){
                nomeDoPersonagem.getjTextField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 40));
            }
        });

        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,100);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        cabecalho.getjPanel().add(nomeDoPersonagem.getjTextField(), gridBagConstraints);
    }

    public void classes(){
        classes = gerenteClasses.getChamarComponentes().chamarSelecao(cabecalho, 90, 27);
        classes.addItem("Bárbaro");
//        classes.addItem("Bardo");
//        classes.addItem("Bruxo");
//        classes.addItem("Clérigo");
//        classes.addItem("Druida");
//        classes.addItem("Feiticeiro");
//        classes.addItem("Guerreiro");
//        classes.addItem("Ladino");
//        classes.addItem("Mago");
//        classes.addItem("Monge");
//        classes.addItem("Paladino");
//        classes.addItem("Patrulheiro");
        classes.setSelectionItem(null);

        classes.addItemListener(action -> {
            this.classeSelecionada = String.valueOf(action.getItem());

            if (classeSelecionada == null){
                return;
            }

            Classe classe = paginaFicha.getGerente().getClasse(classeSelecionada);
            paginaFicha.setClasse(classe);

            classe.dadosDeVida();
            classe.idiomasEProficiencias();
            classe.updateBolinhas();
            classe.updateTransversoes();
            classe.vida();
            classe.armaduraPadrão();
            classe.iniciativa();
            classe.percepcaoPassiva();
            classe.ataquesEMagias();
            classe.level(getNivel());
        });

        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,5);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        cabecalho.getjPanel().add(classes.getJComboBox(), gridBagConstraints);
    }

    public void nivel(){
        gridBagConstraints.insets = new Insets(5,5,5,30);
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        nivel = gerenteClasses.getChamarComponentes().chamarTexto(cabecalho, "1", 10, 5);
        cabecalho.getjPanel().add(nivel.getJLabel(), gridBagConstraints);
    }

    public void antecedentes(){
        antecedentes = gerenteClasses.getChamarComponentes().chamarSelecao(cabecalho, 125, 27);
        antecedentes.addItem("Acólito");
        antecedentes.addItem("Artesão de Guilda");
        antecedentes.addItem("Artista");
        antecedentes.addItem("Charlatão");
        antecedentes.addItem("Criminoso");
        antecedentes.addItem("Eremita");
        antecedentes.addItem("Forasteiro");
        antecedentes.addItem("Heroi do Povo");
        antecedentes.addItem("Marinheiro");
        antecedentes.addItem("Nobre");
        antecedentes.addItem("Órfão");
        antecedentes.addItem("Sábio");
        antecedentes.addItem("Soldado");
        antecedentes.setSelectionItem(null);

        antecedentes.addItemListener(action ->{
            this.antecedenteSelecionado = String.valueOf(action.getItem());

            if (antecedenteSelecionado == null){
                return;
            }

            Antecedente antecedente = paginaFicha.getGerente().getAntecedente(antecedenteSelecionado);
            paginaFicha.setAntecedente(antecedente);

            antecedente.equipamentos();
            antecedente.ferramentas();
            antecedente.updateBolinhas();
            antecedente.idiomas();
            antecedente.riqueza();

        });

        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,90);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
//        antecedentes.getJComboBox().setEnabled(false);
        cabecalho.getjPanel().add(antecedentes.getJComboBox(), gridBagConstraints);
    }

    public void racas(){
        racas = gerenteClasses.getChamarComponentes().chamarSelecao(cabecalho, 90, 27);
        racas.addItem("Anão");
        racas.addItem("Elfo");
        racas.addItem("Halfling");
        racas.addItem("Humano");
        racas.addItem("Draconato");
        racas.addItem("Gnomo");
        racas.addItem("Meio-Elfo");
        racas.addItem("Meio-Orc");
        racas.addItem("Tiefling");
        racas.setSelectionItem(null);

        racas.addItemListener(a -> {
            String racaSelecionada = String.valueOf(a.getItem());

            if (racaSelecionada == null) {
                return;
            }

            switch (racaSelecionada){

                case "Anão":


                    break;

            }
        });

        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,5);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
//        racas.getJComboBox().setEnabled(false);
        cabecalho.getjPanel().add(racas.getJComboBox(), gridBagConstraints);
    }

    public void tendencias(){
        tendencias = gerenteClasses.getChamarComponentes().chamarSelecao(cabecalho, 125, 27);
        tendencias.addItem("Leal - Bom");
        tendencias.addItem("Leal - Neutro");
        tendencias.addItem("Leal - Mau");
        tendencias.addItem("Neutro");
        tendencias.addItem("Neutro - Bom");
        tendencias.addItem("Neutro - Mau");
        tendencias.addItem("Caótico - Neutro");
        tendencias.addItem("Caótico - Bom");
        tendencias.addItem("Caótico - Mau");
        tendencias.setSelectionItem(null);

        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,90);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        cabecalho.getjPanel().add(tendencias.getJComboBox(), gridBagConstraints);
    }

    public void experiencia(){
        experiencia = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(cabecalho, 110, 27);
        experiencia.actionListener(action -> {
//            gerenteClasses.getClasse().level(getNivel());
//            getBonusDeProficiencia();
//            gerenteClasses.getTransversaoPericias().updatePericias();
        });

        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,290);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        cabecalho.getjPanel().add(experiencia.getjTextField(), gridBagConstraints);
    }

    public void bonusDeProficiencia(){
        gridBagConstraints.insets = new Insets(0,0,0,0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        bonusDeProficiencia = gerenteClasses.getChamarComponentes().chamarTexto(cabecalho, "+2", 15, 25);
        cabecalho.getjPanel().add(bonusDeProficiencia.getJLabel(), gridBagConstraints);
    }

    public void inspiracao(){
        gridBagConstraints.insets = new Insets(0,0,0,0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        botaoInspiracao = gerenteClasses.getChamarComponentes().chamarBotao(inspiracao, "Inspiração", 220, 15);
        inspiracao.getjPanel().add(botaoInspiracao.getBotao(), gridBagConstraints);
    }

    public void nomeDoJogador(){
        gridBagConstraints.insets = new Insets(5,gerenteClasses.getAjusteTela().componentesCabecalho(),5,290);
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        nomeDoJogador = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(cabecalho, 110, 27);
        cabecalho.getjPanel().add(nomeDoJogador.getjTextField(), gridBagConstraints);
    }

    public int getXpActual() {

        String xpActualText = experiencia.getjTextField().getText();

        if (!VerificarNumero.isInt(xpActualText)) {
            return 0;
        }

        return Integer.parseInt(xpActualText);
    }

    public int getBonusDeProficiencia() {
        int bonusDeProficienciaNumero = 2;
        int xpActual = getXpActual();
        if (xpActual >= 6500 && xpActual < 48000) {
            bonusDeProficienciaNumero = 3;
        } else if (xpActual >= 48000 && xpActual < 120000) {
            bonusDeProficienciaNumero = 4;
        } else if (xpActual >= 120000 && xpActual < 225000) {
            bonusDeProficienciaNumero = 5;
        } else if (xpActual >= 225000) {
            bonusDeProficienciaNumero = 6;
        }

        bonusDeProficiencia.setText("+" + bonusDeProficienciaNumero);
        return bonusDeProficienciaNumero;
    }

    public int getNivel() {
        int level = 1;
        int xpActual = getXpActual();
        if (xpActual >= 300 && xpActual <= 899) {
            level = 2;
        } else if (xpActual >= 900 && xpActual <= 2699) {
            level = 3;
        } else if (xpActual >= 2700 && xpActual <= 6499) {
            level = 4;
        } else if (xpActual >= 6500 && xpActual <= 13999) {
            level = 5;
        } else if (xpActual >= 14000 && xpActual <= 22999) {
            level = 6;
        } else if (xpActual >= 23000 && xpActual <= 33999) {
            level = 7;
        } else if (xpActual >= 34000 && xpActual <= 47999) {
            level = 8;
        } else if (xpActual >= 48000 && xpActual <= 63999) {
            level = 9;
        } else if (xpActual >= 64000 && xpActual <= 84999) {
            level = 10;
        } else if (xpActual >= 85000 && xpActual <= 99999) {
            level = 11;
        } else if (xpActual >= 100000 && xpActual <= 119999) {
            level = 12;
        } else if (xpActual >= 120000 && xpActual <= 139999) {
            level = 13;
        } else if (xpActual >= 140000 && xpActual <= 164999) {
            level = 14;
        } else if (xpActual >= 165000 && xpActual <= 194999) {
            level = 15;
        } else if (xpActual >= 195000 && xpActual <= 224999) {
            level = 16;
        } else if (xpActual >= 225000 && xpActual <= 264999) {
            level = 17;
        } else if (xpActual >= 265000 && xpActual <= 304999) {
            level = 18;
        } else if (xpActual >= 305000 && xpActual <= 354999) {
            level = 19;
        } else if (xpActual >= 355000) {
            level = 20;
        }
        nivel.setText("" + level);
        return level;
    }

    public String getClasseSelecionada() {
        return classeSelecionada;
    }
}
