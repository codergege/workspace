package cn.codergege.packagename.model;

import java.io.Serializable;

public class BmGxdwTwo implements Serializable {
    private String code;

    private String content;

    private String sjcode;

    private String lv;

    private static final long serialVersionUID = 1L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSjcode() {
        return sjcode;
    }

    public void setSjcode(String sjcode) {
        this.sjcode = sjcode == null ? null : sjcode.trim();
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv == null ? null : lv.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", content=").append(content);
        sb.append(", sjcode=").append(sjcode);
        sb.append(", lv=").append(lv);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BmGxdwTwo other = (BmGxdwTwo) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getSjcode() == null ? other.getSjcode() == null : this.getSjcode().equals(other.getSjcode()))
            && (this.getLv() == null ? other.getLv() == null : this.getLv().equals(other.getLv()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getSjcode() == null) ? 0 : getSjcode().hashCode());
        result = prime * result + ((getLv() == null) ? 0 : getLv().hashCode());
        return result;
    }
}