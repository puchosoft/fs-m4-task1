package com.codeoftheweb.salvo;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
        private String userName;

    public Player(){}

    public Player(String email){
        this.userName = email;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String email){
        this.userName = email;
    }

}
