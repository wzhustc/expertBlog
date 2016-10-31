package cn.ustc.eb.mapper;

import cn.ustc.eb.po.MoodComment;
import cn.ustc.eb.po.MoodCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoodCommentMapper {
    int countByExample(MoodCommentExample example);

    int deleteByExample(MoodCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MoodComment record);

    int insertSelective(MoodComment record);

    List<MoodComment> selectByExampleWithBLOBs(MoodCommentExample example);

    List<MoodComment> selectByExample(MoodCommentExample example);

    MoodComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MoodComment record, @Param("example") MoodCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") MoodComment record, @Param("example") MoodCommentExample example);

    int updateByExample(@Param("record") MoodComment record, @Param("example") MoodCommentExample example);

    int updateByPrimaryKeySelective(MoodComment record);

    int updateByPrimaryKeyWithBLOBs(MoodComment record);

    int updateByPrimaryKey(MoodComment record);
}