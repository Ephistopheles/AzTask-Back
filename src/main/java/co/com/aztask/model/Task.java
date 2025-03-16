package co.com.aztask.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks", schema = "azdata")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	private String description;

	private String status;

	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@ManyToOne
	@JoinColumn(name = "person_id", nullable = false)
	private Person person;
}