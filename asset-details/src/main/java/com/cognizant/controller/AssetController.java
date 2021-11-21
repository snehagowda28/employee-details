package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Asset;
import com.cognizant.exception.RecordNotFoundException;
import com.cognizant.repository.AssetRepository;
import com.cognizant.service.AssetService;

@RestController
@RequestMapping("/assets")
public class AssetController {
	@Autowired
	AssetService assetService;

	@GetMapping()
	public List<Asset> getAsset() {
		return assetService.getAllAssetDetail();
	}

	@GetMapping("/{asset_id}")
	public Asset getAssetById(@PathVariable("asset_id") int asset_id) {
		return assetService.getOneAssetDetail(asset_id);
	}

	@GetMapping("/{asset_id}/{emp_id}")
	public Asset getAssetByEmpIdandAssetId(@PathVariable("asset_id") int asset_id, @PathVariable("emp_id") int emp_id) {
		return assetService.getAssetWithEmpIdandAssetId(asset_id, emp_id);
	}

	@GetMapping("/empId/{emp_id}")
	public List<Asset> getAssetByEmpId(@PathVariable("emp_id") int emp_id) {
		return assetService.getAssetWithEmpId(emp_id);
	}

	@PostMapping()
	public Asset createAssetDetail(@RequestBody Asset asset) {
		return assetService.postAssetDetail(asset);
	}

	@PutMapping()
	public Asset updateAssetDetail(@RequestBody Asset asset) {
		return assetService.updateAssetDetail(asset);
	}

	@DeleteMapping("/{asset_id}")
	public void deleteAssetDetail(@PathVariable("asset_id") int asset_id) {
		assetService.deleteAssetDetail(asset_id);
	}
}
