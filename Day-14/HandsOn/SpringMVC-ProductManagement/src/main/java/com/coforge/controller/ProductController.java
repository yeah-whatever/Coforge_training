package com.coforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.coforge.model.Product;
import com.coforge.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/add")
    public String addPage(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, Model model) {

        boolean status = service.addProduct(product);

        if (status)
            model.addAttribute("msg", "Product Added Successfully");
        else
            model.addAttribute("msg", "Product ID Already Exists");

        return "success";
    }

    @RequestMapping("/view")
    public String view(Model model) {

        model.addAttribute("list", service.getAllProducts());

        return "viewProducts";
    }

    @RequestMapping("/search")
    public String searchPage() {
        return "searchProduct";
    }


    @PostMapping("/find")
    public String find(@RequestParam int productId, Model model) {

        Product p = service.searchProduct(productId);

        if (p != null) {
            model.addAttribute("product", p);
            return "success";
        }

        model.addAttribute("msg", "Product Not Found");
        return "error";
    }


    @RequestMapping("/update")
    public String updatePage(Model model) {

        model.addAttribute("product", new Product());

        return "updateProduct";
    }


    @PostMapping("/updateProduct")
    public String update(@ModelAttribute Product product, Model model) {

        boolean status = service.updateProduct(product);

        if (status)
            model.addAttribute("msg", "Product Updated Successfully");
        else
            model.addAttribute("msg", "Product Not Found");

        return "success";
    }


    @RequestMapping("/delete")
    public String deletePage() {
        return "deleteProduct";
    }


    @PostMapping("/deleteProduct")
    public String delete(@RequestParam int productId, Model model) {

        boolean status = service.deleteProduct(productId);

        if (status)
            model.addAttribute("msg", "Product Deleted Successfully");
        else
            model.addAttribute("msg", "Product Not Found");

        return "success";
    }
}