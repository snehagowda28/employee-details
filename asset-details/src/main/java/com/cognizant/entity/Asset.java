package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id")
	private int assetId;
	private String assetName;
	private String assetType;
	private String assetStatus;
	@Column(name = "emp_id")
	private int empId;

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(String assetStatus) {
		this.assetStatus = assetStatus;
	}

	public int getEmp_id() {
		return empId;
	}

	public void setEmp_id(int emp_id) {
		this.empId = emp_id;
	}

	public int getAsset_id() {
		return assetId;
	}

	public void setAsset_id(int asset_id) {
		this.assetId = asset_id;
	}
}
