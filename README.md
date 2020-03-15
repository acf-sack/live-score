# Live Score platform of St.Anthony's College Kandy

## Run Locally

- Clone your forked repository
    ```
    git clone https://github.com/USERNAME/live-score
    cd live-score
    ```
- Set Username and a password as environment variables
    ```
    export LIVE_USERNAME=your_username
    export LIVE_PASSWORD=your_password
    ```
- Build the project
    ```
    mvn install
    ```
- Run the generated jar file
    ```
    java -jar target/livescore.jar
    ```
- Visit your app at http://localhost:9090

## API

Since this doesn't have a GUI you have to connect it using an API client. 

### Login to the platform

```
POST /login HTTP/1.1
Host: localhost:9090
Content-Type: application/json

{
    "username": "your_username",
    "password": "your_password"
}
```

### Update scores

```
POST /update-test-match HTTP/1.1
Host: localhost:9090
Content-Type: application/json

{
    "status": "lorem ipsum",
    "teamOneFirstInning": {
        "score": 10,
        "overs": 2,
        "balls": 3,
        "playerOne": {
            "name": "Kusal Mendis",
            "isBatting": true
        },
        "playerTwo": {
            "name": "Lasith Malinga",
            "isBatting": false
        },
        "currentInning": true
    },
    "teamTwoFirstInning": {
        "score": 10,
        "overs": 50,
        "balls": 0,
        "playerOne": {
            "name": "Kusal Mendis",
            "isBatting": true
        },
        "playerTwo": {
            "name": "Lasith Malinga",
            "isBatting": false
        },
        "currentInning": false
    },
    "teamOneSecondInning": {
        "score": 0,
        "overs": 0,
        "balls": 0,
        "playerOne": {
            "name": "",
            "isBatting": true
        },
        "playerTwo": {
            "name": "",
            "isBatting": false
        },
        "currentInning": false
    },
    "teamTwoSecondInning": {
        "score": 0,
        "overs": 0,
        "balls": 0,
        "playerOne": {
            "name": "",
            "isBatting": true
        },
        "playerTwo": {
            "name": "",
            "isBatting": false
        },
        "currentInning": false
    }
}
```

### Connect to the WebSocket

A working demo can be found at `src/main/resources/static/app.js`

## How to debug?

- Run the generated jar file in debug mode.
  ```
  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar target/livescore.jar 
  ```

- Connect it with your favorite IDE

    ##### InteliJ
    - Choose `Run` > `Edit Configurations` from the menu bar.
    - Select the `+` mark in the upper lef corner to add a new configuration.
    - Choose `Remote` option.
    - Set port to `5005`
    - Hit apply
    - Run the jenerated jar file in debug mode.
        ```
        java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar target/livescore.jar 
        ``` 
    - Hit `Debug` icon or press `^ + D` to start debugging.
    
- Enjoy!

