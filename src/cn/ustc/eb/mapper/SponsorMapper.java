package cn.ustc.eb.mapper;

import cn.ustc.eb.po.Sponsor;
import cn.ustc.eb.po.SponsorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SponsorMapper {
    int countByExample(SponsorExample example);

    int deleteByExample(SponsorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sponsor record);

    int insertSelective(Sponsor record);

    List<Sponsor> selectByExample(SponsorExample example);

    Sponsor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByExample(@Param("record") Sponsor record, @Param("example") SponsorExample example);

    int updateByPrimaryKeySelective(Sponsor record);

    int updateByPrimaryKey(Sponsor record);
}