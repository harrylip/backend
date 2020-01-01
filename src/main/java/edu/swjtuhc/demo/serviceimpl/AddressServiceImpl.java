package edu.swjtuhc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AddressMapper;
import edu.swjtuhc.demo.model.Address;
import edu.swjtuhc.demo.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressMapper AddressMapper;
	@Override
	public int insert(Address address) {
		// TODO Auto-generated method stub
		Address a1=AddressMapper.selectAddressByUsername(address.getUsername(),address.getAddress());
		
		int i=-1;
		if (a1==null) {
			i=1;AddressMapper.insert(address);
			//增加地址成功
		}else {
			i=2;
			//地址已存在
		}
		
		return i;
	}
	@Override
	public int update(Address address) {
		// TODO Auto-generated method stub
		int i=-1;
		i=AddressMapper.update(address);
		
		return i;
	}
	@Override
	public int delete(Address address) {
		// TODO Auto-generated method stub
		int i=-1;
		i=AddressMapper.delete(address);
		
		return i;
	}
	@Override
	public List<Address> get_address() {
		// TODO Auto-generated method stub
		return AddressMapper.get_address();
	}

}
