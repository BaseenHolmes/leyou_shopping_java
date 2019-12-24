package com.leyou.service;

import com.leyou.pojo.Item;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ItemService
 * @Description: TODO
 * @Author: Baseen
 * @Date: 2019/12/22 20:07
 **/
@Service
public class ItemService {

    public Item saveItem(Item item){
        Item newItem = new Item();
        newItem.setItemName(item.getItemName());
        newItem.setPrice(item.getPrice());
        return newItem;
    }

}
