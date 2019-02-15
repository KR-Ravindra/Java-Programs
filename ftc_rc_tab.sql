Begin
for i in (select * from employee1)
loop
dbms_output.put_line(i.empid || ' ' || i.fname || ' ' ||  i.lname || ' ' || i.salary);
--dbms_output.put_line(i.salary);
end loop;
end;
