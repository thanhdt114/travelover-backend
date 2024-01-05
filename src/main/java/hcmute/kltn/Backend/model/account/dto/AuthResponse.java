package hcmute.kltn.Backend.model.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	private String firstName;
	private String lastName;
	private String role;
	private String avatar;
	private String email;
    private String accessToken;
}
