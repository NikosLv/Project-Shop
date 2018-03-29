package proektDzentity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter @Setter
public class User extends Base_Entity {
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="userLocation")
	private String userLocation;
	
	@Column(name="phone")
	private String phone;
	
	@ManyToMany
	@JoinTable(name="shop_user", joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="shop_id"))
	private List <Shop> shops =new ArrayList<>();
	
	

	
	

}
