package at.htl.entity;

import javax.persistence.*;

@Entity
public class Sight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    private Destination destination;

    private int entryPrice;
    private int astimatedtime;

    public Sight() {
    }

    public Sight(int entryPrice, int astimatedtime) {
        this.entryPrice = entryPrice;
        this.astimatedtime = astimatedtime;
    }

    public int getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(int entryPrice) {
        this.entryPrice = entryPrice;
    }

    public int getAstimatedtime() {
        return astimatedtime;
    }

    public void setAstimatedtime(int astimatedtime) {
        this.astimatedtime = astimatedtime;
    }
}
