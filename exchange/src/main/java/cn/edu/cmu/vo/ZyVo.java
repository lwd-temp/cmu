package cn.edu.cmu.vo;

/**
 * @Author: jshand
 * @Date: 2018/11/4 11:22
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class ZyVo {
    private String zyh;
    private String zymc;


    public ZyVo() {
    }

    public ZyVo(String zyh, String zymc) {
        this.zyh = zyh;
        this.zymc = zymc;
    }

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh;
    }

    public String getZymc() {
        return zymc;
    }

    public void setZymc(String zymc) {
        this.zymc = zymc;
    }

    @Override
    public String toString() {
        return "ZyVo{" +
                "zyh='" + zyh + '\'' +
                ", zymc='" + zymc + '\'' +
                '}';
    }
}
