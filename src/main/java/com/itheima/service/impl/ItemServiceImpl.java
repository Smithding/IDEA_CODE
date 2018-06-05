package com.itheima.service.impl;


import com.itheima.mapper.ItemsMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Items;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ItemServiceImpl implements  ItemService {

    @Autowired
    private ItemsMapper itemsMapper;


    //查询所有商品
    @Override
    public List<Items> getItemlist() {
        return (List<Items>) itemsMapper.selectByExample();
    }

    //根据id查询商品
    @Override
    public Items getItemById(Integer id) {
        return itemsMapper.findItemsById(id);
    }

    //修改数据
    @Override
    public void updateItem(Items items) {
         itemsMapper.findupdateItems(items);
    }


}
