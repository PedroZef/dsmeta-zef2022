package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;

@Service
public class SaleService {
	
	@Autowired
	private SaleService service;
	
	public List<Sale> findSales() {
		return service.findAll()
	}

}
