declare
id employee1.empid%type;
begin
select empid into id from employee1 where salary=28000;
dbms_output.put_line('id = ' || id);
end;
