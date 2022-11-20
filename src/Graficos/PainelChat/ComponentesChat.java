package Graficos.PainelChat;

import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;
import Utilitarios.Componentes.*;

import javax.swing.*;
import java.awt.*;

public class ComponentesChat {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;
    private GridBagConstraints gridBagConstraints;
    private Painel chat;

    private CaixaDeTexto caixaDeTexto;

    public ComponentesChat(GerenteClasses gerenteClasses, PaginaFicha paginaFicha){
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
        this.gridBagConstraints = new GridBagConstraints();
        this.chat = paginaFicha.getChat();

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;

        chat();
    }

    public void chat(){
        int width = chat.getjPanel().getPreferredSize().width;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        caixaDeTexto = gerenteClasses.getChamarComponentes().chamarCaixaDeTexto(chat, width - 20, 60);
        chat.getjPanel().add(caixaDeTexto.getjTextField(), gridBagConstraints);
    }
}
