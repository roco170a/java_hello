package mx.rc.api.entities;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
	private UUID _ID = new UUID(5, 5);
	private String Name = "Ejemplo";
}
