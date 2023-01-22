package com.victor.name.services;

import com.victor.name.data.model.Reversal;
import com.victor.name.payload.request.ReversalRequest;
import org.springframework.stereotype.Service;

@Service
public interface ReversalService {
    Reversal save(ReversalRequest reversalRequest);
    String reverseString(Long id);
}
