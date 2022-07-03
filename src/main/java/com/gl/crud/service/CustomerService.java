package com.gl.crud.service;


import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;
        import com.gl.crud.repository.CustomerRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;
        import com.gl.crud.model.Customer;

@Service("customerService")
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    public List getAllCustomers() {
        List customers=new ArrayList();
        Iterable customersIterable=customerRepository.findAll();
        Iterator customersIterator=customersIterable.iterator();
        while(customersIterator.hasNext())
        {
            customers.add(customersIterator.next());
        }
        return customers;
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerRepository.findOne(id);
    }

    @Transactional
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Transactional
    public void deleteCustomer(int id) {
        customerRepository.delete(id);
    }
}