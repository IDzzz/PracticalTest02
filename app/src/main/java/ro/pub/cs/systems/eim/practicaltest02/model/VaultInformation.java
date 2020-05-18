package ro.pub.cs.systems.eim.practicaltest02.model;

import java.util.Date;

public class VaultInformation {

    private String code;
    private String rate;
    private String description;
    private Date updated;

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public VaultInformation(String code, String rate, String description, Date updated) {
        this.code = code;
        this.rate = rate;
        this.description = description;
        this.updated = updated;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "VaultInformation{" +
                "code='" + code+ '\'' +
                ", rate='" + rate+ '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
