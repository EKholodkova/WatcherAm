package org.example.dao;


import org.example.models.EmergencyInterruptionCase;
import org.example.models.PlannedInterruptionCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class InterruptionCaseDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public InterruptionCaseDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

//    private List<PlannedInterruptionCase> plannedInterruptions;
//    private List<EmergencyInterruptionCase> emergencyInterruptions;
//
//    {
//        plannedInterruptions = new ArrayList<>();
//        plannedInterruptions.add(new PlannedInterruptionCase("98 1st line Marash, Yerevan", "01.07.22", "02.07.22", "10:00", "15:00"));
//        plannedInterruptions.add(new PlannedInterruptionCase("121/7, Armenak Armenakyan St, Yerevan", "01.07.22", "02.07.22", "10:00", "16:00"));
//        plannedInterruptions.add(new PlannedInterruptionCase("153, Armenak Armenakyan St, Yerevan", "01.07.22", "02.07.22", "11:00", "18:00"));
//        plannedInterruptions.add(new PlannedInterruptionCase("3 Dro St, Yerevan", "01.07.22", "02.07.22", "10:00", "15:00"));
//        plannedInterruptions.add(new PlannedInterruptionCase("Geratsy Street 16/4, Yerevan", "01.07.22", "02.07.22", "09:00", "16:00"));
//        plannedInterruptions.add(new PlannedInterruptionCase("36, Antarain St, Yerevan", "01.07.22", "02.07.22", "07:00", "11:00"));
//
//
//        emergencyInterruptions = new ArrayList<>();
//        emergencyInterruptions.add(new EmergencyInterruptionCase("98 1st line Marash, Yerevan", "01.07.22", "02.07.22", "10:00", "15:00"));
//        emergencyInterruptions.add(new EmergencyInterruptionCase("Geratsy Street 16/4, Yerevan", "02.07.22", "02.07.22", "09:00", "18:00"));
//        emergencyInterruptions.add(new EmergencyInterruptionCase("99 1st line Marash, Yerevan", "01.07.22", "02.07.22", "10:00", "15:00"));
//        emergencyInterruptions.add(new EmergencyInterruptionCase("36, Antarain St, Yerevan", "01.07.22", "02.07.22", "07:00", "11:00"));
//    }

    @Transactional  //внутри метода, помеченного этой аннотацией, будет открыта транзакция hibernate
    public List<PlannedInterruptionCase> getPlanned() {
        Session session = sessionFactory.getCurrentSession();

        List<PlannedInterruptionCase> plannedInterruptions = session.createQuery("select p from PlannedInterruptionCase p", PlannedInterruptionCase.class)
                .getResultList();

        return plannedInterruptions;
    }

    @Transactional
    public List<EmergencyInterruptionCase> getEmergency() {
        Session session = sessionFactory.getCurrentSession();

        List<EmergencyInterruptionCase> emergencyInterruptions = session.createQuery("select e from EmergencyInterruptionCase e", EmergencyInterruptionCase.class)
                .getResultList();

        return emergencyInterruptions;
    }
}
