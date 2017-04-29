package ca.qc.bdeb.prog2.TP2;

public abstract class Unite extends Element {
    
    protected int bouclier, dommage;
    
    protected boolean auSol;
    
    
    
    public Unite(int id, String nom, Race race, int coutMinerai, int pv, int armure, int dommage, boolean auSol) {
        
        super(id, nom, race, coutMinerai, pv, armure);
        
        this.dommage = dommage;
        
        this.auSol = auSol;
        
    }
    
}
