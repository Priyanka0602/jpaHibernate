package com.example.jpaHibernate.service;

import com.example.jpaHibernate.dao.Address;

import java.util.List;

public interface AddressService {
    Address createAddress(Address address);
    List<Address> getAllAddress();
}
