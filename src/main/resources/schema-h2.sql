drop sequence UNIVERSE_SEQ;
drop sequence CHARACTER_SEQ;

create sequence UNIVERSE_SEQ
  minvalue 1
  maxvalue 9999999999999999
  start with 1
  increment by 1;

create sequence CHARACTER_SEQ
  minvalue 1
  maxvalue 9999999999999999
  start with 1
  increment by 1;
