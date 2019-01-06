package by.team34.security;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import by.team34.dao.UserDao;
import by.team34.entity.User;

@Service
public class MyUserDetails implements UserDetailsService {

  @Autowired
  private UserDao userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    final User user = userRepository.getUserByName(username);
    
    if (user == null) {
      throw new UsernameNotFoundException("User '" + username + "' not found");
    }
    
    return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), user.getRoles());
  }

}
