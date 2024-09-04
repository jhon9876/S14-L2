package Project.S14_L2.Entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Menu {
private List <Toppings> toppingList;
private List <Drinks> drinkList;
private List <Pizze> pizzaList;

public Menu( List <Toppings> toppingList, List <Drinks> drinkList, List <Pizze> pizzaList){
    this.toppingList=toppingList;
    this.drinkList=drinkList;
    this.pizzaList=pizzaList;
}

public double getPrezzoPizze(){
    double costoTotale=0;
    if(this.pizzaList!=null){
        for (int i = 0; i <this.pizzaList.size() ; i++) {
            costoTotale+=pizzaList.get(i).prezzo;
        }
    }
    return costoTotale;
}
public double getPrezzoDrink(){
    double costoTotale=0;
    if(this.drinkList!=null){
        for (int i = 0; i < drinkList.size(); i++) {
            costoTotale+=drinkList.get(i).getPrezzo();
        }
    }
        return costoTotale;
}

public void stampaMenu(){
    System.out.println("MENU");
    System.out.println("PIZZE");
    pizzaList.forEach(System.out::println);
    System.out.println();
    System.out.println("TOPPING");
    toppingList.forEach(System.out::println);
    System.out.println();
    System.out.println("DRINK");
    drinkList.forEach(System.out::println);
    System.out.println();
}
}
