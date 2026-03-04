package com.example.session07.mapper;

import com.example.session07.model.dto.candidate.CandidateCreateDto;
import com.example.session07.model.dto.candidate.CandidateResponse;
import com.example.session07.model.dto.candidate.CandidateUpdateDto;
import com.example.session07.model.entity.Candidate;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CandidateMapper {
    // To Entity
    Candidate toEntity(CandidateCreateDto request);
    // To Dto
    CandidateResponse toDto(Candidate candidate);
    // Update To ENtity
    void updateCandidate(CandidateUpdateDto request, @MappingTarget Candidate candidate);
}
