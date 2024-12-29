package com.example.FinalOOP.controller;

import com.example.FinalOOP.service.CodeService;
import com.example.FinalOOP.model.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/codes")
@CrossOrigin(origins = "https://vercel.com/arisbeks-projects/final-web")
public class CodeController {

    @Autowired
    private CodeService codeService;

    @GetMapping
    public List<Code> getAllCodes() {
        return codeService.getAllCodes();
    }

    @PostMapping
    public Code saveCode(@RequestBody Code code) {
        return codeService.saveCode(code);
    }
}