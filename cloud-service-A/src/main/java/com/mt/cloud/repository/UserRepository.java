package com.mt.cloud.repository;

import com.mt.cloud.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * author: liqm
 * 2020-04-21
 */
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
}
