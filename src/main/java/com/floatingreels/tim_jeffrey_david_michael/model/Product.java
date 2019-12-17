package com.floatingreels.tim_jeffrey_david_michael.model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private String imgurl;
    @NotBlank
    @NotNull
    private String category;
    @Column(columnDefinition = "text")
    @Size(min = 100, message = "give a proper description of this product")
    private String description;
    @DecimalMin(value = "0.05")
    private BigDecimal price;
    @NotNull
    private String bullpnt1, bullpnt2;
    @NotNull(message = "for which animals is this product suitable for?")
    private String suitfor;

    public Product() {
    }

    public String getBullpnt1() {
        return bullpnt1;
    }

    public void setBullpnt1(String bullpnt1) {
        this.bullpnt1 = bullpnt1;
    }

    public String getBullpnt2() {
        return bullpnt2;
    }

    public void setBullpnt2(String bullpnt2) {
        this.bullpnt2 = bullpnt2;
    }

    public String getSuitfor() {
        return suitfor;
    }

    public void setSuitfor(String suitfor) {
        this.suitfor = suitfor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    /* geschreven door Michael */

}
