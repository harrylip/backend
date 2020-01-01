package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Address;

public interface AddressService {

	int insert(Address address);

	int update(Address address);

	int detele(Address address);

	List<Address> get_address();

}
