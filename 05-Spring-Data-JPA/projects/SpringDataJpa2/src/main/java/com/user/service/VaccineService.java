package com.user.service;

import com.user.entity.Vaccine;
import com.user.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService implements IVaccineService{

    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public String registerVaccineInfo(Vaccine vaccine) {
        Vaccine vac = repo.save(vaccine);
        return "Vaccine registerd with Id " + vac.getId();
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines) {
        return repo.saveAll(vaccines);
    }

    @Override
    public Long countVaccines() {
        return repo.count();
    }

    @Override
    public Boolean checkVaccineAvailability(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccineInfo() {
        return repo.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccines(Iterable<Integer> ids) {
        return repo.findAllById(ids);
    }

    @Override
    public Optional<Vaccine> getVaccineById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public String removeVaccineById(Integer id) {
//       Optional<Vaccine> optional = repo.findById(id);
//       if (optional.isPresent()) {
//           repo.deleteById(id);
//           return "Record with id " + id + " is deleted";
//       } else {
//           return "Record with id " + id + " is not available to be deleted";
//       }

       boolean flag =  repo.existsById(id);
       if (flag) {
           repo.deleteById(id);
           return "Record with id " + id + " is deleted";
       }else {
           return "Record with id " + id + " is not available to be deleted";
       }
    }

    @Override
    public String removeVaccineByObject(Vaccine obj) {
        Integer id = obj.getId();
        Optional<Vaccine> optional = repo.findById(id);
       if (optional.isPresent()) {
           repo.deleteById(id);
           return "Record with id " + id + " is deleted";
       } else {
           return "Record with id " + id + " is not available to be deleted";
       }

    }

    @Override
    public String removeAllVaccines(List<Integer> ids) {
      List<Vaccine> vaccines =(List<Vaccine>) repo.findAllById(ids);
//      int count1 = ids.size();
      int count = vaccines.size();
//      if(count1 == count2) {
//          repo.deleteAllById(ids);
//          return "Vaccine info deleted for given ids";
//      }
        if (count > 0){
            repo.deleteAllById(ids);
            return "Vaccine info deleted for given ids";
        }
        return "Failed to delete vaccine info";
    }


}
