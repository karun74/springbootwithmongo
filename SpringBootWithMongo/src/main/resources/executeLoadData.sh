#execute
cName="$1"
sed -i "s/mcName/${cName}/g" loadData.sh
sh loadData.sh