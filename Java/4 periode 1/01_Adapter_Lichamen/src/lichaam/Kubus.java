package lichaam;

/**
 *  HIER MAG JE NIETS WIJZIGEN!
 */
public class Kubus implements Lichaam{
  double ribbe;

  public Kubus(double ribbe) {
    this.ribbe = ribbe;
  }

  public double getRibbe(){
    return ribbe;
  }

  public double volume(){
    return ribbe * ribbe * ribbe;
  }

  public double grondvlak(){
    return ribbe * ribbe;
  }

  public double verticaleOmtrek(){
   return ribbe * 4;
 }

}