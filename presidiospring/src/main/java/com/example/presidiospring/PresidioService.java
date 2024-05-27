package com.example.presidiospring;

import org.springframework.stereotype.Service;

@Service
public interface PresidioService {

    public String rent (PresidioData presidioData);
}
