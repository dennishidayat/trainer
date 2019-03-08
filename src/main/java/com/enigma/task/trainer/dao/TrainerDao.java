package com.enigma.task.trainer.dao;

import java.util.List;

import com.enigma.task.trainer.exception.CustomException;
import com.enigma.task.trainer.model.Trainer;

public interface TrainerDao {
	public Trainer getById(int id) throws CustomException;
	public Trainer save(Trainer trainer) throws CustomException;
	void delete(Trainer trainer) throws CustomException;
	public Trainer getByActiveFlag(Boolean id) throws CustomException;
	
	List<Trainer> getList() throws CustomException;
	List<Trainer> getListByActiveFlag() throws CustomException;
}
