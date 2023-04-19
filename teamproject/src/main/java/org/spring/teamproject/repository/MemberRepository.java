package org.spring.teamproject.repository;

import org.spring.teamproject.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {

    Optional<MemberEntity> findByEmail(String email);

    Optional<MemberEntity> findByNo(Long memberNo);

//    Optional<MemberEntity> findByUsername(String username);
}
