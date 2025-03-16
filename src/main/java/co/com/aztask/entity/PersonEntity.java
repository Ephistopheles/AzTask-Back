package co.com.aztask.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "persons", schema = "azdata")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id", nullable = false)
	private Integer userId;

	private String names;

	private String surnames;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	private String address;

	private String phone;

	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TaskEntity> tasks;
}

