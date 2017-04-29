package ca.qc.bdeb.prog2.TP2;

public class UniteNormale extends Unite {
    
    public UniteNormale(int id, String nom, Race race, int coutMinerai, int pv, int armure, int dommage, boolean auSol) {
        
        super(id, nom, race, coutMinerai, pv, armure, dommage, auSol);
        
    }
    
    @Override
    public String getDescription() {

        String etatRace, etatArmure, etatAuSol;

        etatArmure = (armure == 0) ? "Pas d'armure" : "A une armure";

        etatAuSol = (auSol) ? "Terrestre" : "Volant";

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
                + ", Dommages: " + dommage + ", Coûts de production: " + coutMinerai + ", " + etatAuSol;

    }
    
}
