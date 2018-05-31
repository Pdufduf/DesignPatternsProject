import java.util.Vector;

public class Vol {

  public String dateDepart;

  public String heureDepart;

  public String dateArrivee;

  public Integer heureArrivee;

    /**
   * 
   * @element-type Billet
   */
  public Vector  Concerner;
    public CompagnieAerienne Proposer;
    public Vector  myAéroport;
    /**
   * 
   * @element-type Aéroport
   */
  public Vector  Décoller;
    /**
   * 
   * @element-type Aéroport
   */
  public Vector  Atterrir;
    /**
   * 
   * @element-type Hotesse
   */
  public Vector  Etre affecter;

  public void ouvrirVol() {
  }

  public void fermerVol() {
  }

}