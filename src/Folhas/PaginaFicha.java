package Folhas;

import Automatizacao.TransversaoPericias;
import CriacaoDaFicha.Antecedentes.SemAntecedente;
import CriacaoDaFicha.ApoiadorDaClasse.Antecedente;
import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import CriacaoDaFicha.Classes.SemClasse;
import GerenciadorDeClasses.Gerente;
import GerenciadorDeClasses.GerenteClasses;
import Graficos.PainelAtaquesEIdiomas.ComponentesAtaquesEMagias;
import Graficos.PainelAtaquesEIdiomas.ComponentesIdiomasEOutrasProficiencias;
import Graficos.PainelAba.ComponentesAba;
import Graficos.PainelCabecalho.ComponentesCabecalho;
import Graficos.PainelChat.ComponentesChat;
import Graficos.PainelValores.ComponentesValoresDeHabilidade;
import Graficos.PericiasEResistencia.ComponentesPericias;
import Graficos.PericiasEResistencia.ComponentesTesteDeResistencia;
import Graficos.Personalidade.ComponentesCaracteristicasETalentos;
import Graficos.Personalidade.ComponentesPersonalidade;
import Graficos.Status.ComponentesEquipamentos;
import Graficos.Status.ComponentesStatus;
import Utilitarios.CapturaDeTela;
import Utilitarios.Componentes.Janela;
import Utilitarios.Componentes.Painel;

import java.awt.*;

public class PaginaFicha {

    /// OUTRAS CLASSES ///
    private final GerenteClasses gerenteClasses;
    private GridBagConstraints gridBagConstraints;
    private Gerente gerente;
    private TransversaoPericias transversaoPericias;
    private Classe classe;
    private Antecedente antecedente;

    /// PÁGINAS ///
    private Janela janela;
    private Painel aba;
    private Painel cabecalho;
    private Painel chat;
    private Painel valoresDeHabilidade;
    private Painel pericias;
    private Painel idiomas;
    private Painel status;
    private Painel personalidade;
    private Painel trava;

    /// COMPONENTES DAS PÁGINAS ///
    private ComponentesAba componentesAba;
    private ComponentesCabecalho componentesCabecalho;
    private ComponentesChat componentesChat;
    private ComponentesValoresDeHabilidade componentesValoresDeHabilidade;
    private ComponentesPericias componentePericias;
    private ComponentesTesteDeResistencia componentesTesteDeResistencia;
    private ComponentesAtaquesEMagias componentesAtaquesEMagias;
    private ComponentesIdiomasEOutrasProficiencias componentesIdiomasEOutrasProficiencias;
    private ComponentesStatus componentesStatus;
    private ComponentesEquipamentos componentesEquipamentos;
    private ComponentesPersonalidade componentesPersonalidade;
    private ComponentesCaracteristicasETalentos componentesCaracteristicasETalentos;

    /// TOOLKIT & DIMENSION ///
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension dimension = tk.getScreenSize();

    public PaginaFicha(GerenteClasses gerenteClasses){
        this.gerenteClasses = gerenteClasses;
        this.gridBagConstraints = new GridBagConstraints();
        this.gerente = new Gerente(gerenteClasses, this);
        this.transversaoPericias = new TransversaoPericias(gerenteClasses, this);
        this.classe = new SemClasse(gerenteClasses, this);
        this.antecedente = new SemAntecedente(gerenteClasses, this);
        componentes();
        componentesDoPainel();
    }

