package cn.edu.cmu.vo;

import cn.edu.cmu.domain.Xm;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: jshand
 * @Date: 2018/11/4 19:47
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class XmExt extends Xm {

    private String sqStatus;
    private String sqjlId;

    private String comfirm1;
    private String comfirm2;

    private String selfPay;


    public XmExt() {
    }

    public XmExt(String xmId, String xmlx, String xmzm, String glxmmcid, String xmmc, String xmbh, Date xmkssj, Date smjssj, BigDecimal xmjlts, String xmcc, String jfly, String zjje, String xmgk, String xmzzjh, String jlmbjgmc, BigDecimal fybz, String zysm, String sfxzrs, BigDecimal jhrs, String ccxz,String xmnjxz, String yyyq, String xmzyxz, String gsyxdm, String gsyxmc, String gsxsdm, String gsxsxm, String operatorCode, Date bmjzsj,String status, String valid, Date createTime, String sqStatus, String sqjlId, String comfirm1, String comfirm2, String selfPay) {
        super(xmId, xmlx, xmzm, glxmmcid, xmmc, xmbh, xmkssj, smjssj, xmjlts, xmcc, jfly, zjje, xmgk, xmzzjh, jlmbjgmc, fybz, zysm, sfxzrs, jhrs, ccxz, xmnjxz, yyyq, xmzyxz, gsyxdm, gsyxmc, gsxsdm, gsxsxm, operatorCode, bmjzsj, status, valid, createTime);
        this.sqStatus = sqStatus;
        this.sqjlId = sqjlId;
        this.comfirm1 = comfirm1;
        this.comfirm2 = comfirm2;
        this.selfPay = selfPay;
    }

    public String getSqStatus() {
        return sqStatus;
    }

    public void setSqStatus(String sqStatus) {
        this.sqStatus = sqStatus;
    }

    public String getSqjlId() {
        return sqjlId;
    }

    public void setSqjlId(String sqjlId) {
        this.sqjlId = sqjlId;
    }

    public String getComfirm1() {
        return comfirm1;
    }

    public void setComfirm1(String comfirm1) {
        this.comfirm1 = comfirm1;
    }

    public String getComfirm2() {
        return comfirm2;
    }

    public void setComfirm2(String comfirm2) {
        this.comfirm2 = comfirm2;
    }

    public String getSelfPay() {
        return selfPay;
    }

    public void setSelfPay(String selfPay) {
        this.selfPay = selfPay;
    }

    @Override
    public String toString() {
        return "XmExt{" +
                "sqStatus='" + sqStatus + '\'' +
                ", sqjlId='" + sqjlId + '\'' +
                ", comfirm1='" + comfirm1 + '\'' +
                ", comfirm2='" + comfirm2 + '\'' +
                ", selfPay='" + selfPay + '\'' +
                '}';
    }
}
