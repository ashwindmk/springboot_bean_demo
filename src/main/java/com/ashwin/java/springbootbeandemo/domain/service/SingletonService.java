package com.ashwin.java.springbootbeandemo.domain.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonService {
    //@Autowired(required = true)
    //private PrototypeService prototypeService;

    //@Autowired(required = true)
    //private ApplicationContext applicationContext;

    @Autowired(required = true)
    ObjectFactory<PrototypeService> prototypeServiceObjectFactory;

    public String getDateTime() {
        // Not prototype anymore
        //return prototypeService.getDateTime();

        // Not recommended
        //return applicationContext.getBean(PrototypeService.class).getDateTime();

        return prototypeServiceObjectFactory.getObject().getDateTime();
    }
}
