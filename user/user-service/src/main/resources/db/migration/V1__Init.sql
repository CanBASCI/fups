CREATE TABLE roles (
  id UUID NOT NULL,
   name VARCHAR(255) NOT NULL,
   CONSTRAINT pk_roles PRIMARY KEY (id)
);

CREATE TABLE users (
  id UUID NOT NULL,
   name VARCHAR(255) NOT NULL,
   user_name VARCHAR(255) NOT NULL,
   password VARCHAR(255) NOT NULL,
   CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE users_role_entities (
  user_entity_id UUID NOT NULL,
   role_entities_id UUID NOT NULL
);

ALTER TABLE roles ADD CONSTRAINT uc_roles_name UNIQUE (name);

ALTER TABLE users ADD CONSTRAINT uc_users_name UNIQUE (name);

ALTER TABLE users ADD CONSTRAINT uc_users_user_name UNIQUE (user_name);

ALTER TABLE users_role_entities ADD CONSTRAINT fk_userolent_on_role_entity FOREIGN KEY (role_entities_id) REFERENCES roles (id);

ALTER TABLE users_role_entities ADD CONSTRAINT fk_userolent_on_user_entity FOREIGN KEY (user_entity_id) REFERENCES users (id);


insert into public.roles (id, name)
values ('6239ac96-1147-4a03-bafa-9a74a0051552','user');

insert into public.roles (id, name)
values ('6a22b8be-86fe-4d27-9719-3def8ac69f1a','admin');


insert into public.users (id, name, user_name, password)
values ('c579f065-9332-448c-afb7-bb68b9d70e5b','can','canba','12345');

insert into public.users (id, name, user_name, password)
values ('329df115-6cb7-4075-94b8-616cedb3ce82','burak','canbasci','12345');

insert into public.users (id, name, user_name, password)
values ('45fb66d3-35d2-4920-b15b-8691ac49e377','begum','beg','$2a$10$0ByMh9FBX7hKJIGNtgnRiOSc6VTFSymSm7.m3htjrkwt7qWvkp88e');

insert into public.users (id, name, user_name, password)
values ('b4dbca89-e795-43cc-b51f-29d8ecf21f89','casper','cas','$2a$10$T7Stsqp7pFtqS1OJhenYFurIJn47hkyb/g0g49rNaWxB7vR9r9AqG');

insert into public.users (id, name, user_name, password)
values ('7ca35d9a-6e00-408c-9627-b6af200d1bca','deneme','deneme','$2a$10$RSzPBpbxyFz199bYLkUwN.CCohIOuu2JtNcget9bWCGuSybLYRcaa');

insert into public.users (id, name, user_name, password)
values ('813beb06-2a2d-4fd6-b331-8a56392b2a12','deneme1','deneme2','$2a$10$So4gY7CSwXx9i3jG4eECcOhanoHJ9ZoYyEccKUMr45DbPtD3oygFm');


insert into users_role_entities (user_entity_id, role_entities_id)
values ('c579f065-9332-448c-afb7-bb68b9d70e5b','6239ac96-1147-4a03-bafa-9a74a0051552');

insert into users_role_entities (user_entity_id, role_entities_id)
values ('329df115-6cb7-4075-94b8-616cedb3ce82','6239ac96-1147-4a03-bafa-9a74a0051552');

insert into users_role_entities (user_entity_id, role_entities_id)
values ('45fb66d3-35d2-4920-b15b-8691ac49e377','6239ac96-1147-4a03-bafa-9a74a0051552');

insert into users_role_entities (user_entity_id, role_entities_id)
values ('b4dbca89-e795-43cc-b51f-29d8ecf21f89','6239ac96-1147-4a03-bafa-9a74a0051552');

insert into users_role_entities (user_entity_id, role_entities_id)
values ('b4dbca89-e795-43cc-b51f-29d8ecf21f89','6a22b8be-86fe-4d27-9719-3def8ac69f1a');