/*
 * Copyright (c) 2012, vsc-technologies - www.voyages-sncf.com
 * All rights reserved.
 * 
 * Les presents codes sources sont proteges par le droit d'auteur et 
 * sont la propriete exclusive de VSC Technologies.
 * Toute representation, reproduction, utilisation, exploitation, modification, 
 * adaptation de ces codes sources sont strictement interdits en dehors 
 * des autorisations formulees expressement par VSC Technologies, 
 * sous peine de poursuites penales. 
 * 
 * Usage of this software, in source or binary form, partly or in full, and of
 * any application developed with this software, is restricted to the
 * customer.s employees in accordance with the terms of the agreement signed
 * with VSC-technologies.
 */
package p.akl.gradletests;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
