package com.example.dao;
// dao/DaoImpl.java (100.0, profil prod)

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;

@Component("dao")// Déclare cette classe comme un bean Spring avec l'identifiant "dao"
@Profile("prod")
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        // Cette implémentation retourne une valeur fixe de 100.0
        return 100.0;
    }
}
