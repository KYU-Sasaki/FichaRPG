package Utilitarios;
import Folhas.PaginaFicha;
import GerenciadorDeClasses.GerenteClasses;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CapturaDeTela {

    private final GerenteClasses gerenteClasses;
    private final PaginaFicha paginaFicha;

    public CapturaDeTela(GerenteClasses gerenteClasses, PaginaFicha paginaFicha) {
        this.gerenteClasses = gerenteClasses;
        this.paginaFicha = paginaFicha;
    }

    public void print(){
        try {
            int width = paginaFicha.getDimension().width;
            int height = paginaFicha.getDimension().height;
            Robot robot = new Robot();
            Rectangle image = new Rectangle((int) width, (int)height);
            BufferedImage bi=robot.createScreenCapture(image);
            ImageIO.write(bi, "jpg", new File("C:\\Users\\gu_ss\\Desktop\\Teste\\image.jpg"));

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
