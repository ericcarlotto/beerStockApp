package one.digitalinnovation.beerstock.mappers;

import one.digitalinnovation.beerstock.dtos.BeerDTO;
import one.digitalinnovation.beerstock.entities.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

  BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

  Beer toModel(BeerDTO beerDTO);

  BeerDTO toDTO(Beer beer);
}