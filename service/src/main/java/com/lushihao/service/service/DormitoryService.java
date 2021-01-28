package com.lushihao.service.service;

import com.lushihao.service.common.Dormitory;
import com.lushihao.service.dao.DormitoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DormitoryService {

    @Resource
    private DormitoryMapper dormitoryMapper;

    /**
     * 查询所有宿舍
     *
     * @return
     */
    @Transactional
    public List<Dormitory> selectAll() {
        return dormitoryMapper.selectAll();
    }

}
