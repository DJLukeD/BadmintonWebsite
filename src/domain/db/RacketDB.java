package domain.db;

import domain.model.Racket;

import java.util.ArrayList;

public class RacketDB {

    private ArrayList<Racket> rackets = new ArrayList<>();

    public RacketDB() {
        Racket astrox = new Racket("Astrox", 6, 8.3, 170);
        Racket voltric = new Racket("Voltric", 3, 10.5, 140);
        Racket nanoflare = new Racket("Nanoflare", 4, 9, 120);

        rackets.add(astrox);
        rackets.add(voltric);
        rackets.add(nanoflare);
    }

    public ArrayList<Racket> getList() {
        return this.rackets;
    }

    public Racket getRacket(String naam) {
        Racket res = null;
        for (int i = 0; i < rackets.size() - 1; i++) {
            if (rackets.get(i).getNaam().equals(naam)) {
                res = rackets.get(i);
            }
        }
        return res;
    }

    public Racket vind(String naam){
        if(naam == null || naam.trim().isEmpty()) throw new IllegalArgumentException();
        for(Racket racket : rackets){
            if(racket.getNaam().equals(naam)){
                return racket;
            }
        }
        return null;
    }

    public String getMinstAantal() {
        Racket res = rackets.get(0);
        for (int i = 0; i < rackets.size() - 1; i++) {
            if ((res.getAantal()) > (rackets.get(i + 1)).getAantal()) {
                res = rackets.get(i + 1);
            }
        }
        return res.getNaam();
    }

    public void voegToe(Racket racket){
        if(racket == null) throw new IllegalArgumentException();
        if(vind(racket.getNaam()) != null) throw new IllegalArgumentException("Je mag maar één maal een merk toevoegen");
        rackets.add(racket);
    }

    public  ArrayList<Racket> getAlle(){
        return rackets;
    }


}
