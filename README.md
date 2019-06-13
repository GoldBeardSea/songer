# Songer

## Contents

Four Classes and One Interface, two html resources. Classes SongerApplication, SongerController, AlbumController, Album (this is a model).

Interface AlbumRepository.

Resources albumForm.html and allAlbums.html

### Songer Controller

The Songer controller has three routes, /hello, /capitalize/{parameter}, and /reverse?sentence={insert phrase}

### Getting started

Fork and clone the application on your local machine. Run an initialization, test the application build.
Run the server from the SongerApplication, you can then go on your local host (spring will launch on 8080 as long as the port is free.
Going to hello will return hello world in a browser. Capitalize will capitalize whatever is after the slash.
Reverse will reverse the phrase that you insert after the sentence.

#### 06/13/19 update

The application can now serve as a database for albums. Follow the above instructions for existing functionality but you can access the new features by following these following instructions:

In application properties add the route to your database name and postgres port. If you have a username and password, please add those to the application properties.

Spring boot can create the database for you if you uncomment the create line during an initial run of the server in application.properties.

You can also create it manually in psql(not recommended for ease) or postico (can also help visually inspect the dB.