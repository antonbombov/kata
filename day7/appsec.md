```
import pickle
from flask import Flask, request

app = Flask(__name__)

@app.route("/import", methods=["POST"])
def import_data():
    data = request.files["file"].read()
    obj = pickle.loads(data)
    return {"status": "ok", "data": str(obj)}

if __name__ == "__main__":
    app.run(debug=True)

```


# Вопросы:

### Где здесь может быть уязвимость?
### Как её можно эксплуатировать?
### Какие последствия?
### Как исправить?
