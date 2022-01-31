package com.api.apirestSpringboot.service;

import com.api.apirestSpringboot.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    public Iterable<User> findAll();
    public Page<User>finALL(Pageable pageable);
    public Optional<User> findById(Long id);
    public User save(User user);
    public void deleteById(Long id);
}
