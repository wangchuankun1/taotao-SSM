package com.kun.service;

import com.kun.common.pojo.EUDataGridResult;
import com.kun.common.pojo.TaotaoResult;
import com.kun.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
