package proektDzentity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="shop")
@Getter @Setter
public class Shop extends Base_Entity{
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="specialization")
	private String specialization;
	
	@Column(name="location")
	private String location;
	
	@ManyToMany
	@JoinTable(name="shop_user", joinColumns=@JoinColumn(name="shop_id"),
	inverseJoinColumns=@JoinColumn(name="user_id"))
	private List <User> users =new ArrayList<>();
	
	@OneToMany (mappedBy="shop")
	private List <TypeOfParts> typeOfPartss=new ArrayList<>();
	
	

}
