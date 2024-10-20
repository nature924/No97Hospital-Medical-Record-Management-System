package com.dao;

import com.entity.ChuyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuyuanxinxiVO;
import com.entity.view.ChuyuanxinxiView;


/**
 * 出院信息
 * 
 * @author 
 * @email 
 * @date 2023-03-14 09:34:29
 */
public interface ChuyuanxinxiDao extends BaseMapper<ChuyuanxinxiEntity> {
	
	List<ChuyuanxinxiVO> selectListVO(@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);
	
	ChuyuanxinxiVO selectVO(@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);
	
	List<ChuyuanxinxiView> selectListView(@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);

	List<ChuyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);
	
	ChuyuanxinxiView selectView(@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);
	

}
