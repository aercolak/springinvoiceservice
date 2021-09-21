package com.invoice.service.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.invoice.service.inparam.EfaturaAraIn;
import com.invoice.service.model.Efatura;
import com.invoice.service.service.EfaturaService;

@RestController
@CrossOrigin(origins = { "*" }, maxAge = 3600)
public class EfaturaRestController {

		@Autowired
		private EfaturaService efaturaService;

		@RequestMapping(value = "/efatura", method = RequestMethod.POST)
		public List<Efatura> efaturaGetir(@RequestBody EfaturaAraIn param) {
			return efaturaService.efaturaGetir(param);
		}

}
