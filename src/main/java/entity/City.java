package entity;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "tbl_city")
@ToString

public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long oid;
	@Column(name = "code", unique = true)
	private int code;
	@Column(name = "name", unique = true)
	private String name;
	@OneToMany (mappedBy = "city" ,cascade = {CascadeType.PERSIST, CascadeType.MERGE}) 
	private List<Account> accountsList= new ArrayList<>();
	
 
	
	
	
}
