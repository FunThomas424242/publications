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

	// @Test
	// public void rgbTest() {
	// SWFarbe farbe = new SWFarbe();
	// printFarbe(farbe);
	// farbe = new Weiss();
	// printFarbe(farbe);
	// farbe = SWFarbe.GRAU;
	// printFarbe(farbe);
	//
	// if (SWFarbe.GRAU == SWFarbe.WEISS) {
	// logger.info("Es gilt: Farbe.GRAU == Farbe.WEISS");
	// } else {
	// logger.info("Es gilt NICHT: Farbe.GRAU == Farbe.WEISS");
	// }
	//
	// if (SWFarbe.GRAU.equals(SWFarbe.WEISS)) {
	// logger.info("Es gilt: Farbe.GRAU.equals(Farbe.WEISS)");
	// } else {
	// logger.info("Es gilt NICHT: Farbe.GRAU.equals(Farbe.WEISS)");
	// }
	// }

	protected void printKartonStatus(Karton karton) {
		logger.info(karton.toString());
	}

}
