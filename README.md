# UpFeed
 
Authors:
    Carla Mendes
	Rafael Pereira

[] Feed with school assignments (exams, projects, teachers messages), instead of checking several websites

[] Calendar with the assignments (gets a warning 3 weeks before)

[] Grades tracker for each subject 

[] Course average grade calculator

[] Focus Zone (To Do Lists & Pomodoro sessions)

[] Subjects chats to share resources and study in group

Assignments Feed with Carla Mendes

[ ] - Decidir tecnologias (tanto para cliente como para servidor)

## Entidades

Timestamps is always necessary.

List of Entities.

- Persons (Id [PK], Email)
  - Administrators
  - Users
    - Teachers
    - Students
- Posts (Id [PK], Owner [FK - User], Room [FK - Room], Content, Documents 1-N [FK - Document], Type ['M','A','G'], Date [Nullable] //se for do Type 'A')
- Documents (Id [PK], Path, FullPath, Type)
- Channels (Id [PK], Owner [FK - User] //por exemplo Coordenador da cadeira ou Estudante, ,Title, Description, Type [Boolean] //0 - Study, 1 - Subject)
- Rooms (Id [PK], Room [FK - Channel], Title, Description)
  - StudyRoom (Id [PK])
  - SubjectRoom (Id [PK], Weight [Nullable]) //Componente TP-PL
- Grades (Id [PK], Value, Student [FK - Student], SubjectRoom [FK - SubjectRoom], Notes)
- Notes (Owner [FK - Person], Title, Description, Status [Boolean])
- RoomUsers (RoomId [PK], UserId [PK])

## Features

[ Calcular Média ]

[]
