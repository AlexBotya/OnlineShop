/*
package ru.gb.onlineShop.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.gb.onlineShop.entity.User;
import ru.gb.onlineShop.repository.RoleRepository;
import ru.gb.onlineShop.repository.UserRepository;

import java.util.Optional;

@Service
@Data
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName)  {
        Optional<User> mayBeUser = userRepository.findByEmail(userName);
        if (mayBeUser.isEmpty()){
            throw new UsernameNotFoundException("User not found by passed name: " + userName);
        }
        User user = mayBeUser.get();
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(),
                user.getRoles()
                        .stream()
                        .map(role -> new SimpleGrantedAuthority(role.getName()))
                        .toList()
        );
    }
}
*/
