package com.github.alecmus.spring6restmvc.services;

import com.github.alecmus.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
