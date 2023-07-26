package choi.wbbackend.domain.flight;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Data
public class Cessna172S implements Flight{
//	public static final Float frontSeatsArmCG = 37f;
//	public static final Float rearSeatsArmCG = 73f;
//	public static final Float baggage1ArmCG = 95f;
//	public static final Float baggage2ArmCG = 123f;
//	public static final Float fuelArmCG = 48f;
//	public static final Float fuelStartTaxiRunUpArmCG = 48f;
//	public static final Float estimatedFuelBurnArmCG = 48f;
	public final Float basicEmptyWeight = 1657.0f;
	private final Map<String, Float> cgs = new ConcurrentHashMap<>();
	public String name;

	public Cessna172S() {
		cgs.put("frontSeats", 37f);
		cgs.put("rearSeats", 73f);
		cgs.put("baggage1", 95f);
		cgs.put("baggage2", 123f);
		cgs.put("fuel", 48f);
		cgs.put("fuelStartTaxiRunUp", 48f);
		cgs.put("estimatedFuelBurn", 48f);
	}

	public Cessna172S(String name) {
		this.name = name;
	}


	@Override
	public Float getCG(String name) {
		return cgs.get(name);
	}
}
