package shop.demo.entities.concretes.accounts;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.demo.entities.abstracts.Account;
import shop.demo.entities.concretes.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="companies")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="description")
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="accountId")
	private Account account;
	
	@OneToMany(mappedBy = "company")
	private List<Product> products;

	
}
