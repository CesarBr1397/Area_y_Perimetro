package logica;
import java.util.Scanner;

public class AreaYPerimetro {

    public static void main(String[] args) {
        String figura;
        String operacion;
        System.out.println("Escoja una de las siguientes figuras:"
                + " cuadrado,"
                + " rectangulo,"
                + " triangulo o"
                + " circulo.");
        Scanner teclado = new Scanner (System.in);
        figura = teclado.nextLine();
        double lado1=0, lado2=0, lado3=0, exponente=2;
        
        if ("cuadrado".equals(figura)){
            System.out.println("Ingrese el valor del lado del cuadrado: ");
            lado1 = teclado.nextDouble();
            
            teclado.nextLine();
            System.out.println("¿Qué desea calcular, area o perimetro?: ");
            operacion = teclado.nextLine();

            if ("area".equals(operacion)){
                System.out.println("El area del cuadrado es: " + (lado1  * lado1));
                }
            else{
            if("perimetro".equals(operacion)){
                System.out.println("El perimetro del cuadrado es " + (lado1 * 4));
                }
            }
        }
        else{
            if ("rectangulo".equals(figura)){
                System.out.println("Ingrese el valor de la base del rectangulo: ");
                lado1 = teclado.nextDouble();
                System.out.println("Ingrese el valor de la altura del rectangulo: ");
                lado2 = teclado.nextDouble();
                
                teclado.nextLine();
                System.out.println("¿Qué desea calcular, area o perimetro?: ");
                operacion = teclado.nextLine();
                if ("area".equals(operacion)){
                System.out.println("El area del rectangulo es: " + (lado1  * lado2));
                }
            else{
            if("perimetro".equals(operacion)){
                System.out.println("El perimetro del rectangulo es " + (lado1 + lado1 + lado2 + lado2));
                }
            }
        }
            else{
                if ("triangulo".equals(figura)){
                    System.out.println("¿Qué desea calcular, area o perimetro?: ");
                    operacion = teclado.nextLine();
                    if ("area".equals(operacion)){
                        System.out.println("Ingrese el valor de la base del triangulo: ");
                        lado1 = teclado.nextDouble();
                        System.out.println("Ingrese el valor de la altura del triangulo: ");
                        lado2 = teclado.nextDouble();
                        System.out.println("El area del triangulo es: " + (lado1 * lado2 / 2) );
                }
                    else{
                        if ("perimetro".equals(operacion)){
                            System.out.println("Ingrese el valor del primer lado del triangulo: ");
                            lado1 = teclado.nextDouble();
                            System.out.println("Ingrese el valor del segundo lado del triangulo: ");
                            lado2 = teclado.nextDouble();
                            System.out.println("Ingrese el valor del tercer lado del triangulo: ");
                            lado3 = teclado.nextDouble();
                            System.out.println("El perimetro del triangulo es: " + (lado1 + lado2 + lado3));
                }
            }
        }
                else{
                if("circulo".equals(figura)){
                    System.out.println("Ingrese el valor del radio del circulo: ");
                    lado1 = teclado.nextDouble();
                    
                    teclado.nextLine();
                    System.out.println("¿Qué desea calcular, area o perimetro?: ");
                    operacion = teclado.nextLine();
                    if ("area".equals(operacion)){
                    System.out.println("El area del circulo es: " + (Math.PI * Math.pow(lado1, exponente)));
                            }
                    else{
                        if("perimetro".equals(operacion)){
                            System.out.println("El perimetro del circulo es: " + (Math.PI * (lado1 * 2)));
                            }
                        }
                }
                else{
                    System.out.println("Figura invalida");
                    }
                }
            }
        }
    }
}
