package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class ISpecimenServiceStub implements ISpecimenService {
	
	@Override
	public SpecimenDTO fetchById(int id) {
		 SpecimenDTO specimenDTO = new  SpecimenDTO();
		 specimenDTO.setSpecimenId(43);
		 specimenDTO.setLatitude("39.74");
		 specimenDTO.setLongitude("-84.51");
		 specimenDTO.setDescription("A beautiful Eastern Redbud");
		 return specimenDTO;
		
	}

	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
	
}