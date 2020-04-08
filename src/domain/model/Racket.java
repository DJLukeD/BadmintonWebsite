package domain.model;

public class Racket {
    private String naam;
    private int aantal;
    private double prijs ,aantalKiloBespanning;

    public Racket(String naam, int aantal, double aantalKiloBespanning, double prijs){
        setNaam(naam);
        setAantal(aantal);
        setAantalKiloBespanning(aantalKiloBespanning);
        setPrijs(prijs);
    }

    public String getNaam(){
        return this.naam;
    }

    public int getAantal(){
        return this.aantal;
    }

    public double getAantalKiloBespanning(){
        return this.aantalKiloBespanning;
    }

    public double getPrijs(){
        return this.prijs;
    }

    public void setNaam(String naam){
        if(naam == null || naam.trim().isEmpty()) throw new IllegalArgumentException();
        this.naam = naam;
    }

    public void setAantal(int aantal){
        if(aantal<= 0) throw new IllegalArgumentException();
        this.aantal = aantal;
    }
    public void setAantalKiloBespanning(double aantalKiloBespanning){
        if(aantal <= 0.0) throw new IllegalArgumentException();
        this.aantalKiloBespanning = aantalKiloBespanning;
    }

    public void setPrijs(double prijs){
        if(prijs <= 0.0) throw new IllegalArgumentException();
        this.prijs = prijs;
    }

    public double getTotaalPrijs(){

        return this.prijs * this.aantal;
    }

    public String toString(){
        return "\nNaam: " + naam +
                "\nAantal:" + aantal +
                "\nAantal kilo bespanning:" + aantalKiloBespanning +
                "\nPrijs: €" + prijs;
    }


}
