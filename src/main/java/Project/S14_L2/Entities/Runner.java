package Project.S14_L2.Entities;

import Project.S14_L2.S14L2Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S14L2Application.class);

        Menu m1= (Menu) ctx.getBean("primo_menu");
        m1.stampaMenu();

        Tavolo t1= (Tavolo) ctx.getBean("primo_tavolo");
        System.out.println(t1);

        int costoCoperto= (int) ctx.getBean("costo_coperto");
        System.out.println(costoCoperto);
        Ordine o1= (Ordine) ctx.getBean("primo_ordine");
        System.out.println("Conto totale: " + o1.calcolaImporto(t1,m1,costoCoperto));
    }
}
