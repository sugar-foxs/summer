package com.guchunhui.serviceImp;

import com.guchunhui.mapper.CustomerMapper;
import com.guchunhui.mapper.ShoppingCarMapper;
import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by gch on 16-4-13.
 */
@Service("customerService")
public class CustomerServiceImp implements CustomerService {
    private CustomerMapper customerMapper;

    private ShoppingCarMapper shoppingCarMapper;

    public void insertCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
//        ShoppingCar shoppingCar = new ShoppingCar();
//        shoppingCar.setShoppingCarId(customer.getShoppingCarId());
//        shoppingCarMapper.insertShoppingCar(shoppingCar);
    }

    public List<Customer> findAllCustomers() {
        return customerMapper.findAllCustomers();
    }

    public void deleteCustomerById(long id) {
        customerMapper.deleteCustomerById(id);
//        shoppingCarMapper.deleteShoppingCarById(id);
    }

    public Customer findCustomerById(long id){
        return customerMapper.findCustomerById(id);
    }


    @Autowired
    public void setShoppingCarMapper(ShoppingCarMapper shoppingCarMapper) {
        this.shoppingCarMapper = shoppingCarMapper;
    }

    @Autowired
    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }
}
