docker cp users.json osboxes_mongo_1:/users.json
docker exec -it osboxes_mongo_1 mongoimport --db sample --collection User --type json --file /users.json --jsonArray