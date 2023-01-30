package note.noteservice.notes;

import org.springframework.stereotype.Service;

import note.noteservice.notes.notesDto;
import note.noteservice.notes.notesModel;
import note.noteservice.notes.notesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class notesService {
    private final notesRepository note;

    public void createNote(notesDto notesData) {
        notesModel newNote = notesModel.builder().name(notesData.getName()).description(notesData.getDescription()).build();
        note.save(newNote);
        log.info("note has been created.", newNote.getId());
    }

}
