package com.kun.service;

import com.kun.common.pojo.TaotaoResult;
import com.kun.pojo.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
