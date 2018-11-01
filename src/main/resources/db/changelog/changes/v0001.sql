create  table  "users" (
  id bigserial not null,
  user_name varchar (50) not null,
  password varchar (50) not null,
  email varchar (50) not null,
  primary key (id)
);

create table "task" (
  id bigserial not null,
  title varchar (50) not null,
  description text not null,
  user_id bigint not null references "users"(id),
  is_done boolean not null,
  date_of_completion DATE not null default CURRENT_DATE,
  primary key (id)
);