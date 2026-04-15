```
from flask import Flask, request

app = Flask(__name__)

@app.route("/update-email", methods=["POST"])
def update_email():
    user_id = request.form.get("user_id")
    new_email = request.form.get("email")

    # допустим обновление в БД
    print(f"Updating user {user_id} email to {new_email}")

    return {"status": "ok"}

if __name__ == "__main__":
    app.run(debug=True)
```


# Вопросы:

### Где здесь может быть уязвимость?
- Broken Access Control -> IDOR  
### Как её можно эксплуатировать?
- из-за отсутствия авторизации, любой желающий (в том числе и через CSRF) может юзеру переопределить почту (а потом угнать аккаунт)  
### Какие последствия?
- компрометация пользователей
### Как исправить?
- реализовать авторизацию (+CSRF токен)
