package com.example.Backend.compliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Backend.compliance.entity.ComplianceReport;
import com.example.Backend.compliance.repository.ComplianceReportRepository;

@Service
public class ComplianceReportService {

    @Autowired
    private ComplianceReportRepository repository;

    // SAVE FORM DATA
    public ComplianceReport saveReport(ComplianceReport report) {
        return repository.save(report);
    }

    // GET ALL REPORTS
    public List<ComplianceReport> getAllReports() {
        return repository.findAll();
    }

    // GET REPORT BY ID
    public ComplianceReport getReportById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Compliance report not found with id: " + id));
    }
}