    public void componentes(){

        int divisaoPaineis = dimension.width - dimension.width/3;
        int pixelPorTela = gerenteClasses.getAjusteTela().pixelPorTela();

        janela = gerenteClasses.getPaginaLogin().getJanela();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        aba = gerenteClasses.getChamarComponentes().chamarPainel(janela, dimension.width, 51, new GridBagLayout());
//         aba.getjPanel().setBackground(Color.MAGENTA);
        janela.getjFrame().add(aba.getjPanel(), gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        cabecalho = gerenteClasses.getChamarComponentes().chamarPainel(janela, divisaoPaineis + pixelPorTela, 101, new GridBagLayout());
//        cabecalho.getjPanel().setBackground(Color.pink);
        janela.getjFrame().add(cabecalho.getjPanel(), gridBagConstraints);

        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 2;
        chat = gerenteClasses.getChamarComponentes().chamarPainel(janela, dimension.width/3 - pixelPorTela, dimension.height - 51, new GridBagLayout());
        chat.getjPanel().setBackground(Color.blue);
        janela.getjFrame().add(chat.getjPanel(), gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 1;
        valoresDeHabilidade = gerenteClasses.getChamarComponentes().chamarPainel(janela, ((divisaoPaineis + pixelPorTela) * 20/100)/2, dimension.height - 152, new GridBagLayout());
//        valoresDeHabilidade.getjPanel().setBackground(Color.green);
        janela.getjFrame().add(valoresDeHabilidade.getjPanel(), gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        pericias = gerenteClasses.getChamarComponentes().chamarPainel(janela, (divisaoPaineis + pixelPorTela) * 20/100, dimension.height - 152, new GridBagLayout());
//        pericias.getjPanel().setBackground(Color.black);
        janela.getjFrame().add(pericias.getjPanel(), gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        idiomas = gerenteClasses.getChamarComponentes().chamarPainel(janela, (divisaoPaineis + pixelPorTela) * 20/100, dimension.height - 152, new GridBagLayout());
//        idiomas.getjPanel().setBackground(Color.gray);
        janela.getjFrame().add(idiomas.getjPanel(), gridBagConstraints);

        int width = ((divisaoPaineis + pixelPorTela) * 20 / 100) + (((divisaoPaineis + pixelPorTela) * 20 / 100) / 2)/2;

        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        status = gerenteClasses.getChamarComponentes().chamarPainel(janela, width, dimension.height - 152, new GridBagLayout());
//        status.getjPanel().setBackground(Color.yellow);
        janela.getjFrame().add(status.getjPanel(), gridBagConstraints);

        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        personalidade = gerenteClasses.getChamarComponentes().chamarPainel(janela, width, dimension.height - 152, new GridBagLayout());
//        personalidade.getjPanel().setBackground(Color.cyan);
        janela.getjFrame().add(personalidade.getjPanel(), gridBagConstraints);

        trava = gerenteClasses.getChamarComponentes().chamarPainel(janela, dimension.width, dimension.height, new GridBagLayout());
        trava.getjPanel().setBackground(Color.blue);
        trava.getjPanel().setVisible(false);
    }

    public void retirarComponentes(){
        aba.getjPanel().setVisible(false);
        cabecalho.getjPanel().setVisible(false);
        chat.getjPanel().setVisible(false);
        valoresDeHabilidade.getjPanel().setVisible(false);
        pericias.getjPanel().setVisible(false);
        idiomas.getjPanel().setVisible(false);
        status.getjPanel().setVisible(false);
        personalidade.getjPanel().setVisible(false);
    }

    public void colocarComponentes(){
        aba.getjPanel().setVisible(true);
        cabecalho.getjPanel().setVisible(true);
        chat.getjPanel().setVisible(true);
        valoresDeHabilidade.getjPanel().setVisible(true);
        pericias.getjPanel().setVisible(true);
        idiomas.getjPanel().setVisible(true);
        status.getjPanel().setVisible(true);
        personalidade.getjPanel().setVisible(true);
    }

    public void componentesDoPainel(){
        componentesChat = new ComponentesChat(gerenteClasses, this);
        componentesAba = new ComponentesAba(gerenteClasses, this);
        componentesCabecalho = new ComponentesCabecalho(gerenteClasses, this);
        componentesValoresDeHabilidade = new ComponentesValoresDeHabilidade(gerenteClasses, this);
        componentePericias = new ComponentesPericias(gerenteClasses, this);
        componentesTesteDeResistencia = new ComponentesTesteDeResistencia(gerenteClasses, this);
        componentesAtaquesEMagias = new ComponentesAtaquesEMagias(gerenteClasses, this);
        componentesIdiomasEOutrasProficiencias = new ComponentesIdiomasEOutrasProficiencias(gerenteClasses, this);
        componentesStatus = new ComponentesStatus(gerenteClasses, this);
        componentesEquipamentos = new ComponentesEquipamentos(gerenteClasses, this);
        componentesPersonalidade = new ComponentesPersonalidade(gerenteClasses, this);
        componentesCaracteristicasETalentos = new ComponentesCaracteristicasETalentos(gerenteClasses, this);
    }

    /// GETS & SETS ///
    
    public Painel getAba() {
        return aba;
    }

    public Painel getCabecalho() {
        return cabecalho;
    }

    public Painel getChat() {
        return chat;
    }

    public Painel getValoresDeHabilidade() {
        return valoresDeHabilidade;
    }

    public Painel getPericias() {
        return pericias;
    }

    public Painel getIdiomas() {
        return idiomas;
    }

    public Painel getStatus() {
        return status;
    }

    public Painel getPersonalidade() {
        return personalidade;
    }

    public ComponentesAba getComponentesAba() {
        return componentesAba;
    }

    public ComponentesCabecalho getComponentesCabecalho() {
        return componentesCabecalho;
    }

    public ComponentesChat getComponentesChat() {
        return componentesChat;
    }

    public ComponentesValoresDeHabilidade getComponentesValoresDeHabilidade() {
        return componentesValoresDeHabilidade;
    }

    public ComponentesPericias getComponentesPericias() {
        return componentePericias;
    }

    public ComponentesTesteDeResistencia getComponentesTesteDeResistencia() {
        return componentesTesteDeResistencia;
    }

    public ComponentesAtaquesEMagias getComponentesAtaquesEMagias() {
        return componentesAtaquesEMagias;
    }

    public ComponentesIdiomasEOutrasProficiencias getComponentesIdiomasEOutrasProficiencias() {
        return componentesIdiomasEOutrasProficiencias;
    }

    public ComponentesStatus getComponentesStatus() {
        return componentesStatus;
    }

    public ComponentesEquipamentos getComponentesEquipamentos() {
        return componentesEquipamentos;
    }

    public ComponentesPersonalidade getComponentesPersonalidade() {
        return componentesPersonalidade;
    }

    public ComponentesCaracteristicasETalentos getComponentesCaracteristicasETalentos() {
        return componentesCaracteristicasETalentos;
    }

    public Painel getTrava() {
        return trava;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public TransversaoPericias getTransversaoPericias() {
        return transversaoPericias;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Antecedente getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(Antecedente antecedente) {
        this.antecedente = antecedente;
    }

    public Janela getJanela() {
        return janela;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
