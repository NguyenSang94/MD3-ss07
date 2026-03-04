package com.example.session07.controller;

import com.example.session07.model.dto.company.JobCreateDto;
import com.example.session07.service.IJobService;
import com.example.session07.util.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    @Autowired
    private IJobService jobService;
    @PostMapping
    public ResponseEntity<JobCreateDto> createJob(@Valid @RequestBody JobCreateDto jobCreateDto){
        jobService.validateJob(jobCreateDto);
        return new ResponseEntity<>(jobCreateDto, HttpStatus.CREATED);
    }
 }
