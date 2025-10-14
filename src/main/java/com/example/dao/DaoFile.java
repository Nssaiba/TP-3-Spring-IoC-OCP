package com.example.dao;
// dao/DaoFile.java (180.0, profil file)

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoFile")
@Profile("file")
public class DaoFile implements IDao {
    @Override public double getValue(){ return 180.0; }
}
