package br.com.kiwm.springrestapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

//@Data() // @Getter,@Setter,@ToString,@Entity,@Column
@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; //@JsonProperties("other name").
    //@JsonIgnoreProperties //exclude sensitive properties.

    private long age;

    private String email;

    private String department;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "update_at")
    private Date updateAt;
}
