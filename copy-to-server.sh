SERVER=login.mathematik.uni-marburg.de
DIR=public_html/projects/sugarj

rsync -av --exclude=".git" . $SERVER:$DIR