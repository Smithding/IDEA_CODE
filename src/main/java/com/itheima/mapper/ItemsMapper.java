package com.itheima.mapper;

import com.itheima.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * s
 */
@Repository
public interface ItemsMapper {

    public List<Items> selectByExample();

    public Items findItemsById(Integer id);

    public List<Items> finditemsByName(String name);

    public void insertItems(Items items);
}
