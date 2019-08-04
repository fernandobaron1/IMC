
package imc;

import java.util.Scanner;


public class IMC {

    
    public static void main(String[] args) {
        
         Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o peso");
        double peso = leia.nextDouble();
        
        System.out.println ("Informe a altura");
        double altura = leia.nextDouble();
        
        double resultado = peso/(altura * altura);
        System.out.println(resultado);
    }
    
}
