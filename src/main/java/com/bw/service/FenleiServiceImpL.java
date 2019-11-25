package com.bw.service;

import com.bw.dao.KechengRepsitory;
import com.bw.entity.Kecheng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * service实现类
 */
@Service
public class FenleiServiceImpL implements FenleiService{
    @Autowired
    private KechengRepsitory kechengRepsitory;

    @Override
    public List<Kecheng> getlist() {
        Pageable pageable = PageRequest.of(0, 2);
        List<Kecheng> all = kechengRepsitory.findAll();
        return all;
    }
}
