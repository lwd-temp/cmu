package cn.edu.cmu.vo;

import cn.edu.cmu.domain.HyJh;

/**
 * @Author: jshand
 * @Date: 2018/10/16 21:31
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class HytjVo extends HyJh {

    private String sbid; //申报id
    private String zjid; //总结id
    private String sfzxjh; //是否执行计划
    private String sfzj; //是否总结

    public String getSbid() {
        return sbid;
    }

    public void setSbid(String sbid) {
        this.sbid = sbid;
    }

    public String getSfzxjh() {
        return sfzxjh;
    }

    public void setSfzxjh(String sfzxjh) {
        this.sfzxjh = sfzxjh;
    }

    public String getSfzj() {
        return sfzj;
    }

    public void setSfzj(String sfzj) {
        this.sfzj = sfzj;
    }

    public String getZjid() {
        return zjid;
    }

    public void setZjid(String zjid) {
        this.zjid = zjid;
    }

    @Override
    public String toString() {
        return "HytjVo{" +
                "sbid='" + sbid + '\'' +
                ", zjid='" + zjid + '\'' +
                ", sfzxjh='" + sfzxjh + '\'' +
                ", sfzj='" + sfzj + '\'' +
                '}'+super.toString();
    }
}
