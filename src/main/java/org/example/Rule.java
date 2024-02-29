package org.example;

import java.util.Date;
import java.util.Objects;

public class Rule {

    private String ruleUid;
    private String caseUid;
    private String alan;
    private String operator;
    private String deger;
    private String olumlu;
    private String kulkod;
    private Date gmt;

    public String getRuleUid() {
        return ruleUid;
    }

    public void setRuleUid(String ruleUid) {
        this.ruleUid = ruleUid;
    }

    public String getCaseUid() {
        return caseUid;
    }

    public void setCaseUid(String caseUid) {
        this.caseUid = caseUid;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    public String getOlumlu() {
        return olumlu;
    }

    public void setOlumlu(String olumlu) {
        this.olumlu = olumlu;
    }

    public String getKulkod() {
        return kulkod;
    }

    public void setKulkod(String kulkod) {
        this.kulkod = kulkod;
    }

    public Date getGmt() {
        return gmt;
    }

    public void setGmt(Date gmt) {
        this.gmt = gmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule rule = (Rule) o;
        return Objects.equals(getRuleUid(), rule.getRuleUid()) && Objects.equals(getGmt(), rule.getGmt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRuleUid(), getGmt());
    }

    @Override
    public String toString() {
        return "Rule{" +
                "ruleUid='" + ruleUid + '\'' +
                ", caseUid='" + caseUid + '\'' +
                ", alan='" + alan + '\'' +
                ", operator='" + operator + '\'' +
                ", deger='" + deger + '\'' +
                ", olumlu='" + olumlu + '\'' +
                ", kulkod='" + kulkod + '\'' +
                ", gmt=" + gmt +
                '}';
    }
}
