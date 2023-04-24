package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.model.Admin;

@Service
public class AdminServiceImplement implements AdminService{

	@Autowired
	AdminRepository adminRepo;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
}
