package proektDzentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product")
@Getter @Setter
public class Product extends Base_Entity {
	
	@Column(name="nameGoods", length=200)
	private String nameGoods;
	
	@Column(name="unit", length=200)            // од.виміру
	private String unit;
	
	@Column(name="availability", length=200)    //наявність
	private String availability;
	
	@Column(name="price", columnDefinition="DECIMAL(6,2)")
	private int price;
	
	@Column(name="producer", length=50)
	private String producer;
	
	@ManyToMany
	@JoinTable(name="product_sale", joinColumns=@JoinColumn(name="product_id"),
	inverseJoinColumns=@JoinColumn(name="sale_id"))
	private List <Sale> sales = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="typeOfParts_id")
	private TypeOfParts typeOfParts;
	

}
