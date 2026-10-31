package services;

import dao.RoleDao;
import model.usuario.Role;

import java.util.Set;

public class RoleService {

    private final RoleDao roleDao = new RoleDao();

    public Role salvar(Role role) {
        return roleDao.inserir(role);
    }

    public Set<Role> listarTodas() {
        return roleDao.listarTodas();
    }
}
