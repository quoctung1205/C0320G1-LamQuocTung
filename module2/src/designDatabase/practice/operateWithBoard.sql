CREATE TABLE mysql
(
	column1 int Null,
    column2 bigint not null
);
create table contacts(
contact_id int(11) not null auto_increment,
last_name varchar(30) not null,
first_name varchar(25),
birth_day date,
constraint contacts_pk primary key (contact_id)
);
create table supplier
(
	suplier_id int(11) not null auto_increment,
    suplier_name varchar(50) not null,
    account_rep varchar(30) not null default "TBD",
    constraint suplier_pk primary key (suplier_id)
);
drop table mysql, supplier;


alter table contacts
	add new_column_name varchar(50) not null; 
    
alter table contacts
	add last_name varchar(50) not null
		after contact_id;
        
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  
ALTER TABLE contacts
  DROP COLUMN contact_type;
  
ALTER TABLE contacts
  CHANGE COLUMN contact_type ctype
    varchar(20) NOT NULL;
    
ALTER TABLE contacts
  RENAME TO people;