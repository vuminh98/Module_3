create database quanlysinhvien;
create table Class(
ClassID INT not null auto_increment primary key,
ClassName varchar(60) not null,
StartDate datetime not null,
Status bit
);

create table Student(
StudentID int not null auto_increment primary key,
StudentName varchar(30) not null,
Address varchar(50),
Phone varchar(20),
Status Bit,
ClassID int not null,
foreign key (ClassID) references Class (ClassID)
);

create table Subject (
SubID int not null auto_increment primary key,
SubName varchar(30) not null,
Credit tinyint not null default 1 check (Credit >= 1),
Status bit default 1
);

create table mark(
MarkID int not null auto_increment primary key,
SubID int not null,
StudentID int not null,
Mark float default 0 check ( mark BETWEEN 0 AND 100),
ExamTimes tinyint default 1,
foreign key (SubID) references Subject (SubID),
foreign key (StudentID) references Student (StudentID)
);






