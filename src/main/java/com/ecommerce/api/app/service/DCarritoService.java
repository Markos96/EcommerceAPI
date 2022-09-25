package com.ecommerce.api.app.service;

import com.ecommerce.api.app.DTO.DCarritoDTO;
import com.ecommerce.api.app.Mappers.DCarritoMapper;
import com.ecommerce.api.app.model.DCarrito;
import com.ecommerce.api.app.repository.DCarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class DCarritoService {

    @Autowired
    DCarritoRepository DCarritoRepository;

    DCarritoMapper DCarritoMapper = new DCarritoMapper();

    public DCarrito guardarDetalle(DCarritoDTO DCarritoDTO){
       return  DCarritoRepository.save(DCarritoMapper.toEntity(DCarritoDTO));
    }

}
