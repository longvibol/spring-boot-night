package com.piseth.java.schoolmvc.phoneshopmvc.service;

import com.piseth.java.schoolmvc.phoneshopmvc.entity.Brand;

public interface BrandService{
	
	Brand create(Brand brand);
	Brand findById(Integer id);
	Brand update(Integer id, Brand brandUpdate);


}
