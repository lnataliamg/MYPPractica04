public class ConstructorAutoHibrido extends BuilderAuto{

  public ConstructorAutoHibrido(){

  }

  public void construirLlantas(){
    this.auto.setLlantas(new Llanta(3));
  }
  public void construirMotor(){
    this.auto.setMotor(new Motor(1));
  }

  public void construirCarroceria(){
    this.auto.setCarroceria(new Carroceria(1));
  }
  public void construirBlindaje(){
    this.auto.setBlindaje(new Blindaje(2));
  }
  public void construirArmas(){
    this.auto.setArma(new Arma(3));

  }
}
