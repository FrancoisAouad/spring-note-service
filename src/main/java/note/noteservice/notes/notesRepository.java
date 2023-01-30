package note.noteservice.notes;

import note.noteservice.notes.notesModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface notesRepository extends MongoRepository<notesModel, String> {

}
