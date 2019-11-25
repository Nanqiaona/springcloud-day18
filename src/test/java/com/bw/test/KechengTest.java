package com.bw.test;

import com.bw.dao.FenleiRepsitory;
import com.bw.dao.KechengRepsitory;
import com.bw.entity.Fenlei;
import com.bw.entity.Kecheng;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class KechengTest {
    @Autowired
    private KechengRepsitory kechengRepsitory;
    @Autowired
    private FenleiRepsitory fenleiRepsitory;

    /**
     * 列表
     */
    @Test
    public void getlist(){
        Pageable pageable = PageRequest.of(0, 2);
        Page<Kecheng> all = kechengRepsitory.findAll(pageable);
        System.out.println(all.getContent());
        System.out.println(all.getTotalPages()+"总页数");
    }

    /**
     * 增加
     */
    @Test
    public void save(){
        Fenlei fenlei = new Fenlei();
        fenlei.setFname("文科");
        fenleiRepsitory.save(fenlei);

        Kecheng kecheng = new Kecheng();
        kecheng.setName("语文");
        kecheng.setPrice(99.91);
        kecheng.setStatus(1);
        kechengRepsitory.save(kecheng);
        System.out.println("-----------------插入成功");
    }

    /**
     * 模糊
     */
    @Test
    public void getlike(){
        Optional<Kecheng> byId = kechengRepsitory.findById(1);
        System.out.println(byId.get());
    }

    /**
     * 修改
     */
    @Test
    public void update(){
        Kecheng kecheng = new Kecheng();
        kecheng.setName("数学");
        kecheng.setId(1);
        kecheng.setPrice(99.91);
        kecheng.setStatus(1);
        kechengRepsitory.save(kecheng);
        System.out.println("-----------------修改成功");
    }

    /**
     * 删除
     */
    @Test
    public void delete(){
        kechengRepsitory.deleteById(1);
        System.out.println("-----------------删除成功");
    }
}
