package com.example.session07.service;

import com.example.session07.model.dto.candidate.CandidateCreateDto;
import com.example.session07.model.dto.candidate.CandidateResponse;
import com.example.session07.model.dto.candidate.CandidateUpdateDto;
import com.example.session07.model.entity.Candidate;

public interface ICandidateService {
    CandidateResponse createCandidate(CandidateCreateDto request);
    CandidateResponse updateCandidate(CandidateUpdateDto request, long id);
}
