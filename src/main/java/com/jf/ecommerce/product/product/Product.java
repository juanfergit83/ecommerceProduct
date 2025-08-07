package com.jf.ecommerce.product.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;


@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "product")
@Entity
public class Product {

  @Id
  @UuidGenerator()
  private UUID uuid;

  @Column
  private String code;

  @Column
  private String description;

  @Column
  private double cost;

  @Column
  private double value;


}
