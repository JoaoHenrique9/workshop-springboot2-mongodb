package com.educandoweb.workshopmongo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.educandoweb.workshopmongo.domain.User;
import com.educandoweb.workshopmongo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
