package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;


@RestController
class Fallback {

    @GetMapping("/api/fallback")
    Single<String> ShowErrorMessage() {
        return Single.just("Something went wrong with Service 1! Please try again later:)")
    }

}
