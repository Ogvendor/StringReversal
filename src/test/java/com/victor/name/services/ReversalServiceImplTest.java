package com.victor.name.services;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReversalServiceImplTest {
      @Autowired
      private ReversalService reversalService;
    @BeforeEach
    void setUp() {
        reversalService = new ReversalServiceImpl();
    }
}