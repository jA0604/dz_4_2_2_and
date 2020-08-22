package com.androidakbar.dz_4_2_2_and;

import android.graphics.drawable.Drawable;

public class Sample {
    private String title;
    private String category;
    private Drawable image;
    private boolean checked;

    public Sample(String title, String category, Drawable image, boolean checked) {
        this.title = title;
        this.category = category;
        this.image = image;
        this.checked = checked;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Drawable getImage() {
        return image;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
