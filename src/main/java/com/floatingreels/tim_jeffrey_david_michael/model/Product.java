package com.floatingreels.tim_jeffrey_david_michael.model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

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
    //nodig om character limit te verhogen
    @Column(columnDefinition = "text")
    private String imgurl;
    @NotBlank
    @NotNull
    private String category;
    //nodig om character limit te verhogen
    @Column(columnDefinition = "text")
    //omschrijving moet voldoende zijn
    @Size(min = 100)
    private String description;
    @DecimalMin(value = "0.05")
    private Double price;
    @NotNull
    private String bullpnt1, bullpnt2;
    //voor welk dier is dit product geschikt
    @NotNull
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    /* geschreven door Michael */


    //zegt wanneer twee objecten identiek zijn, nodig om object uit collection te kunnen verwijderen
    //cheers, Swasse!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
