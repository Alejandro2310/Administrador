package com.administrador.administrador.seguros.service;

import java.util.List;

import com.administrador.administrador.seguros.Insurance;
import com.administrador.administrador.seguros.InsuranceSummary;

public interface InsuranceService {

	void addInsurance(Insurance insurance);

	void deleteInsurance(Integer insuranceId);

	List<InsuranceSummary> showInsurancesByUser(Integer userId);

	InsuranceSummary showInsuranceById(Integer userId);

}
