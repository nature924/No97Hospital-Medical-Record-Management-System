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


import com.dao.BingrenDao;
import com.entity.BingrenEntity;
import com.service.BingrenService;
import com.entity.vo.BingrenVO;
import com.entity.view.BingrenView;

@Service("bingrenService")
public class BingrenServiceImpl extends ServiceImpl<BingrenDao, BingrenEntity> implements BingrenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingrenEntity> page = this.selectPage(
                new Query<BingrenEntity>(params).getPage(),
                new EntityWrapper<BingrenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingrenEntity> wrapper) {
		  Page<BingrenView> page =new Query<BingrenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingrenVO> selectListVO(Wrapper<BingrenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingrenVO selectVO(Wrapper<BingrenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingrenView> selectListView(Wrapper<BingrenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingrenView selectView(Wrapper<BingrenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
