package com.vishwa.ideaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component// to creating object from dependancy itself
@Scope(value = "prototype")// it creats object only when we needs
public class hello {
    private  int age;
    private int marks;
    private String name;
    @Autowired //  for searching the objet by Type  to connect object we created int his class to spring application
    @Qualifier("laptop") // searches the object by type
    private laptop Laptop;
   public hello()
   {
       super();
       System.out.println("objet is created");
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Show()
    {
        System.out.println(name+"Hello how are you today");
      Laptop.compile();

    }
}
