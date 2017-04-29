package ca.qc.bdeb.prog2.TP2;

public class UniteEnergie extends Unite {

    protected int coutEnergie, dommageEnergie, bouclier;

    public UniteEnergie(int id, String nom, Race race, int coutMinerai, int pv,
            int armure, int bouclier, int dommage, boolean auSol, int coutEnergie, int dommageEnergie) {

        super(id, nom, race, coutMinerai, pv, armure, dommage, auSol);

        this.coutEnergie = coutEnergie;

        this.dommageEnergie = dommageEnergie;

        this.bouclier = bouclier;

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
                + ", Bouclier: " + bouclier + ", Dommages: " + dommage + ", Dommages d'énergie: " + dommageEnergie + ", Coûts de production: " + coutMinerai + ", " + coutEnergie + ", " + etatAuSol;

    }

}
