package com.example

import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable;

@Fallback
class API implements Service2Client {
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        return Flowable.just(new ArrayList<>());
    }
}