package note.noteservice.notes;

import org.springframework.web.bind.annotation.RestController;
import note.noteservice.notes.notesDto;
import note.noteservice.notes.notesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class notesController {
    private final notesService note;

    @PostMapping("/note")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody notesDto noteData) {
        try {
            note.createNote(noteData);
        } catch (Exception e) {
            log.error("error caught in create product");
        }
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getHomeMessage() {
        log.info("sent hello world!");
        return "hello";
    }
}
