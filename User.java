package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
//  我不想能不能赢得爱情，既然钟情于玫瑰便敢于热情的奉送 
//  隔壁老王在炼腰
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 200,nullable = false)
    private String name;
    @Column(length = 6,nullable = true)
    private Integer age;
    
   private String address;
}
