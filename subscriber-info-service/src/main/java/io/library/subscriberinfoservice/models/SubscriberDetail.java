package io.library.subscriberinfoservice.models;

public class SubscriberDetail {
    String subscriberId;
    String subscriberName;
    String address;
    String contactNum;

    public SubscriberDetail(String subscriberId, String subscriberName, String address, String contactNum) {
        this.subscriberId = subscriberId;
        this.subscriberName = subscriberName;
        this.address = address;
        this.contactNum = contactNum;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

}
