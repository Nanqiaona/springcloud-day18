package com.bw.dao;

import com.bw.entity.Kecheng;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * kecheng dao层
 */
public interface KechengRepsitory extends JpaRepository<Kecheng,Integer> {
}
