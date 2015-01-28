package com.journaldev.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.journaldev.spring.model.Inventory;

@Controller
public class InventoryManagementController {

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/inventory", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public Inventory createInventory(@RequestBody Inventory inventory) {

        System.out.println(inventory.toString());
        return inventory;
    }

}
