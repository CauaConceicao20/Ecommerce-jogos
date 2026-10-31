package services;

import dao.UsuarioDao;
import model.usuario.Usuario;

import java.util.Set;

public class UsuarioService {

    private final UsuarioDao usuarioDao = new UsuarioDao();

    public Usuario salvar(Usuario usuario) {
        return usuarioDao.inserir(usuario);
    }

    public Set<Usuario> listarTodos() {
        return usuarioDao.listarTodos();
    }
}
