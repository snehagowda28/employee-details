package com.cognizant.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cognizant.entity.Asset;

public interface IAssetService {
	List<Asset> getAllAssetDetail();

	Asset getOneAssetDetail(int asset_id);

	Asset postAssetDetail(Asset asset);

	Asset updateAssetDetail(Asset asset);

	ResponseEntity<Asset> deleteAssetDetail(int asset_id);

	List<Asset> getAssetWithEmpId(int emp_id);

	Asset getAssetWithEmpIdandAssetId(int asset_id, int emp_id);
}
