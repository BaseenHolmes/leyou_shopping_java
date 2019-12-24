package com.leyou.controller;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.pojo.Item;
import com.leyou.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Author: Baseen
 * @Date: 2019/12/22 20:02
 **/
@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemservice;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item){
        if(item.getPrice() == null){
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        item = itemservice.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }



}
