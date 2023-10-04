//package dev.service;
//
//import dev.repository.CharacterRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CharacterService implements CrudService{
//
//    CharacterRepository characterRepository;
//    public CharacterService(CharacterRepository characterRepository) {
//        this.characterRepository = characterRepository;
//    }
//
//    @Override
//    public List list() {
//        return (List) characterRepository.findAll();
//    }
//
//    @Override
//    public Object create(Object o) {
//        return null;
//    }
//
//    @Override
//    public Optional get(int id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void update(Object o, int id) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//}
