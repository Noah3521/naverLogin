package com.itbank.service;

import com.itbank.repository.TestDAO;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private TestDAO testDAO;

    public TestService(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    public String getVersion() {
        return testDAO.getVersion();
    }
}
