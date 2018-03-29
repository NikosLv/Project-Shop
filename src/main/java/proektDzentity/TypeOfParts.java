package proektDzentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="type_of_parts")
@Getter @Setter
public class TypeOfParts extends Base_Entity{
	
	@Column(name="typeOfTransport", length=70)
	private String typeOfTransport;
	
	@Column(name="markOfTransport", length=50)
	private String markOfTransport;
	
	@Column(name="category", length=10)
	private String category;
	
	@Column(name="groupOfPatrs", length=100)
	private String groupOfPatrs;
	
	@ManyToOne
	@JoinColumn (name="shop_id")
	private Shop shop;
	
	@OneToMany(mappedBy="typeOfParts")
	private List<Product> products = new ArrayList<>();
	
	
	
}
