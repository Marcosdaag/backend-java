//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
      String message = "Hola😎 \"Entre comillas\" ";
      System.out.println(message); //Agrega salto de linea
      System.out.print(message); //Sin salto de linea

      int numeroUno = 1;
      int numeroDos = 20;

    int stock = 150;
    int requerimiento = 200;

      if(numeroUno < numeroDos){
        System.out.println("El primer numero es menor");
      }else{
        System.out.println("El primer numero es mayor");
      }

    if(stock < requerimiento){
      System.out.println("No hay suficiente stock");
    }else{
      System.out.println("Stock disponible");
    }

    }
  }