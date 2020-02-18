package org.example.shop.service.security;

import lombok.RequiredArgsConstructor;
import org.example.shop.repository.CustomerRepository;
import org.example.shop.service.mapper.CustomerMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsManager implements UserDetailsManager {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return customerMapper.toCustomer(customerRepository.readByLogin(s).orElseThrow(
                () -> new UsernameNotFoundException("Username was not found")
        ));
    }

    @Override
    public void createUser(UserDetails userDetails) {

    }

    @Override
    public void updateUser(UserDetails userDetails) {

    }

    @Override
    public void deleteUser(String s) {

    }

    @Override
    public void changePassword(String s, String s1) {

    }

    @Override
    public boolean userExists(String s) {
        return false;
    }
}
