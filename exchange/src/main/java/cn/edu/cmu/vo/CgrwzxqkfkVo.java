package cn.edu.cmu.vo;

import cn.edu.cmu.domain.CgDqcgj;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: jshand
 * @Date: 2018/10/12 16:52
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class CgrwzxqkfkVo extends CgDqcgj {

    private String zjid;
    private String writed;
    private String ssejdwmc;

    public CgrwzxqkfkVo() {
    }

    public CgrwzxqkfkVo(String cgid, String cglx, String xm, String xb, Date csrq, String csd, String hjszd, String sfzh, String ssejdw, String ks, String zw,
                        String zc, String lxdh, String email, BigDecimal nncfcs, String qtshrz, String cfgj, String rjcs, String tzid, Date cfksrq, Date cfjsrq,
                        String cfmd, String cfmdQt, String yqrXm, String yqrZw, String yqrDw, String yqrXxdz, String yqrDh, String yqrXmEn, String yqrZwEn,
                        String yqrDwEn, String yqrXxdzEn, String yqrDhEn, String jfly, String jfysmx, BigDecimal jfyshj, String sqbsm, Date sqrq, String status,
                        String shjg, String shry, String shyj, Date shrq, String gdwjid, String cfzjbgid, String valid, Date createTime, String zjid,
                        String writed,String ssejdwmc,String operator,String ysfbjzljj, String cfrwjj, String cfyy, String cfgsxxbid,String cfrcbid, String cfsc,
                        String yqhid, String ysqfyjid, String cgrwhysspyjbid, String xnsqbid, String jflydsf, String sfxd) {

          super(cgid,  cglx, xm,  xb,csrq,  csd,  hjszd,  sfzh,  ssejdw, ks, zw, zc, lxdh,  email,  nncfcs, qtshrz, cfgj,
                rjcs, tzid, cfksrq,  cfjsrq,  cfmd,  cfmdQt, yqrXm,  yqrZw,yqrDw, yqrXxdz, yqrDh, yqrXmEn,  yqrZwEn, yqrDwEn,
                yqrXxdzEn, yqrDhEn, jfly,  jfysmx,  jfyshj,  sqbsm,  sqrq,  status,  shjg, shry,shyj, shrq, gdwjid, cfzjbgid,
                valid,createTime,operator,ysfbjzljj, cfrwjj, cfyy, cfgsxxbid,cfrcbid, cfsc, yqhid,ysqfyjid,cgrwhysspyjbid, xnsqbid ,jflydsf ,sfxd);

        this.zjid = zjid;
        this.writed = writed;
        this.ssejdwmc = ssejdwmc;
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

    public String getSsejdwmc() {
        return ssejdwmc;
    }

    public void setSsejdwmc(String ssejdwmc) {
        this.ssejdwmc = ssejdwmc;
    }

}
