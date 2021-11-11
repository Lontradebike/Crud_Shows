package br.com.Shows.Crud.acoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.Shows.Crud.Model.Banda;
import br.com.Shows.Crud.Model.BandaRepositorio;
 
@Service
@Transactional
public class BandaAcoes {
    @Autowired BandaRepositorio repo;
     
    public void save(Banda banda) {
        repo.save(banda);
    }
     
    public List<Banda> listAll() {
        return (List<Banda>) repo.findAll();
    }
     
    public Banda get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
     
}