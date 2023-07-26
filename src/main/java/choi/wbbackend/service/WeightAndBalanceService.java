package choi.wbbackend.service;

import choi.wbbackend.domain.flight.Flight;
import choi.wbbackend.domain.flight.FlightRepository;
import choi.wbbackend.domain.sheet.MomentSheet;
import choi.wbbackend.domain.sheet.Sheet;
import choi.wbbackend.domain.sheet.WeightSheet;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeightAndBalanceService {

	private final FlightRepository flightRepository;

	public Sheet calculateWeight(Sheet sheet) {

		log.info("calculate sheet");
		Flight flightCG = flightRepository.findByName(sheet.getFlightType());
		flightCG.getCG("frontSeat");
		return sheet;
	}
}
