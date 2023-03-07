FROM ssuperj/mssql

# ENV SA_PASSWORD todnqjrj1!
# ENV ACCEPT_EULA Y
# ENV MSSQL_PID Developer

USER root
RUN mkdir -p /usr/src/app
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN chmod +x /usr/src/app/run-initialization.sh

CMD /bin/bash ./entrypoint.sh