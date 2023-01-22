package com.victor.name.controller;

import com.victor.name.data.model.Reversal;
import com.victor.name.payload.request.ReversalRequest;
import com.victor.name.services.ReversalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ReverseMeans")
@AllArgsConstructor
@RestController
public class ReversalController {
    private ReversalService reversalService;

    @PostMapping("safe")
    public ResponseEntity<?> save(@RequestBody ReversalRequest reversalRequest){
        Reversal reversal = reversalService.save(reversalRequest);
        return new ResponseEntity<> (reversal, HttpStatus.CREATED);
    }

    @GetMapping("/revstring/{id}")
    public ResponseEntity<?> reverseString(@PathVariable Long id){
        String result = reversalService.reverseString(id);
        return  new ResponseEntity<>(result,HttpStatus.OK);
    }
}
