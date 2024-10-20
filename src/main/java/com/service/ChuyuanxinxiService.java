package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuyuanxinxiView;


/**
 * 出院信息
 *
 * @author 
 * @email 
 * @date 2023-03-14 09:34:29
 */
public interface ChuyuanxinxiService extends IService<ChuyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuyuanxinxiVO> selectListVO(Wrapper<ChuyuanxinxiEntity> wrapper);
   	
   	ChuyuanxinxiVO selectVO(@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);
   	
   	List<ChuyuanxinxiView> selectListView(Wrapper<ChuyuanxinxiEntity> wrapper);
   	
   	ChuyuanxinxiView selectView(@Param("ew") Wrapper<ChuyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuyuanxinxiEntity> wrapper);
   	

}

