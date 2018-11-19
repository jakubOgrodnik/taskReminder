create table "roles" (
    id bigserial not null,
    name varchar (50) not null,
    PRIMARY KEY ("id")
);
alter table users add column role_id bigint references "roles"(id);