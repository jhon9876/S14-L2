package Project.S14_L2.Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Drinks extends Item {
    private String drinkName;
    public Drinks(int calorie,double prezzo, String drinkName){
        super(calorie,prezzo);
        this.drinkName=drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
