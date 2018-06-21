package lichaam;

/**
 *  HIER MAG JE NIETS WIJZIGEN!
 */
public class Cylinder implements Lichaam{
  private double straal;
  private double hoogte;

  public Cylinder(double straal, double hoogte) {
    this.straal = straal;
    this.hoogte = hoogte;
  }

  public double getStraal(){
    return straal;
  }

  public double getHoogte(){
    return hoogte;
  }

  public double volume(){
    return Math.PI * straal * straal * hoogte;
  }

  public double grondvlak(){
    return Math.PI * straal * straal;
  }

  public double verticaleOmtrek(){
    return (hoogte * 2) + (straal * 4);
 }


}