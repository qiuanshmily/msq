FROM java:8
VOLUME /tmp
RUN mkdir /app
RUN mkdir /app/logs
ADD msq-zuul-1.0-SNAPSHOT.jar /app/app.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 8320
CMD /app/runboot.sh