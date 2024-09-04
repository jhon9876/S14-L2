package Project.S14_L2.Entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Toppings extends Item {
    private String toppingName;

    public Toppings(int calorie,double prezzo, String toppingName){
        super(calorie,prezzo);
        this.toppingName=toppingName;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingName='" + toppingName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
