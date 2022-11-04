package entity;



import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tbl_transaction")
@ToString

public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long oid;
	@Column(name="no",nullable = false)
	private long no;
	@Column(name="transaction_date_time")
	private LocalDate date;
	@Column
	private String type;
	@Column
	private String method;
	@Column
	private double amount;
	@ManyToOne
	@JoinColumn(name = "account_oid", referencedColumnName = "oid")
	private Account account;
	
	
	
	
	
	
}
