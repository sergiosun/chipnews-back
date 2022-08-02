package br.com.chipnews.service;

import br.com.chipnews.dto.AddressDTO;
import br.com.chipnews.entity.AddressEntity;
import br.com.chipnews.repository.AddressRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService {

    final AddressRepository repository;
    AddressService(AddressRepository addressRepository){
        this.repository = addressRepository;
    }

    public Iterable<AddressEntity> findAll() {
        return repository.findAll();
    }

    @Transactional
    public AddressEntity save(AddressEntity address) {
            return repository.save(address);
    }

    public static boolean existsByResidence(String residence) {
        return AddressRepository.existsByResidence(residence);
    }
    public static boolean existsByDistrict(String district) {
        return AddressRepository.existsByDistrict(district);
    }
    public static boolean existsByComplement(String complement) {
        return AddressRepository.existsByComplement(complement);
    }
    public static boolean existsByNumber(Integer number) {
        return AddressRepository.existsByNumber(number);
    }

    public static Optional<AddressEntity> findById(UUID addressId) {
        return AddressRepository.findById(addressId);
    }
    @Transactional
    public void delete(AddressEntity addressEntity){
        AddressRepository.delete(addressEntity);
    }
}
