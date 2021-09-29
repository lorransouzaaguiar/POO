package utils;

public class VerificaString {
    
    public static boolean ehNumero(String valor) {
        if(!valor.isEmpty()) {
            try{
                Double.parseDouble(valor.replace(",", "."));
                return true;
            }catch(NumberFormatException error){
                return false;
            }
        }else return false;
    }
}
