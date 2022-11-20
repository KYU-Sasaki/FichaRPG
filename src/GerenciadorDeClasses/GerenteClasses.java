package GerenciadorDeClasses;

import Automatizacao.TransversaoPericias;
import BancoDeDados.Conexao;
import CriacaoDaFicha.ApoiadorDaClasse.Classe;
import CriacaoDaFicha.Classes.SemClasse;
import Folhas.PaginaCadastro;
import Folhas.PaginaFicha;
import Folhas.PaginaLogin;
import Folhas.PaginaMenu;
import Graficos.PainelCabecalho.ComponentesCabecalho;
import Utilitarios.AjusteTela;
import Utilitarios.ChamarComponentes;

import java.sql.SQLException;

public class GerenteClasses {
    private ChamarComponentes chamarComponentes;
    private PaginaLogin paginaLogin;
    private PaginaCadastro paginaCadastro;
    private Conexao conexao;
    private AjusteTela ajusteTela;
    private PaginaMenu paginaMenu;
    private PaginaFicha paginaFicha;

    public GerenteClasses() throws SQLException {
        this.chamarComponentes = new ChamarComponentes(this);
        this.paginaLogin = new PaginaLogin(this);
        this.ajusteTela = new AjusteTela(this);
        this.conexao = new Conexao(this);
    }

    public ChamarComponentes getChamarComponentes() {
        return chamarComponentes;
    }

    public static void main(String[] args) throws SQLException {
        GerenteClasses gerenteClasses = new GerenteClasses();
    }

    public PaginaLogin getPaginaLogin() {
        return paginaLogin;
    }

    public PaginaCadastro getPaginaCadastro() {
        return paginaCadastro;
    }

    public Conexao getConexao() {
        return conexao;
    }

    public AjusteTela getAjusteTela() {
        return ajusteTela;
    }

    public PaginaMenu getPaginaMenu() {
        return paginaMenu;
    }
}
