package choi.wbbackend.domain.sheet;

import choi.wbbackend.domain.flight.Flight;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sheet {
	private String flightType;
	private Float frontSeats;
	private Float readSeats;
	private Float baggage1;
	private Float baggage2;
	private Float fuel;
	private Float rampWeight;

	public Sheet() {
	}


}
