package cn.edu.cmu.vo;

import cn.edu.cmu.domain.CgTzcy;
import cn.edu.cmu.domain.CgTzjh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/1 14:45
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class CgtzjhVO {

    private CgTzjh cgTzjh;

    private List<CgTzcy> cys = new ArrayList<CgTzcy>(0);

    private String[] cfgbIds;


    public CgTzjh getCgTzjh() {
        return cgTzjh;
    }

    public void setCgTzjh(CgTzjh cgTzjh) {
        this.cgTzjh = cgTzjh;
    }

    public List<CgTzcy> getCys() {
        return cys;
    }

    public void setCys(List<CgTzcy> cys) {
        this.cys = cys;
    }

    public String[] getCfgbIds() {
        return cfgbIds;
    }

    public void setCfgbIds(String[] cfgbIds) {
        this.cfgbIds = cfgbIds;
    }

    @Override
    public String toString() {
        return "CgtzjhVO{" +
                "cgTzjh=" + cgTzjh +
                ", cys=" + cys +
                ", cfgbIds=" + Arrays.toString(cfgbIds) +
                '}';
    }
}
