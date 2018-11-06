package cn.edu.cmu.vo;

import cn.edu.cmu.domain.Xm;
import cn.edu.cmu.domain.XmGjdq;

import java.util.Arrays;

/**
 * @Author: jshand
 * @Date: 2018/10/22 23:33
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class XmVo {

    private Xm xm;

    private String[] gbs;

    public Xm getXm() {
        return xm;
    }

    public void setXm(Xm xm) {
        this.xm = xm;
    }

    public String[] getGbs() {
        return gbs;
    }

    public void setGbs(String[] gbs) {
        this.gbs = gbs;
    }

    @Override
    public String toString() {
        return "XmVo{" +
                "xm=" + xm +
                ", gbs=" + Arrays.toString(gbs) +
                '}';
    }
}
