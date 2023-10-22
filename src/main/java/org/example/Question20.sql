20. DB concepts: Schema design, Inner, Outer joins, Complex SQLs, Migrations, problems with migration

1. Create a table with (ID, Phy, Chem, Maths) with ID as primary key.

create table subjects

(Id int AUTO INCREMENT,

Phy int, Chem int,

 Maths int,

primary key(Id));

2. Add another column Biology

alter table subjects

ADD COLUMN Bio int;

3. Create 4 records

 insert into subjects(Id,Phy,Chem,Maths,Bio)

values (1,70,70,70,70), (2, 70,70,70,70), (3, 70,70,70,70), (4, 70,70,70,70);

4. Change data for a record or two

update subjects set Maths = 100 where Id = 1;

select * from subjects;

5. Find the ID with the highest Phy score

select Id from subjects order by Phy DESC limit 1;

6. Find the ID with highest total score

select Id from subjects order by(Phy+Chem+Maths+Bio) DESC limit 1;

7. Ascending order based on total score

select Id from subjects order by(Phy+Chem+Maths+Bio) ASC ;

8. Descending order based on total score

select Id from subjects order by(Phy+Chem+Maths+Bio) DESC ;

9. 2nd highest Maths scorer

select Id from subjects order by Maths DESC limit 1 offset 1;