## О проекте

1.1 Описание

Данный проект под именем «Academic Herald» представляет собой форум для студентов IT Академии с возможностью просматривать новости, статьи, обсуждения, посты, а также публиковать их. Каждая публикация будет проходить модерацию у админов форума (кроме постов и обсуждений), после одобрения которого публикация будет размещена на форуме. 

1.2 Цель проекта

Целью проекта является создание форума, для размещения на нем объявлений и новостей, которых будет удобно и приятно просматривать, а также создавать свои статьи и посты на форуме. Продукт берет на себя роль основного источника информации, объявлений и новостей на наш форум, а также на форуме будет размещаться курс студента со всеми справочными материалами, разделами и темами с прикрепленными видеороликами. Кроме того, «Academic Herald» будет удобно и практично совмещать в себе буклет студента с расписанием занятий, формой оплаты за обучение и студенческим ID в личном кабинете. 
Таким образом, Academic Herald объединит в себе обучающую платформу, форум и MS Teams, а именно освещение новостей и мероприятий.

1.3 Аудитория

Пользователями нашего проекта станут обычные студенты IT Академии, а также менторы и ревьюверы.

1.4 Структура
  
В приложении есть пользователи с ролями (GUEST, STUDENT, REVIEWER, MENTOR, MANAGER, ADMIN), публикации с типами (ARTICLE, DISCUSSION, NEWS, POST, EVENT) и курсы с основными направалениями (JAVA, PYTHON, JAVASCRIPT, UX_DESIGN и др). Также присутствуют комментарии, категории, теги, разделы, лекции и задания к ним. Форум заточен под создание публикаций (статей, обсуждений и постов) пользователями и их регулировку администрацией форума. 

Всего 12 сущностей. Также задействован Spring Security + JWT token и авторизация через OAuth2 (Google & Github)

Ссылка на JSON postman коллекцию - 
[https://api.postman.com/collections/25576057-aeb39435-bcff-49d2-9c40-3ff1b67bca9a?access_key=PMAT-01H0MX4A5H70R7QE4388S2VDQB](https://api.postman.com/collections/25575773-dd8a5fc5-fb67-457b-8737-fefe7698360e?access_key=PMAT-01H1S33MVSSH3Q6TGYXZ76PCPB) - РАБОЧИЙ!!!!
## Установка 
2.1 Создайте новую базу данных _"yourdatabase"_ используя PgAdmin (вы можете заменить имя вашей бд "yourdatabase" на любое другое)
2.2 Добавьте в application.properties следующий код (поле "yourdatabase" измените на имя вашей новой базы данных):
```sh
server.port=9090
spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabase
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.generate-ddl=true
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create

spring.datasource.driver-class-name=org.postgresql.Driver
```
2.3 Запустите приложение в PartnershipProgramsApplication.
2.4 После первого запуска, замените ```sh spring.jpa.hibernate.ddl-auto=create field``` на ```sh spring.jpa.hibernate.ddl-auto=update```
2.5 Запустите sql insert запросы в файле V00002_insert_tables
