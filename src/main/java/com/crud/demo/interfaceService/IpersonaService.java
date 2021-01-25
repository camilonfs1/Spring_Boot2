package com.crud.demo.interfaceService;

import com.crud.demo.modelo.Persona;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface IpersonaService {
    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public int save(Persona p);
    public void delete(int id);

}
