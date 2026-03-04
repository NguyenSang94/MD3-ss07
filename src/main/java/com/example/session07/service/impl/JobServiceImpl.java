package com.example.session07.service.impl;

import com.example.session07.model.dto.company.JobCreateDto;
import com.example.session07.service.IJobService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements IJobService {
    @Override
    public JobCreateDto validateJob(JobCreateDto job) {
        if (job.getSalaryMin() > job.getSalaryMax()){
            throw new IllegalArgumentException("Lương tối thiểu không được lớn hơn lương tối đa");
        }
       return job;
    }
}
