package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {

	Asset findByAssetIdAndEmpId(int asset_id, int emp_id);

	@Query("from Asset asset where asset.empId=?1")
	List<Asset> findWithEmpId(int emp_id);

}
