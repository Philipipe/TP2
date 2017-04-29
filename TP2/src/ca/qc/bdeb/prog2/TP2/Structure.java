package ca.qc.bdeb.prog2.TP2;

public class Structure extends Element {
    
    protected int coutGaz;
    
    protected boolean addOnPermis;
    
    public Structure(int id, String nom, Race race, int coutMinerai, int pv, int armure, int coutGaz, boolean addOnPermis) {
        
        super(id, nom, race, coutMinerai, pv, armure);
        
        this.coutGaz = coutGaz;
        
        this.addOnPermis = addOnPermis;
        
    }
    
    @Override
    public String getDescription() {

        String etatRace, etatArmure, etatAddOn;

        etatArmure = (armure == 0) ? "Pas d'armure" : "A une armure";
        
        etatAddOn = (addOnPermis) ? "Add-on permis" : "Add-on interdit";

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
                + ", Coûts de production: " + coutMinerai + ", " + etatAddOn;

    }
    
}