from flask import Flask

app = Flask(__name__)

@app.route('/api/help')
def help():
    return 'Se precisar de ajuda, entre em contato pelo Instagram: @0t001z'

if __name__ == '__main__':
    app.run(debug=True)