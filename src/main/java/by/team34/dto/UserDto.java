
package by.team34.dto;

import java.util.HashSet;
import java.util.Set;

import by.team34.entity.Role;
import by.team34.entity.User;

public class UserDto {

	private Long id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private Set<RoleProxy> roles = new HashSet<RoleProxy>();
	private String userState;

	public UserDto(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.surname = user.getSurname();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.userState = user.getUserState().name();
		for (Role role : user.getRoles())
			roles.add(new RoleProxy(role));
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<RoleProxy> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleProxy> roles) {
		this.roles = roles;
	}

	private class RoleProxy {

		private Long id;
		private String name;

		public RoleProxy(Role role) {
			this.id = role.getId();
			this.name = role.getName();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
