package cn.edu.cmu.vo;

import cn.edu.cmu.domain.HyJh;
import cn.edu.cmu.domain.HyRymd;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/4 16:27
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class HyjhVO {

    private HyJh hyJh;

    private List<HyRymd> chrys = new ArrayList<HyRymd>(0);


    public HyJh getHyJh() {
        return hyJh;
    }

    public void setHyJh(HyJh hyJh) {
        this.hyJh = hyJh;
    }

    public List<HyRymd> getChrys() {
        return chrys;
    }

    public void setChrys(List<HyRymd> chrys) {
        this.chrys = chrys;
    }
}
