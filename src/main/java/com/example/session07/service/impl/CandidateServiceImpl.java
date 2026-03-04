package com.example.session07.service.impl;

import com.example.session07.mapper.CandidateMapper;
import com.example.session07.model.dto.candidate.CandidateCreateDto;
import com.example.session07.model.dto.candidate.CandidateResponse;
import com.example.session07.model.dto.candidate.CandidateUpdateDto;
import com.example.session07.model.entity.Candidate;
import com.example.session07.repository.ICandidateRepository;
import com.example.session07.service.ICandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateServiceImpl implements ICandidateService {
    private final ICandidateRepository candidateRepository;
    private final CandidateMapper candidateMapper;
    @Override
    public CandidateResponse createCandidate(CandidateCreateDto request) {
        // Lấy data từ DTO
        // Map về Entity
        Candidate data = candidateMapper.toEntity(request);
        // Lưu xuống DB
        Candidate saved = candidateRepository.save(data);
        // Trả DL cho client
        return candidateMapper.toDto(saved);
    }

    @Override
    public CandidateResponse updateCandidate(CandidateUpdateDto request, long id) {
        // Tìm kiếm ID
        Candidate candidate = candidateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("candidate not found"));
        // Map data từ DTO -> Entity
        candidateMapper.updateCandidate(request, candidate);
        // Update về DB
        Candidate saved = candidateRepository.save(candidate);
        // Trả Json cho client
        return candidateMapper.toDto(saved);
    }
}
