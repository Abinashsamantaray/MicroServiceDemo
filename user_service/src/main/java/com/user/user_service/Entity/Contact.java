package com.user.user_service.Entity;

public class Contact {
         private Long cid;
         private String email;
         private String contactName;
         private Long userid;

    public Contact(Long cid, String email, String contactName, Long userid) {
        this.cid = cid;
        this.email = email;
        this.contactName = contactName;
        this.userid = userid;
    }

    public Contact() {
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
