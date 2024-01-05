package hcmute.kltn.Backend.model.province.dto.extend;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ward {
	private String name;
	private String code;
	private String codeName;
	private String divisionType;
	private String shortCodeName;
	private int numberOfVisitor;
	private LocalDateTime updatedAt;
}
