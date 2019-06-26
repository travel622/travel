package com.vip.service;

import com.vip.dao.StuDao;
import com.vip.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 周昭昭 on 2019/6/24.
 */
@Service
public class StuServiceImpl implements StuService{
    @Autowired
    private StuDao stuDao;
    @Override
    public List<Stu> selectAll() {
        return stuDao.selectAll();
    }
}
