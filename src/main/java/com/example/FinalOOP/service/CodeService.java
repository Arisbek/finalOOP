package com.example.FinalOOP.service;

import com.example.FinalOOP.repository.CodeRepository;
import com.example.FinalOOP.model.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {

    @Autowired
    private CodeRepository codeRepository;

    public List<Code> getAllCodes() {
        return codeRepository.findAll();
    }

    public Code saveCode(Code code) {
        return codeRepository.save(code);
    }
}