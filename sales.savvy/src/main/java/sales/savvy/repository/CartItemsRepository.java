package sales.savvy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import sales.savvy.entity.CartItem;


public interface CartItemsRepository extends JpaRepository<CartItem, Long>{
	Optional<CartItem> findByCartIdAndProdId(Long cartId, Long prodId);
}
