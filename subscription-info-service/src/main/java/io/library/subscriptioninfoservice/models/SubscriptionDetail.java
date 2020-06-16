package io.library.subscriptioninfoservice.models;

import java.util.Date;

public class SubscriptionDetail {

    String subscriberId;
    String bookId;
    Date borrowedOn;
    SubscriberDetail subscriberDetail;
    BookDetail bookDetail;

    public SubscriptionDetail(String subscriberId, String bookId, Date borrowedOn) {
        this.subscriberId = subscriberId;
        this.bookId = bookId;
        this.borrowedOn = borrowedOn;
    }

    public SubscriptionDetail(String subscriberId, String bookId, Date borrowedOn, SubscriberDetail subscriberDetail, BookDetail bookDetail) {
        this.subscriberId = subscriberId;
        this.bookId = bookId;
        this.borrowedOn = borrowedOn;
        this.subscriberDetail = subscriberDetail;
        this.bookDetail = bookDetail;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getBorrowedOn() {
        return borrowedOn;
    }

    public void setBorrowedOn(Date borrowedOn) {
        this.borrowedOn = borrowedOn;
    }

    public SubscriberDetail getSubscriberDetail() {
        return subscriberDetail;
    }

    public void setSubscriberDetail(SubscriberDetail subscriberDetail) {
        this.subscriberDetail = subscriberDetail;
    }

    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }
}
