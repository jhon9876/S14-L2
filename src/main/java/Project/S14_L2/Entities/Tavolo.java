package Project.S14_L2.Entities;

import Project.S14_L2.EnumFile.StatoTavolo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Tavolo {
    private int numero;
    private int numeroCopertiMax;
    private StatoTavolo statoTavolo;

    public Tavolo(int numero,int numeroCopertiMax, StatoTavolo statoTavolo){
        this.numero=numero;
        this.numeroCopertiMax=numeroCopertiMax;
        this.statoTavolo=statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", numeroCopertiMax=" + numeroCopertiMax +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
