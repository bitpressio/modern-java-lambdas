package com.bitpress.lambdas;

public class Orc {
    private Integer iq;

    private Integer hitpoints;

    private String name;

    private String clan;

    public Orc(String name, String clan, Integer iq, Integer hitpoints) {
        this.name = name;
        this.clan = clan;
        this.iq = iq;
        this.hitpoints = hitpoints;
    }

    public String toString() {
        return "Me "+this.getName()+"! From clan "+this.getClan()+"! (HP: "+this.getHitpoints()+", IQ: "+this.getIq()+")";
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDead() {
        return this.hitpoints == 0;
    }

    public Integer getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(Integer hitpoints) {
        this.hitpoints = Math.max(0, hitpoints);
    }
}
