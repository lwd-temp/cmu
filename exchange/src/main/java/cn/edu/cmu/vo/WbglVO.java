package cn.edu.cmu.vo;
import cn.edu.cmu.domain.WbjdSq;
import cn.edu.cmu.domain.WbjdSxry;
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
public class WbglVO {

    private WbjdSq wbjdSq;

    private List<WbjdSxry> sxr = new ArrayList<WbjdSxry>(0);

    private String[] cfgbIds;


    public WbjdSq getWbjdSq() {
        return wbjdSq;
    }

    public void setWbjdSq(WbjdSq wbjdSq) {
        this.wbjdSq = wbjdSq;
    }

    public List<WbjdSxry> getSxr() {
        return sxr;
    }

    public void setSxr(List<WbjdSxry> sxr) {
        this.sxr = sxr;
    }

    public String[] getCfgbIds() {
        return cfgbIds;
    }

    public void setCfgbIds(String[] cfgbIds) {
        this.cfgbIds = cfgbIds;
    }

    @Override
    public String toString() {
        return "WbglVO{" +
                "wbjdSq=" + wbjdSq +
                ", sxr=" + sxr +
                ", cfgbIds=" + Arrays.toString(cfgbIds) +
                '}';
    }
}
