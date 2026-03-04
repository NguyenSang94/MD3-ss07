package com.example.session07.service;

import com.example.session07.model.dto.company.JobCreateDto;

public interface IJobService {
    JobCreateDto validateJob(JobCreateDto jobCreateDto);
}
