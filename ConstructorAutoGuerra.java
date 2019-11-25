public class ConstructorAutoGuerra extends BuilderAuto{

  public ConstructorAutoGuerra(){

  }

  public void construirLlantas(){
    this.auto.setLlantas(new Llanta(4));
  }
  public void construirMotor(){
    this.auto.setMotor(new Motor(3));
  }

  public void construirCarroceria(){
    this.auto.setCarroceria(new Carroceria(3));
  }
  public void construirBlindaje(){
    this.auto.setBlindaje(new Blindaje(3));
  }
  public void construirArmas(){
    this.auto.setArma(new Arma(5));

  }
}
