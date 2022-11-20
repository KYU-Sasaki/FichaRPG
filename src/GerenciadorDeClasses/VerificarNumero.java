package GerenciadorDeClasses;

public class VerificarNumero {
    public static boolean isInt (String text){
        try{
            Integer.parseInt(text);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
