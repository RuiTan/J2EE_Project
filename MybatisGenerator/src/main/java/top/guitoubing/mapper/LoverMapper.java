package top.guitoubing.mapper;

import top.guitoubing.pojo.Lover;

public interface LoverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lover record);

    int insertSelective(Lover record);

    Lover selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lover record);

    int updateByPrimaryKey(Lover record);
}