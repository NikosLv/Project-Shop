package proektDzentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="sale")
@Getter @Setter
public class Sale extends Base_Entity {
	
	

	@Column(name="payment")
	private String payment;
	
	@Column(name="shipping")
	private String shipping;
	
	@Column(name="packing")
	private String packing;
	
	@ManyToMany
	@JoinTable(name="product_sale", joinColumns=@JoinColumn(name="sale_id"),
	inverseJoinColumns=@JoinColumn(name="product_id"))
	private List <Product> products =new ArrayList<>();
	

}
