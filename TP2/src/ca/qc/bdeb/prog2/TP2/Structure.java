package ca.qc.bdeb.prog2.TP2;

public class Structure extends Element {
    
    protected int coutGaz;
    
    protected boolean addOnPermis;
    
    public Structure(int id, String nom, Race race, int coutMinerai, int pv, int armure) {
        
        super(id, nom, race, coutMinerai, pv, armure);
        
        this.coutGaz = coutGaz;
        
        this.addOnPermis = addOnPermis;
        
    }
    
}