package de.etcomp.buchliste.repository;

import org.springframework.data.repository.CrudRepository;

import de.etcomp.buchliste.model.BuchDataEntity;

public interface BucherRepository extends CrudRepository<BuchDataEntity, String> {

}
