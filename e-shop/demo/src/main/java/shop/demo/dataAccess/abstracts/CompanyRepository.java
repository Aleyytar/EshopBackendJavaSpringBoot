package shop.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.accounts.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
