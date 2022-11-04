package entity;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tbl_account")
@ToString

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long oid;
	@Column(name = "no", unique = true,nullable = false)
	private String accountNo;
	@Column(name = "unit",nullable = false)
	private String unit;
	@Column(name = "balance" , nullable = false)
	private double balance;
	@ManyToOne
	@JoinColumn(name = "city_oid", referencedColumnName = "oid")
	private City city;
	@ManyToOne
	@JoinColumn(name = "customer_oid", referencedColumnName = "oid")
	private Customer customer;
	@OneToMany (mappedBy = "account",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Transaction> transactionsList= new ArrayList<>();
	
	
	

}
