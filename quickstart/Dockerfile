FROM alpine:3.11.3

ADD ./caddy /usr/bin/caddy
EXPOSE 80
EXPOSE 443
ENTRYPOINT ["caddy"]
CMD [ "-conf", "/etc/caddy/Caddyfile"]