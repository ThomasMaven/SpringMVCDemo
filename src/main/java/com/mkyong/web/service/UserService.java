package com.mkyong.web.service;

import com.mkyong.web.model.Kontakt;
import com.mkyong.web.model.KontaktList;
import com.mkyong.web.model.User;
import com.mkyong.web.repo.ContactDTO;
import com.mkyong.web.repo.KontaktListRepo;
import com.mkyong.web.repo.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ttomaka on 22.03.2017.
 */
@Service
public class UserService {
    @Autowired
    KontaktListRepo kontaktListRepo;

    public void saveUserContacts(UserDTO userDTO) {
        User user = new User(userDTO.getName(), userDTO.getSurname());
        for(ContactDTO contactDTO : userDTO.getContacts()) {
            Kontakt kontakt = new Kontakt(contactDTO.getTypeId(), contactDTO.getValue());
            KontaktList kontaktList = new KontaktList(user, kontakt);
            kontaktListRepo.saveKontaktList(kontaktList);
        }

    }
}
