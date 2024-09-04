package Project.S14_L2.Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    protected int calorie;
    protected double prezzo;

    public Item(int calorie, double prezzo){
        this.calorie=calorie;
        this.prezzo=prezzo;
    }
}
