INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('FCRUZ', 'Fernando Joel','Cruz Mateo',45784521,'fcruz@farmaciasperuanas.pe','Colaborador','2018-01-01');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('ECUMPA', 'Elwyn','Cumpa Sangama',45698523,'ecumpa@farmaciasperuanas.pe','Colaborador','2018-06-25');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('ALOZANO', 'Alina','Lozano Lara',23587458,'alozano@farmaciasperuanas.pe','Colaborador','2018-06-25');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('JDIAZ', 'Jose','Diaz Diaz',46363636,'jdiaz@farmaciasperuanas.pe','Administrador','2018-06-25');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('DPIPA', 'Daygor','Pipa Uchupe',45896541,'dpipa@farmaciasperuanas.pe','Colaborador','2018-12-10');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('BCASTANEDA', 'Berilu Stephanie','Castañeda Castro',72798809,'bcastaneda@farmaciasperuanas.pe','Colaborador','2018-03-20');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('EPONTE', 'Evert','Ponte Yujcre',25698745,'eponte@farmaciasperuanas.pe','Jefe','2018-11-20');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('CSIPAN', 'Carlos Omar','Sipan Bernal',72569845,'csipan@farmaciasperuanas.pe','Colaborador','2018-08-08');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('WLICARES', 'Wilder','Licares Mayta',41758965,'wlicares@farmaciasperuanas.pe','Colaborador','2018-09-15');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('PGOMEZ', 'Piero','Gomez Boza',46985898,'pgomez@farmaciasperuanas.pe','Colaborador','2018-05-05');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('PSANCHEZ', 'Piero','Sánchez Cabanillas',45607025,'psanchez@farmaciasperuanas.pe','Administrador','2018-02-13');
INSERT INTO usuarios (cod_usuario, nom_usuario, ape_usuario, dni_usuario,ema_usuario,rol_usuario,alt_usuario) VALUES('RCARDENAS', 'Richard Andre','Cardenas Valdivieso',45847586,'rcardenas@farmaciasperuanas.pe','Colaborador','2018-10-10');

INSERT INTO `logins` (username,password,enabled) VALUES ('PGOMEZ','$2a$10$B2HSWPUmKaizTlR/7dkmS.0yclyOrci9v9ICYVZkrRrQ7BAZSmwCq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('PSANCHEZ','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('FCRUZ','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('ECUMPA','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('DPIPA','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('BCASTANEDA','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('EPONTE','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('CSIPAN','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('WLICARES','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('RCARDENAS','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('JDIAZ','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);
INSERT INTO `logins` (username,password,enabled) VALUES ('ALOZANO','$2a$10$UslogwIUCEzXeOSpswD98uavDDgvdmavgCLBgI4zRCydS8.Y2qarq',1);

INSERT INTO `roles` (nom_rol) VALUES ('ROLE_ADMIN');
INSERT INTO `roles` (nom_rol) VALUES ('ROLE_USER');

INSERT INTO `logins_roles` (login_id,role_id) VALUES (1,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (2,1);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (3,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (4,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (5,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (6,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (7,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (8,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (9,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (10,2);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (11,1);
INSERT INTO `logins_roles` (login_id,role_id) VALUES (12,1);






