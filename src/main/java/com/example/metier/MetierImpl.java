package com.example.metier;

import com.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier  {

    @Autowired
    @Qualifier("dao2")
    private IDao dao;

    @Override
    public double calcul() {
        // Utilise la méthode getValue() de l'implémentation injectée de IDao
        // et multiplie le résultat par 2
        return dao.getValue() * 2;
    }
    // Setter pour l'injection par setter (alternative à l'injection par champ)
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
