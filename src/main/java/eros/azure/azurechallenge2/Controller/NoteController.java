package eros.azure.azurechallenge2.Controller;

import eros.azure.azurechallenge2.Models.Note;
import eros.azure.azurechallenge2.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note saveNote(
            @RequestBody Note note
    ){
        return noteService.saveNote(note);
    }

    @GetMapping
    public List<Note> readRecords(){
        return noteService.findAll();
    }
}
