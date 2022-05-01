package org.yanqun.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yanqun.entity.Studentclass;

public interface StudentclassMapper {

    int deleteByPrimaryKey(BigDecimal classid);

    int insert(Studentclass record);

    int insertSelective(Studentclass record);

    Studentclass selectByPrimaryKey(BigDecimal classid);

    int updateByPrimaryKeySelective(Studentclass record);

    int updateByPrimaryKey(Studentclass record);
}