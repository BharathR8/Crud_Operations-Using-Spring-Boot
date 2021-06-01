package com.example.crud_operations;

import com.example.crud_operations.models.Vaccines;
import com.example.crud_operations.repositories.VaccinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import java.util.List;
@RestController
@RequestMapping("/vaccines")
public class VaccinesController {
  @Autowired
  private VaccinesRepository repository;
 
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Vaccines> getAllVaccines() {
    return repository.findAll();
  }
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Vaccines getVaccineById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
 
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyVaccineById(@PathVariable("id") ObjectId id, @Valid @RequestBody Vaccines vaccines) {
    vaccines.set_id(id);
    repository.save(vaccines);
  }
 
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Vaccines createVaccine(@Valid @RequestBody Vaccines vaccines) {
    vaccines.set_id(ObjectId.get());
    repository.save(vaccines);
    return vaccines;
  }
 
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteVaccine(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
  
}