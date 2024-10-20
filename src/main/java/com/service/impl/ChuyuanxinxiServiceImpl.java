package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuyuanxinxiDao;
import com.entity.ChuyuanxinxiEntity;
import com.service.ChuyuanxinxiService;
import com.entity.vo.ChuyuanxinxiVO;
import com.entity.view.ChuyuanxinxiView;

@Service("chuyuanxinxiService")
public class ChuyuanxinxiServiceImpl extends ServiceImpl<ChuyuanxinxiDao, ChuyuanxinxiEntity> implements ChuyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuyuanxinxiEntity> page = this.selectPage(
                new Query<ChuyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<ChuyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuyuanxinxiEntity> wrapper) {
		  Page<ChuyuanxinxiView> page =new Query<ChuyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuyuanxinxiVO> selectListVO(Wrapper<ChuyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuyuanxinxiVO selectVO(Wrapper<ChuyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuyuanxinxiView> selectListView(Wrapper<ChuyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuyuanxinxiView selectView(Wrapper<ChuyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
