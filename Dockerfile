FROM ubuntu:latest
LABEL authors="dspani"

ENTRYPOINT ["top", "-b"]