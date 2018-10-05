package cn.edu.cmu.vo;

import cn.edu.cmu.domain.HySbrymd;
import cn.edu.cmu.domain.HyShenb;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/4 16:27
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class HysbVO {

    private HyShenb hysb;

    private List<HySbrymd> chrys = new ArrayList<HySbrymd>(0);

    public HyShenb getHysb() {
        return hysb;
    }

    public void setHysb(HyShenb hysb) {
        this.hysb = hysb;
    }

    public List<HySbrymd> getChrys() {
        return chrys;
    }

    public void setChrys(List<HySbrymd> chrys) {
        this.chrys = chrys;
    }
}
