package com.example.CompanyApp.Services;

import com.example.CompanyApp.Model.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> getAllCompanies();
    public Company addCompany(Company company);
    public boolean deleteCompany(int companyID);
    public boolean updateCompany(Company company);

    public Company getCompanyByID(int companyID);

}