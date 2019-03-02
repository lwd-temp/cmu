package cn.edu.cmu.vo;

import cn.edu.cmu.domain.HyShenb;

import java.util.Date;

/**
 * @Author: jshand
 * @Date: 2018/10/12 16:52
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class HyShenbVo extends HyShenb {

    private String zjid;
    private String writed;

    public HyShenbVo() {
    }

    public HyShenbVo(String sbid, String jhid, String hylx, String hymc, String hymcEn, String hybh, Date jxrqKs, Date jxrqJs, String zbdw, String cbdw, String dd, String hyjbxx, String hygm, String bjjbyx, String jfly, String fzrxm, String fzrdh, String bgtm, String bgnr,String sfbb, String operator, String status, String valid, Date createTime, String zjid,String writed) {

        super(sbid, jhid, hylx, hymc, hymcEn, hybh, jxrqKs, jxrqJs, zbdw, cbdw, dd, hyjbxx, hygm, bjjbyx, jfly, fzrxm, fzrdh, bgtm, bgnr, sfbb, operator, status, valid, createTime);
        this.zjid = zjid;
        this.writed = writed;
    }

    public String getZjid() {
        return zjid;
    }

    public void setZjid(String zjid) {
        this.zjid = zjid;
    }

    public String getWrited() {
        return writed;
    }

    public void setWrited(String writed) {
        this.writed = writed;
    }
}
