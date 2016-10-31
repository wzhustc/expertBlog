package cn.ustc.eb.mapper;

import cn.ustc.eb.po.APICategory;
import cn.ustc.eb.po.APICategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface APICategoryMapper {
    int countByExample(APICategoryExample example);

    int deleteByExample(APICategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(APICategory record);

    int insertSelective(APICategory record);

    List<APICategory> selectByExample(APICategoryExample example);

    APICategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") APICategory record, @Param("example") APICategoryExample example);

    int updateByExample(@Param("record") APICategory record, @Param("example") APICategoryExample example);

    int updateByPrimaryKeySelective(APICategory record);

    int updateByPrimaryKey(APICategory record);
}