package version5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(Instrument instrument) {
		instruments.add(instrument);
	}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchInstrument) {
		List<Instrument> result = new LinkedList<>();
		
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();
			
			if (instrument.getSpecs().matches(searchInstrument)) {
				result.add(instrument);
			}
		}
		return result;
	}

}
