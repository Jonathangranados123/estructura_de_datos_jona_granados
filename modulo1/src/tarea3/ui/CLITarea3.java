package tarea3.ui;
import java.util.Scanner;
import tarea3.process.ConvertidorDeExpresiones;

public class CLITarea3 {

        /**
         * El método principal de la aplicación que interactúa con el usuario para realizar la conversión
         * y evaluación de expresiones infijas.
         */
        public static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introducir una expresión infija: ");
            String infixExp = scanner.nextLine();
            String postfixExp = ConvertidorDeExpresiones.infijaAPosfija(infixExp);
            System.out.println("Expresión postfija: " + postfixExp);
            System.out.println("Evaluación : " + ConvertidorDeExpresiones.evalua(postfixExp));
            scanner.close();
        }
    }

