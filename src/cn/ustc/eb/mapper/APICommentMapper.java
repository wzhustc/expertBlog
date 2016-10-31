package cn.ustc.eb.mapper;

import cn.ustc.eb.po.APIComment;
import cn.ustc.eb.po.APICommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface APICommentMapper {
    int countByExample(APICommentExample example);

    int deleteByExample(APICommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(APIComment record);

    int insertSelective(APIComment record);

    List<APIComment> selectByExampleWithBLOBs(APICommentExample example);

    List<APIComment> selectByExample(APICommentExample example);

    APIComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") APIComment record, @Param("example") APICommentExample example);

    int updateByExampleWithBLOBs(@Param("record") APIComment record, @Param("example") APICommentExample example);

    int updateByExample(@Param("record") APIComment record, @Param("example") APICommentExample example);

    int updateByPrimaryKeySelective(APIComment record);

    int updateByPrimaryKeyWithBLOBs(APIComment record);

    int updateByPrimaryKey(APIComment record);
}