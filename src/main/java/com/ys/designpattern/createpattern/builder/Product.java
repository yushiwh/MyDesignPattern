package com.ys.designpattern.createpattern.builder;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author jingbin
 * @date 2020-01-31
 * 产品类
 */
@Slf4j
@Data
public class Product {

    private String name;
    private String type;

    public void showProduct() {

        log.info(String.join("---", "名称：" + name));
        log.info(String.join("---", "型号：" + type));
    }


}
