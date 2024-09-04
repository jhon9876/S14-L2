package Project.S14_L2.Entities;

import Project.S14_L2.EnumFile.StatoOrdine;

import java.util.List;

public class Ordine {
    private Tavolo tavolo;
    private Menu menu;
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private int oraAcquisizione;
private double importoTotale;
private double costoCoperti;
    public Ordine(Tavolo tavolo, Menu menu, int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti, int oraAcquisizione) {
        this.tavolo = tavolo;
        this.menu = menu;
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.importoTotale=calcolaImporto(tavolo, menu,costoCoperti);
    }
/*L'ordine ha un importo totale dato dalla somma dei costi dei suoi elementi
* e dei coperti*/
    /*su tavolo ho il numero di copertimax
    * su menu ho gli elementi con il relativo prezzo (su pizza ho il metodo per il calcolo del prezzo)*/
    public double calcolaImporto(Tavolo t,Menu m, double costoCoperti){
        double importo=0;
        double importoCoperti=costoCoperti*this.numeroCoperti;
        if(m!=null){

                importo+=m.getPrezzoPizze()+m.getPrezzoDrink()+importoCoperti;

        }
        return importo;
    }
}
