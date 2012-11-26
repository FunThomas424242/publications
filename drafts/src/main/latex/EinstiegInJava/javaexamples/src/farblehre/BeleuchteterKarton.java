package farblehre;

public class BeleuchteterKarton extends Karton {

	protected RGBFarbe beleuchtungsFarbe;

	@Override
	public void setFarbe(RGBFarbe beleuchtungsFarbe) {
		logger.info("BeleuchteterKarton#setFarbe(RGBFarbe)");
		this.beleuchtungsFarbe = beleuchtungsFarbe;
	}

	@Override
	public String toString() {
		final StringBuffer buf = new StringBuffer(super.toString());
		buf.append("\nBeleuchtungsfarbe: " + beleuchtungsFarbe);
		return buf.toString();
	}

}
