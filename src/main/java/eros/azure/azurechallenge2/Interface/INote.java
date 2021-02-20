package eros.azure.azurechallenge2.Interface;

import eros.azure.azurechallenge2.Models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INote extends JpaRepository <Note, Long> {

}
