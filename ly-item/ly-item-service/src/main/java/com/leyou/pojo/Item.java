package com.leyou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Item
 * @Description: TODO
 * @Author: Baseen
 * @Date: 2019/12/22 20:08
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String itemName;
    private Double price;
}
