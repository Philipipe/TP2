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
    
}
