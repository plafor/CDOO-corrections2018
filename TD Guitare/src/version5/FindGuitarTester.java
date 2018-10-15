package version5;

import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory mySuperInventory = new Inventory();
		initializeInventory(mySuperInventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER,
				Wood.ALDER);
		List<Instrument> results = mySuperInventory.search(whatErinLikes);

		if (!results.isEmpty()) {
			for (Instrument instrument : results) {
				System.out.println("Erin, you might like this " + instrument.getSpecs().getBuilder() + " "
						+ instrument.getSpecs().getModel() + " " + instrument.getSpecs().getType() 
						+ (instrument instanceof Guitar?" guitar":" mandolin") + ":\n   "
						+ instrument.getSpecs().getBackWood() + " back and sides,\n   " + instrument.getSpecs().getTopWood()
						+ " top.\nYou can have it for only $" + instrument.getPrice() + "!");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	public static void initializeInventory(Inventory inventory) {
        inventory.addInstrument(new Guitar("11277", 3999.95,
                new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA)));
      inventory.addInstrument(new Mandolin("V95693", 1499.95,
                new MandolinSpec(Builder.FENDER, "Stratocastor", Style.A, Type.ELECTRIC, Wood.ALDER, Wood.ALDER)));
      inventory.addInstrument(new Guitar("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER)));
      inventory.addInstrument(new Guitar("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK)));
      inventory.addInstrument(new Guitar("76531", 6295.95,
                new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK)));
      inventory.addInstrument(new Guitar("70108276", 2295.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY)));
      inventory.addInstrument(new Guitar("82765501", 1890.95,
                new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY)));
      inventory.addInstrument(new Mandolin("77023", 6275.95,
                new MandolinSpec(Builder.MARTIN, "D-28", Style.A, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK)));
      inventory.addInstrument(new Guitar("1092", 12995.95,
                new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12, Wood.INDIAN_ROSEWOOD, Wood.CEDAR)));
      inventory.addInstrument(new Guitar("566-62", 8999.95,
                new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12, Wood.COCOBOLO, Wood.CEDAR)));
      inventory.addInstrument(new Mandolin("6 29584", 2100.95,
                new MandolinSpec(Builder.PRS, "Dave Navarro Signature", Style.F, Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE)));
	}
}
