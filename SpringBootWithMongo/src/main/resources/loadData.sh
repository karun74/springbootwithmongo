# $0 is the script name, $1 id the first ARG, $2 is second...
docker cp users.json mcName:/var/users.json
docker exec -it mcName sh -c 'mongoimport --jsonArray --db sample --collection User --type json --file /var/users.json'