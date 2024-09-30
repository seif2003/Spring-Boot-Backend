package com.seif.taches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seif.taches.entities.Projet;
import com.seif.taches.entities.Tache;
import com.seif.taches.repos.TacheRepository;

@Service
public class TacheServiceImpl implements TacheService{
	
	@Autowired
	TacheRepository tacheRepository;

	@Override
	public Tache saveTache(Tache t) {
		return tacheRepository.save(t);
	}

	@Override
	public Tache updateTache(Tache t) {
		return tacheRepository.save(t);
	}

	@Override
	public void deleteTache(Tache p) {
		tacheRepository.delete(p);
	}

	@Override
	public void deleteTacheById(Long id) {
		tacheRepository.deleteById(id);
	}

	@Override
	public Tache getTache(Long id) {
		return tacheRepository.findById(id).get();
	}

	@Override
	public List<Tache> getAllTaches() {	
		return tacheRepository.findAll();
	}

	@Override
	public List<Tache> findByNomTache(String nom) {
		return tacheRepository.findByNomTache(nom);
	}

	@Override
	public List<Tache> findByNomTacheContains(String nom) {
		return tacheRepository.findByNomTacheContains(nom);
	}

	@Override
	public List<Tache> findByNomStatut(String nom, String statut) {
		return tacheRepository.findByNomStatut(nom, statut);
	}

	@Override
	public List<Tache> findByProjet(Projet projet) {
		return tacheRepository.findByProjet(projet);
	}

	@Override
	public List<Tache> findByProjetIdProjet(Long id) {
		return tacheRepository.findByProjetIdProjet(id);
	}

	@Override
	public List<Tache> findByOrderByNomTacheAsc() {
		return tacheRepository.findByOrderByNomTacheAsc();
	}

	@Override
	public List<Tache> trierTachesDateCreationNom() {
		return tacheRepository.trierTachesDateCreationNom();
	}

}
