package com.sourabh.elepy.model;

import com.elepy.annotations.*;

@RestModel(name = "Products",slug = "/products")
public class Product {

    private String id;
    private String title;

    @PrettyName("Introduction")
    @Text
    private String intro;

    @PrettyName("Banner Image")
    @FileReference(allowedMimeType = "image/*")
    private String bannerImage;

    @Text()
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
