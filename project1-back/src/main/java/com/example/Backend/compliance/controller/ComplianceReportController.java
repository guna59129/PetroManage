package com.example.Backend.compliance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.compliance.entity.ComplianceReport;
import com.example.Backend.compliance.service.ComplianceReportService;

@RestController
@RequestMapping("/api/compliance-reports")
@CrossOrigin
public class ComplianceReportController {

    @Autowired
    private ComplianceReportService service;

    // FRONTEND FORM SUBMIT API
    @PostMapping
    public ComplianceReport submitReport(@RequestBody ComplianceReport report) {
        return service.saveReport(report);
    }

    // GET ALL REPORTS
    @GetMapping
    public List<ComplianceReport> getAllReports() {
        return service.getAllReports();
    }

    // GET REPORT BY ID
    @GetMapping("/{id}")
    public ComplianceReport getReportById(@PathVariable Long id) {
        return service.getReportById(id);
    }
}
