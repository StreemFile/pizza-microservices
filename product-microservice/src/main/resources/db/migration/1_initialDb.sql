-- auto-generated definition
create table product.product
(
	id              bigint not null
		constraint product_pkey
		primary key,
	created_at      timestamp,
	expiration_date date,
	modified_at     timestamp,
	name            varchar(255),
	product_type    integer,
	purchase_price  numeric(19, 2),
	weight          integer
);

alter table product.product
	owner to ohjrjawxatkvsc;

