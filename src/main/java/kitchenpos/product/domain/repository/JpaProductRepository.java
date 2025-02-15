package kitchenpos.product.domain.repository;

import kitchenpos.product.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaProductRepository extends ProductRepository, JpaRepository<Product, UUID> {
}
