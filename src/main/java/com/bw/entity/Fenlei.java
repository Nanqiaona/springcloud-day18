package com.bw.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

/**
 * 实体类
 */
@Getter
@Setter
@Entity
@Table(name = "t_fenlei")
public class Fenlei {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;
    private String fname;
}
