package Utilitarios;

import GerenciadorDeClasses.GerenteClasses;

import java.awt.*;

public class AjusteTela {

    private final GerenteClasses gerenteClasses;

    /// TOOLKIT & DIMENSION ///
    private Toolkit tk = Toolkit.getDefaultToolkit();
    private Dimension dimension = tk.getScreenSize();


    public AjusteTela(GerenteClasses gerenteClasses){
        this.gerenteClasses = gerenteClasses;
        pixelPorTela();
    }

    public int pixelPorTela(){
        int pixelPorTela = 0;

        switch(dimension.width){
            case 1920:
                pixelPorTela = 300;
                break;

            case 1360:
                pixelPorTela = 200;
                break;
        }

        return pixelPorTela;
    }

    public int componentesCabecalho(){
        int pixelPorComponentes = 0;

        switch(dimension.width){
            case 1920:
                pixelPorComponentes = 160;
                break;
        }
        return pixelPorComponentes;
    }
}
