package choi.wbbackend.domain.flight;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class FlightRepository {
	private final Map<String, Flight> flights;

	public Flight findByName(String name) {
		return flights.get(name);
	}

	public void save(String name, Flight flight) {
		flights.put(name, flight);
	}

	public List<Flight> findAll() {
		return new ArrayList<>(flights.values());
	}
}
