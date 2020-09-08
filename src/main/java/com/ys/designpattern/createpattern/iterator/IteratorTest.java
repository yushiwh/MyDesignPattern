package com.ys.designpattern.createpattern.iterator;


import lombok.extern.slf4j.Slf4j;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * <p>
 * 主要解决：不同的方式来遍历整个整合对象。
 */
@Slf4j
public class IteratorTest {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
                String name =(String) iterator.next();
                log.info(String.join("----------",name));
        }
    }
}
