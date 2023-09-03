package tarea3.process;
import utils.*;
//import java.util.Stack;

public class ConvertidorDeExpresiones {


    /**
     * Esta clase proporciona métodos para convertir una expresión infija en una expresión postfija
     * y para evaluar una expresión postfija.
     */

        /**
         * Determina la precedencia de un operador.
         *
         * @param ch El operador para el cual se desea determinar la precedencia.
         * @return Un entero que representa la precedencia del operador.
         */
        static int operandos(char ch) {
            switch (ch) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '^':
                    return 3;
            }
            return -1;
        }
        /**
         * Convierte una expresión infija en una expresión postfija.
         *
         * @param exp La expresión infija a convertir.
         * @return La expresión postfija resultante como una cadena de caracteres.
         */
        public static String infijaAPosfija(String exp) {
            String result = new String("");
            var stack = new Stack<Character>();
            for (char c : exp.toCharArray()) {
                if (Character.isLetterOrDigit(c))
                    result += c;
                else if (c == '(')
                    stack.push(c);
                else if (c == ')') {
                    while (!stack.isEmpty()
                            && stack.peek().get() != '(') {
                        result += stack.pop().get();
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty()
                            && operandos(c) <= operandos(stack.peek().get())) {
                        result += stack.pop().get();
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()) {
                if (stack.peek().get() == '(')
                    return "Expresión no válida";
                result += stack.pop().get();
            }
            return result;
        }
        /**
         * Evalúa una expresión postfija y devuelve el resultado.
         *
         * @param exp La expresión postfija a evaluar.
         * @return El resultado de la evaluación de la expresión como un entero.
         */
        public static int evalua(String exp) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < exp.length(); i++) {
                char c = exp.charAt(i);
                if (Character.isDigit(c))
                    stack.push(c - '0');
                else {
                    int val1 = stack.pop().get();
                    int val2 = stack.pop().get();
                    switch (c) {
                        case '+':
                            stack.push(val2 + val1);
                            break;
                        case '-':
                            stack.push(val2 - val1);
                            break;
                        case '/':
                            stack.push(val2 / val1);
                            break;
                        case '*':
                            stack.push(val2 * val1);
                            break;
                    }
                }
            }
            return stack.pop().get();
        }
    }


