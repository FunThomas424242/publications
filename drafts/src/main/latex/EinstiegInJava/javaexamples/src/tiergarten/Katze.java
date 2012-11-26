package tiergarten;

import java.util.logging.Logger;

public class Katze {

	Logger logger = Logger.getLogger(Katze.class.getName());

	protected String name = null;
	protected Farbe fellFarbe = null;
	protected Farbe fleckenFarbe = null;

	public Katze(final String name, final Farbe fellFarbe,
			final Farbe fleckenFarbe) {
		this.name = name;
		this.fellFarbe = fellFarbe;
		this.fleckenFarbe = fleckenFarbe;
	}

	@Override
	public String toString() {
		return name + ": Fell: " + this.fellFarbe + " Flecken: "
				+ this.fleckenFarbe;
	}

}
