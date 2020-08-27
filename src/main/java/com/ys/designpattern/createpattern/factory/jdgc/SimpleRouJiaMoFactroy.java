package com.ys.designpattern.createpattern.factory.jdgc;

/**
 * 简单工厂模式
 *
 * @author nick
 */
public class SimpleRouJiaMoFactroy {

    /**
     * 创建肉夹馍
     *
     * @param type
     * @return
     */
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("suan")) {
            rouJiaMo = new SuanRouJiaMo();
        }

        if (type.equals("tian")) {
            rouJiaMo = new TianRouJiaMo();
        }
        if (type.equals("la")) {
            rouJiaMo = new LanRouJiaMo();
        }

        return rouJiaMo;
    }

}
