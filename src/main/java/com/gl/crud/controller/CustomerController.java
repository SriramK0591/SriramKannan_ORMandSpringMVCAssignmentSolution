package com.gl.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import com.gl.crud.model.Customer;
import com.gl.crud.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = {"/","/index"})
    public String home(Model model) {
        List<Customer> list = customerService.getAllCustomers();
        model.addAttribute("list", list);
        return "index";
    }

    @RequestMapping("/customerform")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "add_customer";
    }
    /*
     * This method will save the customer object into table.
     */
    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute("customer") Customer d) {
        customerService.addCustomer(d);
        return "redirect:/index";
    }
    /*
     * This method will show the Edit Customer Page to user
     */
    @RequestMapping(value = "editcustomerform/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer", customer);
        return "update_customer";
    }
    /*
     * This method will update customer's information
     */
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public String updateCustomer(@ModelAttribute("customer") Customer d) {
        customerService.updateCustomer(d);
        return "redirect:/index";
    }
    @RequestMapping(value = "deletecustomer/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id, Model model) {
        customerService.deleteCustomer(id);
        return "redirect:/index";  //WEB-INF/views/index.jsp
    }

}
