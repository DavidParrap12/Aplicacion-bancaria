import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        //Adiccionamos los datos del cliente
        String nombre = "Homero";
        String tipoDeCuenta = "Corriente";
        double saldo = 2000.00;
        int opcion = 0;

        System.out.println("*********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo es: " + saldo + "$");
        System.out.println("*********************************************");

        //menu de opciones
        String menu = """
                *** Escriba el numero de la opcion deseada***
                1 - Consultar saldo
                2 - retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if(saldo < valorARetirar){
                        System.out.println("Saldo insuficiente");}
                        else{
                            saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es :" + saldo + "$");
                        }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
            }
        }
    }
}