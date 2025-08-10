package com.jf.ecommerce.product.product;

import com.jf.ecommerce.product.provider.Provider;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;


@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "product")
public class Product {

  @Id
  @UuidGenerator
  @JdbcTypeCode(SqlTypes.VARCHAR)
  private UUID uuid;

  @NotBlank
  @Column
  private String code;

  @NotBlank
  @Column
  private String description;

  @Column
  private double cost;

  @NotNull
  @Column
  private double value;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "product_category_id")
  private ProductCategory productCategory;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "provider_id")
  private Provider provider;

  @CreationTimestamp
  @Column(name = "creation_date")
  private LocalDateTime creationDate;

  @UpdateTimestamp
  @Column(name = "last_Update")
  private LocalDateTime lastUpdate;



}
