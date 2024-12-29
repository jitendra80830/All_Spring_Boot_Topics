package com.transaction.service;

import com.transaction.entities.Address;
import com.transaction.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
