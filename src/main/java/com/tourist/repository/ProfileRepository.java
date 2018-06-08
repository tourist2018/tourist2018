package com.tourist.repository;

import com.tourist.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

/**
 * Created by Ngoc Quy on 5/16/2018.
 */
@Transactional
public interface ProfileRepository extends JpaRepository<Profile, String>{

//    void deleteProfileByUserId();

    Profile findById(String id);


}
