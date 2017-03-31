mysql -h 127.0.0.1 -P 3306 crh_train_rescue -uroot -p
mysql -h 127.0.0.1 -P 3306 crh_train_rescue -usamsara -p123456

DROP USER 'samsara'@'172.17.0.1';
CREATE USER 'samsara'@'172.17.0.1' IDENTIFIED BY '123456';
GRANT ALL ON crh_train_rescue.* TO 'samsara'@'172.17.0.1';
GRANT ALL PRIVILEGES ON *.* TO 'samsara'@'172.17.0.1' IDENTIFIED BY '123456' WITH GRANT OPTION;

alter table train_rescue_detail modify rescue_text varchar(2000) character set utf8 collate utf8_general_ci not null;


select trainrescu0_.id as id1_2_,
  trainrescu0_.rescue_train_id as rescue_t2_2_,
  trainrescu0_.rescue_train_name as rescue_t3_2_,
  trainrescu0_.to_rescue_train_id as to_rescu4_2_,
  trainrescu0_.to_rescue_train_name as to_rescu5_2_ 
from train_rescue_view trainrescu0_ where trainrescu0_.rescue_train_id=1 and trainrescu0_.to_rescue_train_id=2