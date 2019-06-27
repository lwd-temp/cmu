package cn.edu.cmu.vo;
import cn.edu.cmu.domain.WbjdSq;
import java.math.BigDecimal;
import java.util.Date;


public class WbjdZjVo extends WbjdSq {

    private String zjid;
    private String writed;

    public WbjdZjVo() {
    }

    public WbjdZjVo(String lfid, String dbtmc, BigDecimal lfrs, Date lfsjStart, Date lfsjEnd, Date tlsjStart, Date tlsjEnd, String lfmd, String lfmdQt, String yjtm, String yqxx, String jfly, String lp, BigDecimal lpsl, String qkjl, String fwcg, String tzxm, String tzgj, String tzxb, Date tzcsrq, String tzgzdw, String tzzc, String tzzw, String tzzy, String tzxsly, String yqcg, String zqrxm, String zqrdh, String zqlxrxm, String zqlxrdh, String jdbm, String ynYqxld, String ynXyty, String ynBbssgabm, String ynBbssxcbm, String jdlx, String status, String memo, String valid, Date createTime, String zjid, String writed,String operator) {
        super(lfid, dbtmc, lfrs,  lfsjStart, lfsjEnd,  tlsjStart, tlsjEnd,lfmd, lfmdQt,  yjtm,  yqxx,  jfly,  lp, lpsl,  qkjl, fwcg, tzxm,  tzgj,  tzxb,  tzcsrq, tzgzdw,  tzzc, tzzw,  tzzy,  tzxsly,  yqcg,  zqrxm, zqrdh,  zqlxrxm,  zqlxrdh,  jdbm,  ynYqxld,  ynXyty,  ynBbssgabm,  ynBbssxcbm,  jdlx,  status,  memo,  valid, createTime, operator);
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
