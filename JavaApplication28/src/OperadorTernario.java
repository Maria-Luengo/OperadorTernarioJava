
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maria333
 */
public class OperadorTernario {

    public static void main(String[] args) {
        int edad = 0;
        String resultado = "";
        Scanner sn = new Scanner(System.in);
        System.out.print("Introduce tu edad:\t");
        edad = sn.nextInt();
        resultado = (edad > 18) ? "Eres mayor de edad" : "Eres menos de edad";
        System.out.println(resultado);
    }
}
