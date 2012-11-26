package farblehre;

import java.util.logging.Logger;

import org.junit.Test;

public class Tester {

	static final Logger logger = Logger.getLogger(Tester.class.getName());

	@Test
	public final void testKartonRotWeiss() {
		final Karton karton = new Karton();
		karton.setFarbe(RGBFarbe.ROT);
		karton.setFarbe(SWFarbe.WEISS);
		printKartonStatus(karton);
	}

	@Test
	public final void testKartonBeleuchtet() {
		final BeleuchteterKarton karton = new BeleuchteterKarton();
		karton.setFarbe(RGBFarbe.BLAU);
		karton.setFarbe(SWFarbe.SCHWARZ);
		karton.setFarbe(RGBFarbe.GRUEN);
		printKartonStatus(karton);
	}

	protected void printKartonStatus(Karton karton) {
		logger.info(karton.toString());
	}

}
