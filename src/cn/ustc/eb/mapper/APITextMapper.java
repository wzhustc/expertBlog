package cn.ustc.eb.mapper;

import cn.ustc.eb.po.APIText;
import cn.ustc.eb.po.APITextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface APITextMapper {
    int countByExample(APITextExample example);

    int deleteByExample(APITextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(APIText record);

    int insertSelective(APIText record);

    List<APIText> selectByExampleWithBLOBs(APITextExample example);

    List<APIText> selectByExample(APITextExample example);

    APIText selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") APIText record, @Param("example") APITextExample example);

    int updateByExampleWithBLOBs(@Param("record") APIText record, @Param("example") APITextExample example);

    int updateByExample(@Param("record") APIText record, @Param("example") APITextExample example);

    int updateByPrimaryKeySelective(APIText record);

    int updateByPrimaryKeyWithBLOBs(APIText record);

    int updateByPrimaryKey(APIText record);
}