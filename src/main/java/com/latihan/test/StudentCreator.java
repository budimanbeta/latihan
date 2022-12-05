package com.latihan.test;

import com.latihan.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCreator {
    public static void main(String[] args) {
    	
    	
    	
    	
    	
    	
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student_pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Student student = new Student();
        student.setFirstName("Budiman");
        student.setLastName("Budiman");

        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }
}
