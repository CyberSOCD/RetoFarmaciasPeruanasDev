package com.farmaciasperuanas.springboot.backend.acceso.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmaciasperuanas.springboot.backend.acceso.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
