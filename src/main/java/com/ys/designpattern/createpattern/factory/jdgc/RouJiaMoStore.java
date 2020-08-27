package com.ys.designpattern.createpattern.factory.jdgc;

import lombok.extern.slf4j.Slf4j;

/**
 * 肉夹馍店
 * @author nick
 */
@Slf4j
public class RouJiaMoStore {
    private SimpleRouJiaMoFactroy simpleRouJiaMoFactroy;

    public RouJiaMoStore(SimpleRouJiaMoFactroy simpleRouJiaMoFactroy) {
        this.simpleRouJiaMoFactroy = simpleRouJiaMoFactroy;
    }


    public RouJiaMo sellRouJiaMo(String type){
        RouJiaMo rouJiaMo = simpleRouJiaMoFactroy.createRouJiaMo(type);
        log.info("肉夹馍名称："+rouJiaMo.name);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }





}
