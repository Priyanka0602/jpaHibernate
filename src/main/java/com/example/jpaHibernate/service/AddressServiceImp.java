package com.example.jpaHibernate.service;

import com.example.jpaHibernate.dao.Address;
import com.example.jpaHibernate.repository.AddressRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AddressServiceImp implements AddressService {

    @Autowired
    private AddressRespository addressRespository;

    @Override
    public Address createAddress(Address address) {
        return this.addressRespository.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
            return this.addressRespository.findAll();
    }
}
