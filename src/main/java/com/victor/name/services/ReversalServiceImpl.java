package com.victor.name.services;

import com.victor.name.data.model.Reversal;
import com.victor.name.data.repositories.ReversalRepository;
import com.victor.name.payload.request.ReversalRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReversalServiceImpl implements ReversalService{
    private ReversalRepository reversalRepository;

    public ReversalServiceImpl(ReversalRepository reversalRepository){
        this.reversalRepository = reversalRepository;
    }
    @Override
    public Reversal save(ReversalRequest reversalRequest) {
        Reversal reversal = new Reversal();
        reversal.setName(reversalRequest.getName());

        reversalRepository.save(reversal);

        return reversal;
    }

    @Override
    public String reverseString(Long id) {
        String result = "";
        Optional<Reversal> reversal = reversalRepository.findById(id);
        if (reversal.isPresent()){
            StringBuffer nm = new StringBuffer(reversal.get().getName()).reverse();
            result = nm.toString();
        }
        return result;

    }




}
