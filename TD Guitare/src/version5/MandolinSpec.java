package version5;

public class MandolinSpec extends InstrumentSpec {

	private Style style;

	public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}
	
	public Style getStyle() {
		return style;
	}

	@Override
	public boolean matches(InstrumentSpec searchInstrument) {

		if (!(searchInstrument instanceof MandolinSpec))
			return false;
		
		if (!super.matches(searchInstrument)) {
			return false;
		}

		Style customerStyle = ((MandolinSpec) searchInstrument).getStyle();
		if ((customerStyle != null) && (customerStyle != getStyle()))
			return false;

		return true;
	}

}
