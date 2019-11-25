public class ConstructorAutoDeportivo extends BuilderAuto{

  public ConstructorAutoDeportivo(){

  }

  public void construirLlantas(){
    this.auto.setLlantas(new Llanta(2));
  }
  public void construirMotor(){
    this.auto.setMotor(new Motor(2));
  }

  public void construirCarroceria(){
    this.auto.setCarroceria(new Carroceria(2));
  }
  public void construirBlindaje(){
    this.auto.setBlindaje(new Blindaje(1));
  }
  public void construirArmas(){
    this.auto.setArma(new Arma(0));

  }
}
