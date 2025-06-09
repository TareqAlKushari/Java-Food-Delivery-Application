package com.example.foodatorapp.Domain;

public class CategoryDomain {
    private String title;
    private String pio;

    public CategoryDomain() {
    }

    public CategoryDomain(String title, String pio) {
        this.title = title;
        this.pio = pio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPio() {
        return pio;
    }

    public void setPio(String pio) {
        this.pio = pio;
    }


}
