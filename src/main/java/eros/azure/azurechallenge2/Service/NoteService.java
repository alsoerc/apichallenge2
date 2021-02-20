package eros.azure.azurechallenge2.Service;

import eros.azure.azurechallenge2.Interface.INote;
import eros.azure.azurechallenge2.Models.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private INote noteRepo;

    public Note saveNote( Note note){
        Note saved = noteRepo.save(note);
        note.setId(saved.getId());
        return saved;
    }

    public List<Note> findAll(){
        return noteRepo.findAll();
    }




}
