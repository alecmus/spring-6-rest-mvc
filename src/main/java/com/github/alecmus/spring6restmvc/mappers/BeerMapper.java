package com.github.alecmus.spring6restmvc.mappers;

import com.github.alecmus.spring6restmvc.entities.Beer;
import com.github.alecmus.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
