package Project.S14_L2.Entities;

import lombok.Getter;

import java.util.List;
@Getter

public class Pizze extends Item {
    private String namePizza;
    private List<Toppings> t;
    public Pizze(String namePizza, List<Toppings> t){
        super(1500,2.5);
        this.namePizza=namePizza;
        this.t=t;
        this.calorie=calcolaCalorie(t);
        this.prezzo=calcolaPrezzoTotale(t);
    }

    public int calcolaCalorie(List <Toppings> topping){
        int calorieTot=1500;
        if(topping!=null){
            for (int i = 0; i < topping.size(); i++) {
                calorieTot+=topping.get(i).getCalorie();
            }
        }
        return calorieTot;
    }

    public double calcolaPrezzoTotale(List <Toppings> topping){
        double prezzoTotale=2.5;
        if(topping!=null) {
            for (int i = 0; i < topping.size(); i++) {
                prezzoTotale+=topping.get(i).getPrezzo();
            }
        }
        return prezzoTotale;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "namePizza='" + namePizza + '\'' +
                ", t=" + t +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
