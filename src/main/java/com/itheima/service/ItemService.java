package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemService {

    public List<Items> getItemlist();

    public Items getItemById(Integer id);

    public void updateItem(Items items);

}
