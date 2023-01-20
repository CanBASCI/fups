CREATE TABLE orders (
  id UUID NOT NULL,
   created_by VARCHAR(255),
   updated_by VARCHAR(255),
   created_at TIMESTAMP WITHOUT TIME ZONE,
   updated_at TIMESTAMP WITHOUT TIME ZONE,
   name VARCHAR(255),
   count INTEGER,
   status INTEGER,
   CONSTRAINT pk_orders PRIMARY KEY (id)
);

insert into orders (id, created_by, updated_by, created_at, updated_at, name, "count", status)
values ('dd4619ba-46fd-4949-8abe-f392191137eb', null, null, '2022-12-08 15:35:20.133000', null, 'deneme', 10, 2);