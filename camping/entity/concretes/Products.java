package com.example.camping.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
Bu katmana doğrudan hiçbir katman erişemiyor . Sadece DataAccess katmanı erişebiliyor.
 */
@Data
@Entity
@Table(name = "products")
@AllArgsConstructor //Lambok kodu
@NoArgsConstructor

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Bura önemli. veri tabanı oto yapıyor demek.
    @Column(name = "product_id")
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "units_in_stock")
    private int unitsInStock;
    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

}
