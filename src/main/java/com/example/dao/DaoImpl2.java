package com.example.dao;
// dao/DaoImpl2.java (150.0, profil dev)

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Primary
@Component("dao2")  // Déclare cette classe comme un bean Spring avec l'identifiant "dao2"
@Profile("dev")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation alternative retourne 150.0
        return 150.0;
    }
}

