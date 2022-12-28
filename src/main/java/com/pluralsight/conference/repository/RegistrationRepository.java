package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

//    we have changed the name of below list to registrationReport as it is the name of our NamedQuery now in Registration class on line 17
    List<RegistrationReport> registrationReport();
}
