package web.dao;

import web.model.Role;

import java.util.Set;

public interface RoleDao {

    public Set<Role> getAllRoles();

    public void saveRole(Role role);

    public Role getRole(String name);
}
