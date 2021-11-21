package com.cognizant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Asset;
import com.cognizant.exception.RecordNotFoundException;
import com.cognizant.repository.AssetRepository;

@Service
public class AssetService implements IAssetService {
	@Autowired
	AssetRepository repository;

	@Override
	public List<Asset> getAllAssetDetail() {
		return repository.findAll();
	}

	@Override
	public Asset getOneAssetDetail(int asset_id) {
		return repository.findById(asset_id)
				.orElseThrow(() -> new RecordNotFoundException("Given Asset Id does not exist = " + asset_id));
	}

	@Override
	public Asset getAssetWithEmpIdandAssetId(int asset_id, int emp_id) {
		return repository.findByAssetIdAndEmpId(asset_id, emp_id);
	}

	@Override
	public List<Asset> getAssetWithEmpId(int emp_id) {
		return repository.findWithEmpId(emp_id);
	}

	@Override
	public Asset postAssetDetail(Asset asset) {
		return repository.save(asset);
	}

	@Override
	public Asset updateAssetDetail(Asset asset) {
		return repository.save(asset);
	}

	@Override
	public ResponseEntity<Asset> deleteAssetDetail(int asset_id) {
		Asset existingAsset = this.repository.findById(asset_id)
				.orElseThrow(() -> new RecordNotFoundException("Asset Detail not found with id :" + asset_id));
		this.repository.delete(existingAsset);
		return ResponseEntity.ok().build();
	}

}
