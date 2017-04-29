package ca.qc.bdeb.prog2.TP2;

public abstract class Element {
    
    public int id;
    
    protected String nom;
    
    protected enum Race {
        
        TERRAN,
        ZERG,
        PROTOSS;
        
    }
    
    protected Race race;
    
    protected int coutMinerai, pv, armure;
    
    protected int x = 1;
    
    public Element(int id, String nom, Race race, int coutMinerai, int pv, int armure) {
        
        this.id = x;
        this.nom = nom;
        this.race = race;
        this.coutMinerai = coutMinerai;
        this.pv = pv;
        this.armure = armure;
        
        x++;
        
    }
    
}
