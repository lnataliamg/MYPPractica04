import java.util.Scanner;
public class Main{

  public static void menu(){
    Scanner s = new Scanner(System.in);
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|            Bienvenido a la fabrica de autos Fabcar            |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("| En esta fabrica puedes crear varios tipos de coche, el que te |");
    System.out.println("| imagines. Tenemos un precio estandar de auto, y mientras mas  |");
    System.out.println("| cosas le agregues, te cobraremos mas. Puedes elegir:          |");
    System.out.println("| -tipo de llantas                                              |");
    System.out.println("| -tipo de motor                                                |");
    System.out.println("| -tipo de carroceria                                           |");
    System.out.println("| -tipo de blindaje                                             |");
    System.out.println("| -tipo de arma                                                 |");
    System.out.println("|                                                               |");
    System.out.println("| El precio del auto inicia en $800,000                         |");
    System.out.println("-----------------------------------------------------------------\n");

    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Como te llamas? Ingresa tu nombre                             |");
    System.out.println("-----------------------------------------------------------------");
    String nombreCliente = s.nextLine();

    System.out.println("-----------------------------------------------------------------");
    System.out.println("| Ingresa el dinero que vas a gastar                             |");
    System.out.println("-----------------------------------------------------------------");
    int dineroCliente = s.nextInt();
    System.out.println();

    Cliente cliente = new Cliente(nombreCliente, dineroCliente);

    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Quieres crear tu propio carro?                               |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|           1. Si                                               |");
    System.out.println("|           2. No                                               |");
    System.out.println("-----------------------------------------------------------------");

    int crearPropioCarro = s.nextInt();
    Constructor cons = new Constructor();
    if(crearPropioCarro == 1){
      System.out.println("Construye tu propio auto");
      BuilderAuto personalizado = new ConstructorAutoPersonalizado();

      cons.construir(personalizado);
      Auto autoPersonalizado = personalizado.getAuto();
      System.out.println(autoPersonalizado.toString());
      cliente.cobrarAuto(autoPersonalizado);


    }else{
      System.out.println("-----------------------------------------------------------------");
      System.out.println("| Tenemos tres opciones de carro para que elijas                |");
      System.out.println("-----------------------------------------------------------------");
      System.out.println("|           1. Deportivo                                        |");
      System.out.println("|           2. Militar                                          |");
      System.out.println("|           3. El de ambos mundos Hibrido                       |");
      System.out.println("-----------------------------------------------------------------");

      int opcionAuto = s.nextInt();

      switch (opcionAuto) {
        case 1:
        System.out.println("Elegiste el coche                -------Deportivo-------\n");
        BuilderAuto deportivo = new ConstructorAutoDeportivo();

        cons.construir(deportivo);
        Auto autoDeportivo = deportivo.getAuto();
        System.out.println(autoDeportivo.toString());
        cliente.cobrarAuto(autoDeportivo);

          break;
        case 2:
          System.out.println("Elegiste el coche                -------Militar-------\n");
          BuilderAuto militar = new ConstructorAutoGuerra();

          cons.construir(militar);
          Auto autoMilitar = militar.getAuto();
          System.out.println(autoMilitar.toString());
          cliente.cobrarAuto(autoMilitar);
          break;

        case 3:
          System.out.println("Elegiste el coche                -------Hibrido-------\n");
          BuilderAuto hibrido = new ConstructorAutoHibrido();

          cons.construir(hibrido);
          Auto autoHibrido = hibrido.getAuto();
          System.out.println(autoHibrido.toString());
          cliente.cobrarAuto(autoHibrido);

          break;


      }
    }


  }

  public static void main(String[] args) {
    menu();
  }
}
