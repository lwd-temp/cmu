package cn.edu.cmu.vo;

import cn.edu.cmu.domain.Xm;

/**
 * @Author: jshand
 * @Date: 2018/10/22 23:33
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class XmVo {

    private Xm xm;

    public Xm getXm() {
        return xm;
    }

    public void setXm(Xm xm) {
        this.xm = xm;
    }

    @Override
    public String toString() {
        return "XmVo{" +
                "xm=" + xm +
                '}';
    }
}
