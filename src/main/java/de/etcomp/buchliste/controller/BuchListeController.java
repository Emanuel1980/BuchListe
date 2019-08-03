package de.etcomp.buchliste.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.etcomp.buchliste.model.BuchDataEntity;
import de.etcomp.buchliste.repository.BucherRepository;

@Component
public class BuchListeController {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(BuchListeController.class);
	
	@Autowired
	private BucherRepository buecherrepo;
	
	public BuchDataEntity addBuch(BuchDataEntity buch) {
		LOG.info("BuchListeController.addBuch");
		buch.setId(UUID.randomUUID().toString().replace("-", ""));
		try {
		buecherrepo.save(buch);
		} catch (Exception ex) {
			LOG.info("Buchdatensatz konnte nicht gespeichert werden {}", ex);
			ex.printStackTrace();
		}
		return buch;
	}

}
