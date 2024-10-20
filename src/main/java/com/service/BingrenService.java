package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingrenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingrenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingrenView;


/**
 * 病人
 *
 * @author 
 * @email 
 * @date 2023-03-14 09:34:29
 */
public interface BingrenService extends IService<BingrenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingrenVO> selectListVO(Wrapper<BingrenEntity> wrapper);
   	
   	BingrenVO selectVO(@Param("ew") Wrapper<BingrenEntity> wrapper);
   	
   	List<BingrenView> selectListView(Wrapper<BingrenEntity> wrapper);
   	
   	BingrenView selectView(@Param("ew") Wrapper<BingrenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingrenEntity> wrapper);
   	

}

