package com.jf.ecommerce.product.provider;

import com.jf.ecommerce.product.product.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "provider")
public class Provider {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long code;

  @NotBlank
  @Column(unique = true)
  private String id;

  @NotBlank
  @Column
  private String name;

  @NotBlank
  @Column
  private String contact;

  @Column
  private String phone;

  @Column
  private String address;

  @Email
  @NotBlank
  @Column
  private String email;

  @OneToMany(mappedBy = "provider")
  private List<Product> products;

  @CreationTimestamp
  @Column(name = "creation_date")
  private LocalDateTime creationDate;

  @UpdateTimestamp
  @Column(name = "last_Update")
  private LocalDateTime lastUpdate;

}
