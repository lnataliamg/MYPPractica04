public class Constructor{

  public Constructor(){}




  public void construir(BuilderAuto builder){
    builder.crearAuto();
    builder.construirMotor();
    builder.construirLlantas();
    builder.construirCarroceria();
    builder.construirBlindaje();
    builder.construirArmas();
  }
}
