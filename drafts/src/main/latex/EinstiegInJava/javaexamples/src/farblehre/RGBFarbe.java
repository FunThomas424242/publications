package farblehre;

public class RGBFarbe {

	public static RGBFarbe BLAU = new RGBFarbe();
	public static RGBFarbe ROT = new RGBFarbe();
	public static RGBFarbe GRUEN = new RGBFarbe();

	@Override
	public String toString() {
		String farbName = "unbekannt";
		if (ROT.equals(this)) {
			farbName = "ROT";
		}
		if (BLAU.equals(this)) {
			farbName = "BLAU";
		}
		if (GRUEN.equals(this)) {
			farbName = "GRUEN";
		}
		return farbName;
	}
}
