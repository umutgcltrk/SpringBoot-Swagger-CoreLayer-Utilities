package com.example.camping.business.abstracts;

import com.example.camping.core.utilities.results.DataResult;
import com.example.camping.core.utilities.results.Result;
import com.example.camping.entity.concretes.Products;

import java.util.List;
//Service,Controllers'ın kullanacağı operasyonları içerir.
//Burda da bu operasyonların en olacağını belirlemek için interface.

public interface ProductService {

    DataResult<List<Products>> getAll();
    Result add(Products products);

}
