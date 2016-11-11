package cn.codergege.packagename.dao;

public interface BaseMapper<T> {
	int deleteByPrimaryKey(String code);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
