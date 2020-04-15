package com.example.mymail;

public class ContactModel {
    String fullname;
    int avaResource;
    boolean isSelected;

    public ContactModel(String fullname, int avaResource) {
        this.fullname = fullname;
        this.avaResource = avaResource;
        this.isSelected = false;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAvaResource() {
        return avaResource;
    }

    public void setAvaResource(int avaResource) {
        this.avaResource = avaResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
