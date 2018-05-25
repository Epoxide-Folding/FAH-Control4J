
package org.epoxide.fahcontrol.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SlotInfo {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("project")
    @Expose
    private int project;
    @SerializedName("run")
    @Expose
    private int run;
    @SerializedName("clone")
    @Expose
    private int clone;
    @SerializedName("gen")
    @Expose
    private int gen;
    @SerializedName("core")
    @Expose
    private String core;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("percentdone")
    @Expose
    private String percentdone;
    @SerializedName("eta")
    @Expose
    private String eta;
    @SerializedName("ppd")
    @Expose
    private String ppd;
    @SerializedName("creditestimate")
    @Expose
    private String creditestimate;
    @SerializedName("waitingon")
    @Expose
    private String waitingon;
    @SerializedName("nextattempt")
    @Expose
    private String nextattempt;
    @SerializedName("timeremaining")
    @Expose
    private String timeremaining;
    @SerializedName("totalframes")
    @Expose
    private int totalframes;
    @SerializedName("framesdone")
    @Expose
    private int framesdone;
    @SerializedName("assigned")
    @Expose
    private String assigned;
    @SerializedName("timeout")
    @Expose
    private String timeout;
    @SerializedName("deadline")
    @Expose
    private String deadline;
    @SerializedName("ws")
    @Expose
    private String ws;
    @SerializedName("cs")
    @Expose
    private String cs;
    @SerializedName("attempts")
    @Expose
    private int attempts;
    @SerializedName("slot")
    @Expose
    private String slot;
    @SerializedName("tpf")
    @Expose
    private String tpf;
    @SerializedName("basecredit")
    @Expose
    private String basecredit;

    public String getId () {

        return this.id;
    }

    public void setId (String id) {

        this.id = id;
    }

    public String getState () {

        return this.state;
    }

    public void setState (String state) {

        this.state = state;
    }

    public String getError () {

        return this.error;
    }

    public void setError (String error) {

        this.error = error;
    }

    public int getProject () {

        return this.project;
    }

    public void setProject (int project) {

        this.project = project;
    }

    public int getRun () {

        return this.run;
    }

    public void setRun (int run) {

        this.run = run;
    }

    public int getClone () {

        return this.clone;
    }

    public void setClone (int clone) {

        this.clone = clone;
    }

    public int getGen () {

        return this.gen;
    }

    public void setGen (int gen) {

        this.gen = gen;
    }

    public String getCore () {

        return this.core;
    }

    public void setCore (String core) {

        this.core = core;
    }

    public String getUnit () {

        return this.unit;
    }

    public void setUnit (String unit) {

        this.unit = unit;
    }

    public String getPercentdone () {

        return this.percentdone;
    }

    public void setPercentdone (String percentdone) {

        this.percentdone = percentdone;
    }

    public String getEta () {

        return this.eta;
    }

    public void setEta (String eta) {

        this.eta = eta;
    }

    public String getPpd () {

        return this.ppd;
    }

    public void setPpd (String ppd) {

        this.ppd = ppd;
    }

    public String getCreditestimate () {

        return this.creditestimate;
    }

    public void setCreditestimate (String creditestimate) {

        this.creditestimate = creditestimate;
    }

    public String getWaitingon () {

        return this.waitingon;
    }

    public void setWaitingon (String waitingon) {

        this.waitingon = waitingon;
    }

    public String getNextattempt () {

        return this.nextattempt;
    }

    public void setNextattempt (String nextattempt) {

        this.nextattempt = nextattempt;
    }

    public String getTimeremaining () {

        return this.timeremaining;
    }

    public void setTimeremaining (String timeremaining) {

        this.timeremaining = timeremaining;
    }

    public int getTotalframes () {

        return this.totalframes;
    }

    public void setTotalframes (int totalframes) {

        this.totalframes = totalframes;
    }

    public int getFramesdone () {

        return this.framesdone;
    }

    public void setFramesdone (int framesdone) {

        this.framesdone = framesdone;
    }

    public String getAssigned () {

        return this.assigned;
    }

    public void setAssigned (String assigned) {

        this.assigned = assigned;
    }

    public String getTimeout () {

        return this.timeout;
    }

    public void setTimeout (String timeout) {

        this.timeout = timeout;
    }

    public String getDeadline () {

        return this.deadline;
    }

    public void setDeadline (String deadline) {

        this.deadline = deadline;
    }

    public String getWs () {

        return this.ws;
    }

    public void setWs (String ws) {

        this.ws = ws;
    }

    public String getCs () {

        return this.cs;
    }

    public void setCs (String cs) {

        this.cs = cs;
    }

    public int getAttempts () {

        return this.attempts;
    }

    public void setAttempts (int attempts) {

        this.attempts = attempts;
    }

    public String getSlot () {

        return this.slot;
    }

    public void setSlot (String slot) {

        this.slot = slot;
    }

    public String getTpf () {

        return this.tpf;
    }

    public void setTpf (String tpf) {

        this.tpf = tpf;
    }

    public String getBasecredit () {

        return this.basecredit;
    }

    public void setBasecredit (String basecredit) {

        this.basecredit = basecredit;
    }
}