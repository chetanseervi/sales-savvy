package sales.savvy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class CartItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	@ManyToOne
	Cart cart;
	@ManyToOne
	Product prod;
	int quantity;
	public CartItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItems(Long id, Cart cart, Product prod, int quantity) {
		super();
		this.id = id;
		this.cart = cart;
		this.prod = prod;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartItems [id=" + id + ", cart=" + cart + ", prod=" + prod + ", quantity=" + quantity + "]";
	}

}
