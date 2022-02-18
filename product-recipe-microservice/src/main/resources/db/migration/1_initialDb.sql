create table product_recipe.product_recipe
(
    id           bigint not null
        constraint product_recipe_pkey
            primary key,
    created_at   timestamp,
    modified_at  timestamp,
    name         varchar(255),
    product_type integer,
    weight       integer
);

alter table product_recipe.product_recipe
    owner to kdkznttzlkzuvh;

