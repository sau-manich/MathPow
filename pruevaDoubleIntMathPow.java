package IIsemestre2014;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class pruevaDoubleIntMathPow{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));
double digitos ;
int y;
        System.out.println("ingrese digitos");
        digitos=Double.parseDouble(dato.readLine());
            digitos=Math.pow(2,digitos);
            y=digitos;
            System.out.println(y);
        
}
}

