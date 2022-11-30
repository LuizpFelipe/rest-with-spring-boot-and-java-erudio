package br.com.erudio.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.service.ConvertionService;
import br.com.erudio.service.OperationCalculatorService;
import br.com.erudio.service.PessoaService;

@RestController
public class MathController {
	
	private PessoaService service;

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertionService.isNumeric(numberOne) || !ConvertionService.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Pro Favor, Selecione Numeros Validos");
		return OperationCalculatorService.adicao(numberOne, numberTwo);
	}

	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertionService.isNumeric(numberOne) || !ConvertionService.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Pro Favor, Selecione Numeros Validos");
		return OperationCalculatorService.multiplicacao(numberOne, numberTwo);
	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertionService.isNumeric(numberOne) || !ConvertionService.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Pro Favor, Selecione Numeros Validos");
		return OperationCalculatorService.divisao(numberOne, numberTwo);
	}

	@RequestMapping(value = "/subt/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subt(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertionService.isNumeric(numberOne) || !ConvertionService.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Pro Favor, Selecione Numeros Validos");
		return OperationCalculatorService.subtracao(numberOne, numberTwo);
	}

	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!ConvertionService.isNumeric(numberOne) || !ConvertionService.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Pro Favor, Selecione Numeros Validos");
		return OperationCalculatorService.media(numberOne, numberTwo);
	}

	@RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable(value = "numberOne") String numberOne) throws Exception {

		if (!ConvertionService.isNumeric(numberOne))
			throw new UnsupportedMathOperationException("Pro Favor, Selecione Numeros Validos");
		return OperationCalculatorService.raizQuadrada(numberOne);
	}

	

}
