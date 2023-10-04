//package dev.repository;
//
//import dev.model.Character;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class CharacterRepository implements CrudRepository<Character, Long> {
//    private List<Character> characters;
//
//    @Override
//    public <S extends Character> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Character> Iterable<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<Character> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Character> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Character> findAllById(Iterable<Long> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Character character) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Character> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//}
