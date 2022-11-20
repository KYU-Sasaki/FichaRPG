package Folhas;

import BancoDeDados.Conexao;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.*;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class PaginaLogin {

    /// OUTRAS CLASSES ///
    private final GerenteClasses gerenteClasses;
    private GridBagConstraints gridBagConstraints;
    private PaginaCadastro paginaCadastro;
    private PaginaMenu paginaMenu;

    /// PÁGINAS ///
    private Janela janela;
    private Painel painel;

    /// TEXTOS FIXOS ///
    private TextoFixo usuario;
    private TextoFixo senha;
    private TextoFixo cadastro;

    /// CAIXAS DE TEXTO ///
    private CaixaDeTexto caixaUsuario;
    private CaixaSenha caixaSenha;

    /// BOTÕES ///
    private Botao botaoEntrar;
    private Botao botaoCadastro;

    /// MySQL ///
    private String sql;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    /// FUNÇÕES ///
    public PaginaLogin(GerenteClasses gerenteClasses){
        this.gerenteClasses = gerenteClasses;
        this.gridBagConstraints = new GridBagConstraints();
        this.paginaCadastro = gerenteClasses.getPaginaCadastro();

        /// CHAMA JANELA///
        janela();
    }

    public void janela(){
        /// CRIA A JANELA ///
        janela = gerenteClasses.getChamarComponentes().chamarJanela("Login", new GridBagLayout());

        /// CHAMA OS COMPONENTES ///
        componentes();

        /// DEIXA JANELA VISÍVEL ///
        janela.setVisible();
    }

    public void componentes(){
        /// CRIA PAINEL ///
        painel = gerenteClasses.getChamarComponentes().chamarPainel(janela, 400, 400, new GridBagLayout());

        /// CHAMA COMPONENTES DO PAINEL ///
        componentesDoPainel();
    }

    public void componentesDoPainel(){
        usuario();
        senha();
        botaoEntrar();
        cadastro();
    }

    public void usuario(){
        /// CRIA TEXTO DO USUÁRIO ///
        gridBagConstraints.insets = new Insets(30,10,0, 20);
        gridBagConstraints.gridx = 0;
        usuario = gerenteClasses.getChamarComponentes().chamarTexto(painel, "Usuário", 120, 41);
        usuario.setFont(new Font("Bold", Font.BOLD, 30));
        painel.getjPanel().add(usuario.getJLabel(), gridBagConstraints);

        /// CRIA CAIXA DO USUÁRIO ///
        gridBagConstraints.gridx = 1;
        caixaUsuario = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(painel, 150, 30);
        caixaUsuario.getjTextField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        caixaUsuario.getjTextField().setText("KYUSasaki");
        painel.getjPanel().add(caixaUsuario.getjTextField(), gridBagConstraints);
    }

    public void senha(){
        /// CRIA TEXTO DA SENHA ///
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        senha = gerenteClasses.getChamarComponentes().chamarTexto(painel, "Senha", 120, 41);
        senha.setFont(new Font("Bold", Font.BOLD, 30));
        painel.getjPanel().add(senha.getJLabel(), gridBagConstraints);

        /// CRIA CAIXA DA SENHA ///
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        caixaSenha = gerenteClasses.getChamarComponentes().chamarCaixaSenha(painel, 150, 30);
        caixaSenha.getjPasswordField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        caixaSenha.getjPasswordField().setText("123");
        painel.getjPanel().add(caixaSenha.getjPasswordField(), gridBagConstraints);
    }

    public void botaoEntrar(){
        /// CRIA BOTÃO ENTRAR ///
        gridBagConstraints.insets = new Insets(30,-9,0, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridy = 2;
        botaoEntrar = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Entrar", 300, 40);
        botaoEntrar.setCliques(action -> {
            try {
                Connection connection = Conexao.connection();
                sql = "select *from dados_usuario where usuario=? and senha=?";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, caixaUsuario.getjTextField().getText().toLowerCase(Locale.ROOT));
                stmt.setString(2, new String(caixaSenha.getjPasswordField().getPassword()));
                resultSet = stmt.executeQuery();

                if (resultSet.next()){
                    painel.getjPanel().setVisible(false);
                    paginaMenu = new PaginaMenu(gerenteClasses);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
                stmt.close();

            } catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        });
        painel.getjPanel().add(botaoEntrar.getBotao(), gridBagConstraints);
    }

    public void cadastro(){
        /// CRIA TEXTO CADASTRO ///
        gridBagConstraints.insets = new Insets(10,-90,0, 0);
        gridBagConstraints.gridy = 3;
        cadastro = gerenteClasses.getChamarComponentes().chamarTexto(
                painel, "Caso ainda não possua uma conta,", 200, 25
        );
        painel.getjPanel().add(cadastro.getJLabel(), gridBagConstraints);

        /// CRIA BOTÃO CADASTRO ///
        gridBagConstraints.insets = new Insets(10,30,0, 0);
        gridBagConstraints.gridx = 1;
        botaoCadastro = gerenteClasses.getChamarComponentes().chamarBotao(painel, "", 70, 15);
        botaoCadastro.getBotao().setHorizontalAlignment(SwingConstants.LEFT);
        botaoCadastro.setCliques(action -> {
            painel.getjPanel().setVisible(false);
            paginaCadastro = new PaginaCadastro(gerenteClasses);
        });
        painel.getjPanel().add(botaoCadastro.getBotao(), gridBagConstraints);
    }

    public Janela getJanela() {
        return janela;
    }

    public Painel getPainel() {
        return painel;
    }

    public PaginaMenu  getPaginaMenu() {
        return paginaMenu;
    }

}
