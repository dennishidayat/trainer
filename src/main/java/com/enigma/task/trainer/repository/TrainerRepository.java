package com.enigma.task.trainer.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enigma.task.trainer.model.Trainer;


public interface TrainerRepository extends PagingAndSortingRepository<Trainer, Integer>{
	Trainer findByActiveFlag (Boolean activeFlag);

}
