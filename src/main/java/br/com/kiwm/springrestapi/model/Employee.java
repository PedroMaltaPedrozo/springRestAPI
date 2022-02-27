package br.com.kiwm.springrestapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data // @Getter,@Setter,@ToString
public class Employee {
    private String name; //@JsonProperties("other name").
    //@JsonIgnoreProperties //exclude sensitive properties.
    private long age;
    private String location;
    private String email;
    private String department;
}
