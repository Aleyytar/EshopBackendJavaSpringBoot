package shop.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.demo.entities.concretes.accounts.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
