package com.kun.service;

import com.kun.pojo.TbItemCat;

import java.util.List;

/**
 * Created by chuankun on 2018/11/12.
 */
public interface ItemCatService {
    public List<TbItemCat> getItemCatList(Long parentId) throws Exception;
}
