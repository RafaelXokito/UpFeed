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
- Posts (Id [PK], Owner [FK - User], Room [FK - Room], Content, Documents 1-N [FK - Document], Type ['M','A','G'], Date [Nullable] //se for do Type Grade (G) ou se for agendado)
- Documents (Id [PK], Path, FullPath, Type)
- Rooms (Id [PK], Owner [FK - User] //por exemplo Coordenador da cadeira ou Estudante)
  - StudyRoom
  - SubjectRoom (Weight [Nullable])
- Channels (Room [FK - Room], Owner [FK - Teacher, Nullable] //Responsavel pela componente TP/PL ou apenas um Estudante,  )
- Grades (Id [PK], Grade, Teacher [FK - Teacher], Student [FK - Student], Notes)
- Notes (Owner [FK - Person], Description)
- RoomUsers (RoomId [PK], UserId [PK])

## Features

[ Calcular Média ]

[]
