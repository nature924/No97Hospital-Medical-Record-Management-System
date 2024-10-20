package com.entity.view;

import com.entity.ChuyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出院信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-14 09:34:29
 */
@TableName("chuyuanxinxi")
public class ChuyuanxinxiView  extends ChuyuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuyuanxinxiView(){
	}
 
 	public ChuyuanxinxiView(ChuyuanxinxiEntity chuyuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chuyuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
