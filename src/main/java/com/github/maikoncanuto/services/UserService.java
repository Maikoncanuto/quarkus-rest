package com.github.maikoncanuto.services;

import com.github.maikoncanuto.core.base.BaseService;
import com.github.maikoncanuto.models.User;
import com.github.maikoncanuto.repositories.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

import static java.util.Collections.unmodifiableList;

@ApplicationScoped
public class UserService extends BaseService {

    @Inject
    UserRepository userRepository;

    public List<User> getAll() { return unmodifiableList(userRepository.findAll()); }

    public User save(final User user) {
        return userRepository.saveAndFlush(user);
    }

    public User findById(final Integer id) {
        return userRepository.findById(id).get();
    }
}
