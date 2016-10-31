package cn.ustc.eb.mapper;

import cn.ustc.eb.po.Mood;
import cn.ustc.eb.po.MoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoodMapper {
    int countByExample(MoodExample example);

    int deleteByExample(MoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mood record);

    int insertSelective(Mood record);

    List<Mood> selectByExampleWithBLOBs(MoodExample example);

    List<Mood> selectByExample(MoodExample example);

    Mood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mood record, @Param("example") MoodExample example);

    int updateByExampleWithBLOBs(@Param("record") Mood record, @Param("example") MoodExample example);

    int updateByExample(@Param("record") Mood record, @Param("example") MoodExample example);

    int updateByPrimaryKeySelective(Mood record);

    int updateByPrimaryKeyWithBLOBs(Mood record);

    int updateByPrimaryKey(Mood record);
}