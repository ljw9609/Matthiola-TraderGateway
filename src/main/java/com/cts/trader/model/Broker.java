package com.cts.trader.model;

import javax.persistence.*;

@Entity
@Table(name = "Broker")
public class Broker {
    @Id
    @Column(nullable = false, name = "broker_id")
    private String brokerID;

    @Column(nullable = false, name = "broker_name")
    private String brokerName;

    @Column(name = "broker_ip")
    private String brokerIp;

    @Column(name = "broker_token")
    private String brokerToken;

    public Broker() {}

    public Broker(String brokerID, String brokerName, String brokerIp, String brokerToken) {
        this.brokerID = brokerID;
        this.brokerName = brokerName;
        this.brokerIp = brokerIp;
        this.brokerToken = brokerToken;
    }

    public String getBrokerID() {
        return brokerID;
    }

    public void setBrokerID(String brokerID) {
        this.brokerID = brokerID;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerIp() {
        return brokerIp;
    }

    public void setBrokerIp(String brokerIp) {
        this.brokerIp = brokerIp;
    }

    public String getBrokerToken() {
        return brokerToken;
    }

    public void setBrokerToken(String brokerToken) {
        this.brokerToken = brokerToken;
    }
}