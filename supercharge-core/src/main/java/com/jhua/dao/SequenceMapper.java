package com.jhua.dao;

import com.jhua.dao.example.SequenceExample;
import com.jhua.model.Sequence;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SequenceMapper {
    long countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    Sequence selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);
}