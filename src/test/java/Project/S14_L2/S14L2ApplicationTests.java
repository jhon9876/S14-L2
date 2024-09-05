package Project.S14_L2;

import Project.S14_L2.Entities.Drinks;
import Project.S14_L2.Entities.Menu;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.assertSame;
import static org.springframework.test.util.AssertionErrors.assertEquals;


@SpringBootTest
class S14L2ApplicationTests {

	@Test
	 void calcolaPrezzoDrink() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S14L2Application.class);
		Menu m1= (Menu) ctx.getBean("primo_menu");

		assertEquals("siOno",70.0,m1.getPrezzoDrink());
	}
@Test
@Disabled
	void sameMemoryLocationDrink(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S14L2Application.class);
		Drinks d1= (Drinks) ctx.getBean("coca");
		Drinks d2= (Drinks) ctx.getBean("mojito");
		assertSame(d1,d2);

	}

}
