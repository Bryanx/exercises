package lichaam;

/**
 *  HIER MAG JE NIETS WIJZIGEN!
 */
public class Balk implements Lichaam{
  private double hoogte;
  private double breedte;
  private double lengte;

  public Balk(double hoogte, double lengte, double breedte){
    this.lengte = lengte;
    this.hoogte = hoogte;
    this.breedte = breedte;
  }

  public double getHoogte(){
    return hoogte;
  }

  public double getBreedte(){
    return breedte;
  }

  public double getLengte(){
    return lengte;
  }

  public double volume(){
    return lengte * hoogte * breedte;
  }

  public double grondvlak(){
    return lengte * breedte;
  }

  public double verticaleOmtrek(){
    return (hoogte + lengte) * 2;
  }
}