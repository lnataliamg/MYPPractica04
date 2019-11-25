import java.util.Scanner;
public class ConstructorAutoPersonalizado extends BuilderAuto{
/*  private int tipoLlantas;
  private int tipoMotor;
  private int tipoCarroceria;
  private int tipoBlindaje;
  private int tipoArma;*/
  Scanner s = new Scanner(System.in);

  public ConstructorAutoPersonalizado(){
  }

  public void construirLlantas(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Que tipo de llantas quieres?                                 |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|           1. Simples                           $4,000         |");
    System.out.println("|           2. Deportivas                        $8,000         |");
    System.out.println("|               Aumentan velocidad                              |");
    System.out.println("|           3. Off-Road                          $8,000         |");
    System.out.println("|               Aumenta defensa y ataque                        |");
    System.out.println("|           4. Oruga de Tanque                  $15,000         |");
    System.out.println("|               Disminuye velocidad, aumenta defensa y ataque   |");
    System.out.println("-----------------------------------------------------------------");
    int tipoLlantas = s.nextInt();
    this.auto.setLlantas(new Llanta(tipoLlantas));
  }
  public void construirMotor(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Que tipo de motor quieres?                                   |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|           1. Simple                           $10,000         |");
    System.out.println("|           2. Deportivo                       $30,000         |");
    System.out.println("|               Aumenta velocidad                              |");
    System.out.println("|           3. Diesel                           $40,000         |");
    System.out.println("-----------------------------------------------------------------");
    int tipoMotor = s.nextInt();


    this.auto.setMotor(new Motor(tipoMotor));
  }

  public void construirCarroceria(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Que tipo de carroceria quieres?                              |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|           1. Casual                           $10,000         |");
    System.out.println("|           2. Deportiva                        $50,000         |");
    System.out.println("|               Aumentan velocidad, disminuye defensa           |");
    System.out.println("|           3. Camion                           $75,000         |");
    System.out.println("|               Disminuye velocidad, aumenta defensa y ataque   |");
    System.out.println("-----------------------------------------------------------------");
    int tipoCarroceria = s.nextInt();

    this.auto.setCarroceria(new Carroceria(tipoCarroceria));
  }
  public void construirBlindaje(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Que tipo de blindaje quieres?                                |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|           1. Simple                           $15,000         |");
    System.out.println("|           2. Reforzado                        $50,000         |");
    System.out.println("|               Disminuye velocidad, aumenta defensa y ataque   |");
    System.out.println("|           3. Camion                           $100,000        |");
    System.out.println("|               Disminuye velocidad, aumenta defensa y ataque   |");
    System.out.println("-----------------------------------------------------------------");
    int tipoBlindaje = s.nextInt();

    this.auto.setBlindaje(new Blindaje(tipoBlindaje));
  }
  public void construirArmas(){
    System.out.println("-----------------------------------------------------------------");
    System.out.println("| ¿Que tipo de armas quieres?                                   |");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("|           1. Arpones                            $8,000        |");
    System.out.println("|           2. Lanzallamas                       $35,000        |");
    System.out.println("|           3. Lanzas                             $5,000        |");
    System.out.println("|           4. Sierra                            $20,000        |");
    System.out.println("|           5. Metralleta                        $60,000        |");
    System.out.println("|        Todas las armas aumentan ataque y defensa              |");
    System.out.println("-----------------------------------------------------------------");
    int tipoArma = s.nextInt();

    this.auto.setArma(new Arma(tipoArma));

  }
}
