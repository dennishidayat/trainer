package com.enigma.task.trainer.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.trainer.dao.TrainerDao;
import com.enigma.task.trainer.dao.impl.TrainerDaoImpl;


@Configuration
public class DaoSpringConfig {
	
	@Bean
	public TrainerDao TrainerDao() {
		return new TrainerDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
