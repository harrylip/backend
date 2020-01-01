package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Address;

@Mapper
public interface AddressMapper {

	public int insert(Address address);

	public Address selectAddressByUsername(String username,String address);

	public int update(Address address);

	public List<Address> get_address();

	public int delete(Address address);
}
