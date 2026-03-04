package com.example.session07.controller;

import com.example.session07.model.dto.candidate.CandidateCreateDto;
import com.example.session07.model.dto.candidate.CandidateResponse;
import com.example.session07.model.dto.candidate.CandidateUpdateDto;
import com.example.session07.service.ICandidateService;
import com.example.session07.util.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/candidates")
public class CandidateController {
    @Autowired
    private ICandidateService candidateService;
    @PostMapping
    public ResponseEntity<ApiResponse<CandidateResponse>> createCandidate(@Valid @RequestBody CandidateCreateDto request){
           CandidateResponse saved = candidateService.createCandidate(request);
           ApiResponse<CandidateResponse> response = new ApiResponse<>("Success","Candidate Created",saved);
           return new ResponseEntity<>(response, HttpStatus.CREATED); // 201
    }
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CandidateResponse>> updateCandidate(@Valid @ModelAttribute CandidateUpdateDto request, @PathVariable Long id){
        CandidateResponse saved = candidateService.updateCandidate(request,id);
        ApiResponse<CandidateResponse> response = new ApiResponse<>("Success","Candidate Updated",saved);
        return new ResponseEntity<>(response, HttpStatus.OK); //200
    }
}
