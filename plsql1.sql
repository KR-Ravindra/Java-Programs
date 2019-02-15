declare
empid number;
begin
empid:=select empid from employee1 where salary=23400;
dbms_output.put_line(empid);
end;
