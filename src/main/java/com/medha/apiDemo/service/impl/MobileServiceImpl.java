package com.medha.apiDemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.medha.apiDemo.model.MobileStore;
import com.medha.apiDemo.repository.MobileRepository;
import com.medha.apiDemo.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	MobileRepository mobileRepository;

	public MobileServiceImpl(MobileRepository mobileRepository) {
		this.mobileRepository = mobileRepository;
	}

	@Override
	public String createMobileStore(MobileStore mobileStore) {
		mobileRepository.save(mobileStore);
		return "Sucessfully created the Record in DB";
	}

	@Override
	public String updateMobileStore(MobileStore mobileStore) {
		mobileRepository.save(mobileStore);
		return "Sucessfully updated the Record in DB";
	}

	@Override
	public String deleteMobileStore(String mobile_id) {
		mobileRepository.deleteById(mobile_id);
		return "Record deleted successfully";
	}

	@Override
	public MobileStore getMobileStore(String mobile_id) {
		return mobileRepository.findById(mobile_id).get();
	}

	@Override
	public List<MobileStore> getAllMobileStore() {
		return mobileRepository.findAll();
	}

}
