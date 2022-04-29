package com.example.springboot.interviews.blueoptima.usingapi;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.Duration;

@RestController
public class AreaCalculatorController {

    private final Bucket bucket;
    public AreaCalculatorController() {
        Bandwidth limit=Bandwidth.classic(20, Refill.greedy(20, Duration.ofMinutes(1)));
        this.bucket= Bucket4j.builder().addLimit(limit).build();
    }

    @PostMapping(value = "/api/v1/area/rectangle")
    public ResponseEntity<AreaV1> rectangle(@RequestBody RectangleDimensionV1 dimensions){
        if(bucket.tryConsume(1)) {
            return ResponseEntity.ok(new AreaV1("rectangle", new BigDecimal(dimensions.getLength() * dimensions.getWidth())));
        }
        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build();
    }
}
