package com.enigma.task.trainer.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.trainer.dao.TrainerDao;
import com.enigma.task.trainer.exception.CustomException;
import com.enigma.task.trainer.model.Trainer;
import com.enigma.task.trainer.repository.TrainerRepository;

public class TrainerDaoImpl extends BaseImpl implements TrainerDao{
	
	@Autowired
	public TrainerRepository repository;

	public Trainer getById(int id) throws CustomException {
		return repository.findById(id).orElse(null);
	}

	public Trainer save(Trainer trainer) throws CustomException {
		return repository.save(trainer);
	}

	public void delete(Trainer trainer) throws CustomException {
		repository.delete(trainer);
	}

	public Trainer getByActiveFlag(Boolean id) throws CustomException {
		return repository.findByActiveFlag(id);
	}

	public List<Trainer> getList() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Trainer> query = critB.createQuery(Trainer.class);
		Root<Trainer> root = query.from(Trainer.class);
		query.select(root);
		
		TypedQuery<Trainer> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<Trainer> getListByActiveFlag() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Trainer> query = critB.createQuery(Trainer.class);
		Root<Trainer> root = query.from(Trainer.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<Trainer> i = em.createQuery(query);
		
		return i.getResultList();
	}
	
}
