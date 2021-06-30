package com.accolite.course.repositories;

import org.springframework.data.repository.CrudRepository;

import com.accolite.course.entities.Participants;

public interface ParticipantsRepository extends CrudRepository<Participants, Long> {

	
}
