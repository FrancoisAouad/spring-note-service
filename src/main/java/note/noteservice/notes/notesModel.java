package note.noteservice.notes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "notes")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class notesModel {
    @Id
    private String id;
    private String name;
    private String description;
}
