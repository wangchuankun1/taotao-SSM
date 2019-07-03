package com.kun.service.impl;

import com.kun.mapper.TbItemCatMapper;
import com.kun.pojo.TbItemCat;
import com.kun.pojo.TbItemCatExample;
import com.kun.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chuankun on 2018/11/12.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<TbItemCat> getItemCatList(Long parentId) throws Exception {
        TbItemCatExample example = new TbItemCatExample();
        // 设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
        // 根据parentid查询子节点
        criteria.andParentIdEqualTo(parentId);
        // 返回子节点列表
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        return list;
    }
}
