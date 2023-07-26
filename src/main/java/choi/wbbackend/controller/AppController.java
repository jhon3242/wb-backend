package choi.wbbackend.controller;

import choi.wbbackend.domain.flight.Cessna172S;
import choi.wbbackend.domain.flight.Flight;
import choi.wbbackend.domain.flight.FlightRepository;
import choi.wbbackend.domain.sheet.MomentSheet;
import choi.wbbackend.domain.sheet.Sheet;
import choi.wbbackend.domain.sheet.WeightSheet;
import choi.wbbackend.service.WeightAndBalanceService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
public class AppController {

	private final WeightAndBalanceService weightAndBalanceService;

	@PostMapping("/api/sheet")
	public Sheet weightPage(@RequestBody Sheet sheet)  {
		log.info("sheet = {}", sheet);
		return sheet;
	}

	@PostMapping("/api/calculate")
	public Sheet calculatePage(@RequestBody Sheet sheet) {
		return weightAndBalanceService.calculateWeight(sheet);
	}
}
