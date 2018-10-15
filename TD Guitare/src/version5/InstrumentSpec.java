package version5;

public abstract class InstrumentSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood; 
	private Wood topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}
	
	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(InstrumentSpec searchGuitar) {
		
		Builder builder = searchGuitar.getBuilder();
		if ((builder != null) && (!builder.equals(getBuilder())))
			return false;
		
		String model = searchGuitar.getModel();
		if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(getModel())))
			return false;
		
		Type type = searchGuitar.getType();
		if ((type != null) && (!type.equals(getType())))
			return false;
		Wood backWood = searchGuitar.getBackWood();
		if ((backWood != null) && (!backWood.equals(getBackWood())))
			return false;
		
		Wood topWood = searchGuitar.getTopWood();
		if ((topWood != null) && (!topWood.equals(getTopWood())))
			return false;
		
		
		return true;
	}
	
	

}
