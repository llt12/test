package org.yanqun.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yanqun.entity.Cardinfo;

public interface CardinfoMapper {


    int insert(Cardinfo record);

    int insertSelective(Cardinfo record);



}