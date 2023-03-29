import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*
        String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        //Pasamos el String a int
        try{
            int codigo=Integer.parseInt(texto);

            //Pasamos el codigo a caracter
            char caracter=(char)codigo;

            System.out.println(caracter);
        }catch (Exception ex){
            //System.out.println(ex.getMessage());
            System.out.println("ERROR!. Solo acepta número, no texto.");
        }
        * */
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese un código de la tabla ASCII: ");
        //char caracter =sc.next().charAt(0);
        String texto = sc.next();
        //int codigo =(int) caracter;
       // System.out.println(codigo);
        int codigo = Integer.parseInt(texto);
        char caracter = (char) codigo;
        System.out.println(caracter);


    }
}