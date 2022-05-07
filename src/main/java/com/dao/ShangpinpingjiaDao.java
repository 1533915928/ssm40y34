package com.dao;

import com.entity.ShangpinpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinpingjiaVO;
import com.entity.view.ShangpinpingjiaView;


/**
 * 商品评价
 * 
 * @author 
 * @email 
 * @date 2022-04-16 15:13:00
 */
public interface ShangpinpingjiaDao extends BaseMapper<ShangpinpingjiaEntity> {
	
	List<ShangpinpingjiaVO> selectListVO(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
	ShangpinpingjiaVO selectVO(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
	List<ShangpinpingjiaView> selectListView(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);

	List<ShangpinpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	
	ShangpinpingjiaView selectView(@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinpingjiaEntity> wrapper);
}
