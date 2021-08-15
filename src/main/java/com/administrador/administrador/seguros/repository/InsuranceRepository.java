package com.administrador.administrador.seguros.repository;

import java.util.List;

import com.administrador.administrador.seguros.Insurance;
import com.administrador.administrador.seguros.InsuranceSummary;

public interface InsuranceRepository {

	void add(Insurance insurance);

	void delete(Integer insuranceId);

	List<Insurance> showInsurancesByUser(Integer userId);

	Insurance showInsurancesById(Integer userId);

}
