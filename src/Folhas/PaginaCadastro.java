package Folhas;

import BancoDeDados.Conexao;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.*;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaginaCadastro {

    private final GerenteClasses gerenteClasses;
    private GridBagConstraints gridBagConstraints;
    private Pattern pattern;
    private Matcher matcher;
    private Scanner scanner;

    private Painel painel;

    private String usuarioVerificacao;
    private String emailVerificacao;
    private String senhaVerificacao;
    private String confirmarSenhaVerificacao;

    /// TEXTOS FIXOS ///
    private TextoFixo usuário;
    private TextoFixo textoUsuario;
    private TextoFixo email;
    private TextoFixo textoEmail;
    private TextoFixo senha;
    private TextoFixo textoSenha;
    private TextoFixo confirmarSenha;
    private TextoFixo textoConfirmarSenha;

    /// CAIXAS DE TEXTO ///
    private CaixaDeTexto caixaUsuario;
    private CaixaDeTexto caixaEmail;
    private CaixaSenha caixaSenha;
    private CaixaSenha caixaConfirmarSenha;

    /// BOTÕES ///
    private Botao botaoCadastrar;
    private Botao botaoVoltar;
    
    private boolean aU = false;
    private boolean aE = false;
    private boolean aS = false;
    private boolean aCS = false;

    public PaginaCadastro(GerenteClasses gerenteClasses){
        this.gerenteClasses = gerenteClasses;
        this.scanner = new Scanner(System.in);
        this.gridBagConstraints = new GridBagConstraints();
        componentes();
        componentesDoPainel();
    }

    public void componentes(){
        painel = gerenteClasses.getChamarComponentes().chamarPainel(gerenteClasses.getPaginaLogin().getJanela(), 400, 500, new GridBagLayout());
    }

    public void componentesDoPainel(){
        usuario();
        email();
        senha();
        confirmarSenha();
        botaoCadastrar();
        botaoVoltar();
    }

    public void usuario(){
        /// CRIA TEXTO DO USUÁRIO ///
        gridBagConstraints.insets = new Insets(30,10,0, 20);
        gridBagConstraints.gridx = 0;
        usuário = gerenteClasses.getChamarComponentes().chamarTexto(painel, "Usuário", 120, 41);
        usuário.setFont(new Font("Bold", Font.BOLD, 30));
        painel.getjPanel().add(usuário.getJLabel(), gridBagConstraints);

        /// CRIA CAIXA DO USUÁRIO ///
        gridBagConstraints.gridx = 1;
        caixaUsuario = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(painel, 150, 30);
        caixaUsuario.getjTextField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        painel.getjPanel().add(caixaUsuario.getjTextField(), gridBagConstraints);

        /// CRIA MENSAGEM DO USUARIO ///
        gridBagConstraints.insets = new Insets(-20, 0 , -30, 0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        textoUsuario = gerenteClasses.getChamarComponentes().chamarTexto(painel, "", 300, 15);
        painel.getjPanel().add(textoUsuario.getJLabel(), gridBagConstraints);
    }

    public void email(){
        /// CRIA TEXTO DO EMAIL ///
        gridBagConstraints.insets = new Insets(30,10,0, 20);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        email = gerenteClasses.getChamarComponentes().chamarTexto(painel, "Email", 120, 41);
        email.setFont(new Font("Bold", Font.BOLD, 30));
        painel.getjPanel().add(email.getJLabel(), gridBagConstraints);

        /// CRIA CAIXA DO EMAIL ///
        gridBagConstraints.gridx = 1;
        caixaEmail = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(painel, 150, 30);
        caixaEmail.getjTextField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 15));
        painel.getjPanel().add(caixaEmail.getjTextField(), gridBagConstraints);

        /// CRIA MENSAGEM DO EMAIL ///
        gridBagConstraints.insets = new Insets(-20, 0 , -30, 0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        textoEmail = gerenteClasses.getChamarComponentes().chamarTexto(painel, "", 300, 15);
        painel.getjPanel().add(textoEmail.getJLabel(), gridBagConstraints);
    }

    public void senha(){
        /// CRIA TEXTO DA SENHA ///
        gridBagConstraints.insets = new Insets(30,10,0, 20);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        senha = gerenteClasses.getChamarComponentes().chamarTexto(painel, "Senha", 120, 41);
        senha.setFont(new Font("Bold", Font.BOLD, 30));
        painel.getjPanel().add(senha.getJLabel(), gridBagConstraints);

        /// CRIA CAIXA DA SENHA ///
        gridBagConstraints.gridx = 1;
        caixaSenha = gerenteClasses.getChamarComponentes().chamarCaixaSenha(painel, 150, 30);
        caixaSenha.getjPasswordField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        painel.getjPanel().add(caixaSenha.getjPasswordField(), gridBagConstraints);

        /// CRIA MENSAGEM DA SENHA ///
        gridBagConstraints.insets = new Insets(-20, 0 , -30, 0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        textoSenha = gerenteClasses.getChamarComponentes().chamarTexto(painel, "", 300, 15);
        painel.getjPanel().add(textoSenha.getJLabel(), gridBagConstraints);
    }

    public void confirmarSenha(){
        /// CRIA TEXTO DA CONFIRMAÇÃO DE SENHA ///
        gridBagConstraints.insets = new Insets(30,10,0, 20);
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        confirmarSenha = gerenteClasses.getChamarComponentes().chamarTexto(painel, "Senha", 120, 41);
        confirmarSenha.setFont(new Font("Bold", Font.BOLD, 30));
        painel.getjPanel().add(confirmarSenha.getJLabel(), gridBagConstraints);

        /// CRIA CAIXA DA CONFIRMAÇÃO DE SENHA ///
        gridBagConstraints.gridx = 1;
        caixaConfirmarSenha = gerenteClasses.getChamarComponentes().chamarCaixaSenha(painel, 150, 30);
        caixaConfirmarSenha.getjPasswordField().setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        painel.getjPanel().add(caixaConfirmarSenha.getjPasswordField(), gridBagConstraints);

        /// CRIA MENSAGEM DA CONFIRMAÇÃO DE SENHA ///
        gridBagConstraints.insets = new Insets(-20, 0 , -30, 0);
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        textoConfirmarSenha = gerenteClasses.getChamarComponentes().chamarTexto(painel, "", 300, 15);
        painel.getjPanel().add(textoConfirmarSenha.getJLabel(), gridBagConstraints);
    }

    public void botaoCadastrar(){
        /// CRIA BOTÃO CADASTRAR ///
        gridBagConstraints.insets = new Insets(30,-9,0, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        botaoCadastrar = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Cadastrar", 300, 40);
        botaoCadastrar.setCliques(action -> {
            verificacaoUsuario();
            verificacaoEmail();
            verificacaoSenha();
            verificacaoConfirmarSenha();
        });
        painel.getjPanel().add(botaoCadastrar.getBotao(), gridBagConstraints);
    }

    public void botaoVoltar(){
        /// CRIA BOTÃO VOLTAR ///
        gridBagConstraints.insets = new Insets(10,-9,0, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        botaoVoltar = gerenteClasses.getChamarComponentes().chamarBotao(painel, "Voltar", 300, 40);
        botaoVoltar.setCliques(action -> {
            painel.getjPanel().setVisible(false);
            gerenteClasses.getPaginaLogin().getPainel().getjPanel().setVisible(true);
        });
        painel.getjPanel().add(botaoVoltar.getBotao(), gridBagConstraints);
    }

    ///// VERIFICAÇÕES /////

    public void verificacaoUsuario(){
        usuarioVerificacao = caixaUsuario.getjTextField().getText().toLowerCase(Locale.ROOT);
        if (usuarioVerificacao.length() < 5 || usuarioVerificacao.length() > 15){
            textoUsuario.setText("O nome do usuário deve ter entre 5 à 15 caracteres");
            textoUsuario.getJLabel().setForeground(Color.red);
        } else {
            textoUsuario.setText("Usuário registrado com sucesso!");
            textoUsuario.getJLabel().setForeground(Color.green);
            aU = true;
        }
    }

    public void verificacaoEmail(){
        String verificacaoEmail = "\\w*(.)?(\\w*)?(\\d*)?(@)\\w*(.)\\w*(.)?(\\w*)?";
        emailVerificacao = caixaEmail.getjTextField().getText();
        pattern = Pattern.compile(verificacaoEmail);
        matcher = pattern.matcher(emailVerificacao);
        if (!matcher.find()){
            textoEmail.setText("Email inválido!");
            textoEmail.getJLabel().setForeground(Color.red);
        }else{
            textoEmail.setText("O email " + matcher.group() + " foi cadastrado!");
            textoEmail.getJLabel().setForeground(Color.green);
            aE = true;
        }
    }

    public void verificacaoSenha(){
        senhaVerificacao = caixaSenha.getjPasswordField().getText().replace(" ", "");
        if (senhaVerificacao.length() < 4 || senhaVerificacao.length() > 32){
            textoSenha.setText("A senha deve ter entre 4 à 32 caracteres");
            textoSenha.getJLabel().setForeground(Color.red);
        } else {
            textoSenha.setText("Senha registrada com sucesso!");
            textoSenha.getJLabel().setForeground(Color.green);
            aS = true;
        }
    }

    public void verificacaoConfirmarSenha(){
        confirmarSenhaVerificacao = caixaConfirmarSenha.getjPasswordField().getText().replace(" ", "");
        if (!Objects.equals(confirmarSenhaVerificacao, senhaVerificacao) || confirmarSenhaVerificacao.equals("") || !aS){
            textoConfirmarSenha.setText("Senha incompatível");
            textoConfirmarSenha.getJLabel().setForeground(Color.red);
        } else {
            textoConfirmarSenha.setText("Senha confirmada!");
            textoConfirmarSenha.getJLabel().setForeground(Color.green);
            aCS = true;
            cadastrarNoBanco();
        }
    }

    public void cadastrarNoBanco(){
        if (aU && aE && aS && aCS){
            try {
                Connection connection = Conexao.connection();
                String sql = "INSERT INTO dados_usuario(usuario, email, senha) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, usuarioVerificacao);
                preparedStatement.setString(2, emailVerificacao);
                preparedStatement.setString(3, confirmarSenhaVerificacao);
                preparedStatement.execute();
                preparedStatement.close();
                painel.getjPanel().setVisible(false);
                gerenteClasses.getPaginaLogin().getPainel().getjPanel().setVisible(true);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
