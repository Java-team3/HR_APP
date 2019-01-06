package by.team34.security;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import by.team34.entity.Role;
import by.team34.entity.User;
import by.team34.service.UserService;

@Service
public class MyUserDetails implements UserDetailsService {

  @Autowired
  private UserService userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = null;
	  List<User> users = userRepository.findAll();
	for (User i : users) {
		if (i.getName().equals(username)) {
			user = i;
			break;
		}
	}
    //final User user = userRepository.findByUsername(username);
	for (Role role : user.getRoles()) {
		System.out.println(role.getAuthority());
	}
    if (user == null) {
      throw new UsernameNotFoundException("User '" + username + "' not found");
    }
    System.out.println();
    return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), user.getRoles());
    //return (UserDetails) user;
  }

}
