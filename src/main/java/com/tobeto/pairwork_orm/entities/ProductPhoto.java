package com.tobeto.pairwork_orm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="product_photos")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductPhoto {

    @Id
    @Column(name="photo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productPhotoId;

    @Column(name="product_photo_url")
    private String productPhotoUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

}
