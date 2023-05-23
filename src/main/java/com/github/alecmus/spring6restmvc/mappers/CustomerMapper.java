package com.github.alecmus.spring6restmvc.mappers;

import com.github.alecmus.spring6restmvc.entities.Customer;
import com.github.alecmus.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
