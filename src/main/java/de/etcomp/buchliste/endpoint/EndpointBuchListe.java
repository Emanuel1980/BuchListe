package de.etcomp.buchliste.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.etcomp.buchliste.controller.BuchListeController;
import de.etcomp.buchliste.model.BuchDataEntity;

@RestController
@RequestMapping("/buchliste")
public class EndpointBuchListe {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(EndpointBuchListe.class);

	
	
	@Autowired
	private BuchListeController buchListeController;
	
	@RequestMapping(path="/addbuch", method=RequestMethod.POST)
	public BuchDataEntity addBuch( @RequestBody BuchDataEntity buch) {
		LOG.info("EndpointBuchListe.addBuch");			
		return buchListeController.addBuch(buch);
		
	}
	

}
