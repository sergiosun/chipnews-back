package br.com.chipnews.repository;

import br.com.chipnews.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, UUID> {

    static boolean existsByResidence(String residence) {
        return false;
    }

    static boolean existsByDistrict(String district) {
        return false;
    }
    static boolean existsByComplement(String complement) {
        return false;
    }
    static boolean existsByNumber(Integer number) {
        return false;
    }
}
