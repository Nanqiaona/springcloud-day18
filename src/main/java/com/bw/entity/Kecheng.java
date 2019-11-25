package com.bw.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 实体类
 */
@Getter
@Setter
@Entity
@Table(name = "t_kecheng")
public class Kecheng {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer status;
    private double price;
    private String pic;

    @Override
    public String toString() {
        return "Kecheng{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                '}';
    }
}
