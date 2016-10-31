package cn.ustc.eb.mapper;

import cn.ustc.eb.po.APIContent;
import cn.ustc.eb.po.APIContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface APIContentMapper {
    int countByExample(APIContentExample example);

    int deleteByExample(APIContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(APIContent record);

    int insertSelective(APIContent record);

    List<APIContent> selectByExample(APIContentExample example);

    APIContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") APIContent record, @Param("example") APIContentExample example);

    int updateByExample(@Param("record") APIContent record, @Param("example") APIContentExample example);

    int updateByPrimaryKeySelective(APIContent record);

    int updateByPrimaryKey(APIContent record);
}