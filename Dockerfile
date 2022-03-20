FROM openjdk

RUN mkdir /maze

COPY ./Controleur.java /maze
COPY ./CleanMaze.java /maze
COPY ./.author.json /maze
COPY ./Lirefichier.java /maze
COPY ./fichier.txt /maze
COPY ./README.md /maze

WORKDIR /maze

CMD java Main