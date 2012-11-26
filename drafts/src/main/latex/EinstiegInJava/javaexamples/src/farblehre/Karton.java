package farblehre;

import java.util.logging.Logger;

public class Karton {

	static final Logger logger = Logger.getLogger(Karton.class.getName());

	protected RGBFarbe aussenFarbe;
	protected SWFarbe innenFarbe;

	public void setFarbe(RGBFarbe aussenFarbe) {
		logger.info("Karton#setFarbe(RGBFarbe)");
		this.aussenFarbe = aussenFarbe;
	}

	public void setFarbe(SWFarbe innenFarbe) {
		logger.info("Karton#setFarbe(SWFarbe)");
		this.innenFarbe = innenFarbe;
	}

	@Override
	public String toString() {
		final StringBuffer buf = new StringBuffer();
		buf.append("Mir wurden folgende Farben zugewiesen:\n");
		if (aussenFarbe == null) {
			buf.append("Aussenfarbe: keine");
		} else {
			buf.append("Aussenfarbe: " + aussenFarbe.toString());
		}
		buf.append("\nInnenfarbe: " + innenFarbe);
		return buf.toString();
	}
}
