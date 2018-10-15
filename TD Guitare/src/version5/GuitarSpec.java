package version5;

public class GuitarSpec extends InstrumentSpec {

	public static final int NO_PREF_NUM_STRINGS = -45;

	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	public int getNumStrings() {
		return numStrings;
	}

	@Override
	public boolean matches(InstrumentSpec searchInstrument) {

		if (!(searchInstrument instanceof GuitarSpec))
			return false;
		
		if (!super.matches(searchInstrument)) {
			return false;
		}

		int numStrings = ((GuitarSpec) searchInstrument).getNumStrings();
		if ((numStrings != NO_PREF_NUM_STRINGS) && (numStrings != getNumStrings()))
			return false;

		return true;
	}

}
