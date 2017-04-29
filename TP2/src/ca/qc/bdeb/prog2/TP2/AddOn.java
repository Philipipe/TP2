package ca.qc.bdeb.prog2.TP2;

public class AddOn extends Element {
    
    public AddOn(int id, String nom, Race race, int coutMinerai, int pv, int armure) {
        
        super(id, nom, race, coutMinerai, pv, armure);
        
    }
    
    @Override
    public String getDescription() {

        String etatRace, etatArmure, etatAddOn;

        etatArmure = (armure == 0) ? "Pas d'armure" : "A une armure";
        
        switch (race) {

            case TERRAN:
                etatRace = "Terran";
                break;

            case ZERG:
                etatRace = "Zerg";
                break;

            default:
                etatRace = "Protoss";
                break;

        }

        return "ID: " + id + ", Nom: " + nom + ", Race: " + etatRace + ", PV: " + pv + ", " + etatArmure
                + ", Coûts de production: " + coutMinerai;

    }
    
}
