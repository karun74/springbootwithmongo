# $0 is the script name, $1 id the first ARG, $2 is second...
mongocontainerName="$1"
fileName="$2"
docker cp users.json ${mongocontainerName}:/${fileName}
docker exec -it $mongocontainerName mongoimport --db sample --collection User --type json --file /$fileName --jsonArray