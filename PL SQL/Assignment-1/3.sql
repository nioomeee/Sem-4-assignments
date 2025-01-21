-- Write a program to print the even numbers from 1 to 100.
declare 
    i number := 1;

begin
    for i in 1..100 loop
        if mod(i, 2) = 0 then
            dbms_output.put_line(i || ' ');
        end if;
    end loop;
end;
/